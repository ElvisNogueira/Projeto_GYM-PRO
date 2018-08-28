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
import model.Dobras_Cutaneas;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class Dobras_CutaneasDao {
    private PreparedStatement statement;
    
   public void cadastrar(Dobras_Cutaneas c){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_DOBRAS_CUTANEAS);
            
            statement.setFloat(1, c.getPeitoral());
            statement.setFloat(2, c.getAxilar_media());
            statement.setFloat(3, c.getAbdominal());
            statement.setFloat(4, c.getCoxa());
            statement.setFloat(5, c.getBicipita());
            statement.setFloat(6, c.getSupra_iliaca());
            statement.setFloat(7, c.getSubscapular());
            statement.setFloat(8, c.getTricipital());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar dobras cutânea!\n"+ex.getMessage());
        }
        
        
   }
   
   public void editar(Dobras_Cutaneas c){
       try {
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_DOBRAS_CUTANEAS);
            
            statement.setFloat(1, c.getPeitoral());
            statement.setFloat(2, c.getAxilar_media());
            statement.setFloat(3, c.getAbdominal());
            statement.setFloat(4, c.getCoxa());
            statement.setFloat(5, c.getBicipita());
            statement.setFloat(6, c.getSupra_iliaca());
            statement.setFloat(7, c.getSubscapular());
            statement.setFloat(8, c.getTricipital());
            statement.setInt(9, c.getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar dobras cutânea!\n"+ex.getMessage());
        }
   } 
   
   public void excluir(Dobras_Cutaneas c){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_DOBRAS_CUTANEAS);
            statement.setInt(1, c.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
   } 
   
   public Dobras_Cutaneas getById(int id){
        ResultSet result; 
        boolean b;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_DOBRAS_CUTANEAS);
            statement.setInt(1, id);
            result = statement.executeQuery();
            b = result.next();
            System.out.println(b);
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(Dobras_CutaneasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return null;
   }
   
   private Dobras_Cutaneas get(ResultSet result){
       Dobras_Cutaneas d = new Dobras_Cutaneas();
       
        try {
            d.setId(result.getInt(1));
            d.setPeitoral(result.getFloat(2));
            d.setAxilar_media(result.getFloat(3));
            d.setAbdominal(result.getFloat(4));
            d.setCoxa(result.getFloat(5));
            d.setBicipita(result.getFloat(6));
            d.setSupra_iliaca(result.getFloat(7));
            d.setSubscapular(result.getFloat(8));
            d.setTricipital(result.getFloat(9));
        } catch (SQLException ex) {
            Logger.getLogger(Dobras_CutaneasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return d;
   }
}
