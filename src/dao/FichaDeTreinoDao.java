/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fachada.Fachada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FichaDeTreino;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class FichaDeTreinoDao {
    private PreparedStatement statement;
    
    public void cadastrar(FichaDeTreino f){
        try {
            //        ficha_de_treino (instrutor_id,aluno_id) objetivo,observacao,data,dataReavaliacao
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_FICHA_DE_TREINO);
            statement.setInt(1, f.getInstrutor().getId());
            statement.setInt(2, f.getAluno().getId());
            statement.setString(3, f.getObg());
            statement.setString(4, f.getObs());
            statement.setDate(5, f.getData());
            statement.setDate(6, f.getDataReavaliacao());
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Ficha de Treino");
        }   
    }
    public void editar(FichaDeTreino f){
        try {
//            objetivo=?,"
//            + "observacao=?,data=?,dataReavaliacao=? 
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_FICHA_DE_TREINO);
            statement.setInt(1, f.getInstrutor().getId());
            statement.setInt(2, f.getAluno().getId());
            statement.setString(3, f.getObg());
            statement.setString(4, f.getObs());
            statement.setDate(5, f.getData());
            statement.setDate(6, f.getDataReavaliacao());
            statement.setInt(7, f.getId());
            statement.execute();
            Mensagem.exibirMensagem("Ficha de Treino editada com sucesso!");

        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar Ficha de Treino");
        } 
    }
    public void excluir(FichaDeTreino f){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_FICHA_DE_TREINO);
            statement.setInt(1, f.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public FichaDeTreino getById(int id){
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_FICHA_TREINO);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(FichaDeTreinoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public ArrayList<FichaDeTreino> getByAlunoId(int id){
        ResultSet result;
        ArrayList<FichaDeTreino> fichaDeTreinos = new ArrayList<>();
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ALUNO_FICHA_TREINO);
            statement.setInt(1, id);
            result = statement.executeQuery();
            while (result.next()) {                
               fichaDeTreinos.add(get(result));
            }
            return fichaDeTreinos;
        } catch (Exception ex) {
            Logger.getLogger(FichaDeTreinoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    private FichaDeTreino get(ResultSet result){
        FichaDeTreino f = new FichaDeTreino();
        try {
            f.setId(result.getInt(1));
            f.setExercicios(Fachada.getInstance().getFichaExercByIdFichaTreino(f.getId()));
            f.setInstrutor(Fachada.getInstance().getByIdInstrutor(result.getInt(2)));
            f.setAluno(Fachada.getInstance().getByIdAluno(result.getInt(3)));
            f.setObg(result.getString(4));
            f.setObs(result.getString(5));
            f.setData(result.getDate(6));
            f.setDataReavaliacao(result.getDate(7));
            
        } catch (SQLException ex) {
            Logger.getLogger(FichaDeTreinoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
}
