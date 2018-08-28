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
import model.Composicao_corporal;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class Composicao_corporalDao {
    private PreparedStatement statement;
    
    public void cadastrar(Composicao_corporal c){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_COMPOSICAO_CORPORAL);
            
            statement.setFloat(1, c.getPeso_gorda());
            statement.setFloat(2, c.getPeso_magra());
            statement.setFloat(3, c.getImc());
            statement.setFloat(4, c.getRcq());
            statement.setFloat(5, c.getPorcentual_gordura());
            statement.setFloat(6, c.getPressao_arterial());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Composição Corporal\n"+ex.getMessage());
        }
    }
    
    public void editar(Composicao_corporal c){
         try {
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_COMPOSICAO_CORPORAL);
            
            statement.setFloat(1, c.getPeso_gorda());
            statement.setFloat(2, c.getPeso_magra());
            statement.setFloat(3, c.getImc());
            statement.setFloat(4, c.getRcq());
            statement.setFloat(5, c.getPorcentual_gordura());
            statement.setFloat(6, c.getPressao_arterial());
            statement.setInt(7, c.getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar Composição Corporal\n"+ex.getMessage());
        }
    }
    
    public void excluir(Composicao_corporal c){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_COMPOSICAO_CORPORAL);
            statement.setInt(1, c.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Composicao_corporal getById(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_COMPOSICAO_CORPORAL);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(Composicao_corporalDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private Composicao_corporal get(ResultSet result){
        Composicao_corporal c = new Composicao_corporal();
        
        try {
            c.setId(result.getInt(1));
            c.setPeso_gorda(result.getFloat(2));
            c.setPeso_magra(result.getFloat(3));
            c.setImc(result.getFloat(4));
            c.setRcq(result.getFloat(5));
            c.setPorcentual_gordura(result.getFloat(6));
            c.setPressao_arterial(result.getFloat(7));
        } catch (SQLException ex) {
            Logger.getLogger(Composicao_corporalDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
