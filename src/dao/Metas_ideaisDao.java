/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Metas_ideais;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class Metas_ideaisDao {
    private PreparedStatement statement;
    
    public void cadastrar(Metas_ideais m){
        try {
            //        (peso,imc,nivel,porcentual_gordura)
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_METAS_IDEAIS);
            statement.setFloat(1, m.getPeso());
            statement.setFloat(2, m.getImc());
            statement.setString(3, m.getNivel());
            statement.setFloat(4, m.getPorcentual_gordura());
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar metas ideais!\n"+ex.getMessage());
        }
        
    }
    
    public void editar(Metas_ideais m){
        try {
            //        (peso,imc,nivel,porcentual_gordura)
            statement = SQLUtil.prepareStatement(SQLUtil.UPDATE_METAS_IDEAIS);
            statement.setFloat(1, m.getPeso());
            statement.setFloat(2, m.getImc());
            statement.setString(3, m.getNivel());
            statement.setFloat(4, m.getPorcentual_gordura());
            statement.setInt(5, m.getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar metas ideais!\n"+ex.getMessage());
        }
    }
    
    public void excluir(Metas_ideais m){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_METAS_IDEAIS);
            statement.setInt(1, m.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Metas_ideais getById(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_METAS_IDEAIS);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(Metas_ideaisDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private Metas_ideais get(ResultSet result){
        Metas_ideais m = new Metas_ideais();
        
        try {
            m.setId(result.getInt(1));
            m.setPeso(result.getFloat(2));
            m.setImc(result.getFloat(3));
            m.setNivel(result.getString(4));
            m.setPorcentual_gordura(result.getFloat(5));
        } catch (SQLException ex) {
            Logger.getLogger(Metas_ideaisDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }
}
