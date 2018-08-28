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
import model.FichaExercicio;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class FichaExercicioDao {
    private PreparedStatement statement;
    
    public void cadastrar(FichaExercicio f){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_FICHA_EXERCICIO);
            statement.setInt(1, f.getRepeticoes());
            statement.setInt(2, f.getOrdem());
            statement.setString(3, f.getDia());
            statement.setInt(4, f.getExercicio().getId());
            statement.setInt(5, SQLUtil.getLastIdTabela("ficha_de_treino"));
            statement.setInt(6, f.getSerie());
            
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            
            Mensagem.exibirMensagem("Erro ao cadastrar em Ficha_Exercicio!\n"+ex.getMessage());
        }
    }
    public void excluir(FichaExercicio f){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_FICHA_EXERCICIO);
            statement.setInt(1, f.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editar(FichaExercicio f){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_FICHA_EXERCICIO);
            statement.setInt(1, f.getRepeticoes());
            statement.setInt(2, f.getOrdem());
            statement.setString(3, f.getDia());
            statement.setInt(4, f.getExercicio().getId());
            statement.setInt(5, f.getFichaDeTreino());
            statement.setInt(6, f.getSerie());
            statement.setInt(7, f.getId());

            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
            
            Mensagem.exibirMensagem("Erro ao editar em Ficha_Exercicio!\n"+ex.getMessage());
        }
    }
    public ArrayList<FichaExercicio> getByIdFichaTreino(int id){
        ResultSet result;
        ArrayList<FichaExercicio> fichaExercicios = new ArrayList<>();
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_FICHA_TREINO_FICHAEXERCICIO);
            statement.setInt(1, id);
            result = statement.executeQuery();
            
            while (result.next())               
                fichaExercicios.add(get(result));
            return fichaExercicios;
        } catch (Exception ex) {
            Logger.getLogger(FichaExercicioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    private FichaExercicio get(ResultSet result){
        FichaExercicio f = new FichaExercicio();
        
        try {
            f.setId(result.getInt(1));
            f.setRepeticoes(result.getInt(2));
            f.setOrdem(result.getInt(3));
            f.setDia(result.getString(4));
            f.setSerie(result.getInt(5));
            f.setExercicio(Fachada.getInstance().getByIdExercicio(result.getInt(6)));
            f.setFichaDeTreino(result.getInt(7));
        } catch (SQLException ex) {
            Logger.getLogger(FichaExercicioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    
    
    
    
    
}
