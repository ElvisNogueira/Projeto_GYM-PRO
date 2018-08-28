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
import model.Aluno;
import model.Endereco;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class EnderecoDao {
   private PreparedStatement statement;
    
   public void cadastrar(Endereco e){
       try {
           statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_ENDERECO);

            statement.setString(1, e.getBairro());
            statement.setString(2, e.getUf());
            statement.setString(3, e.getCidade());
            statement.setString(4, e.getCep());
            statement.setString(5, e.getLogradouro());
            statement.setInt(6, e.getNum());
            
            statement.execute();
       } catch (Exception ex) {
           Mensagem.exibirMensagem("Erro ao cadastrar endereço!\n"+ex.getMessage());
       }
   }  
   public void editar(Endereco e){
    try {
           statement = SQLUtil.prepareStatement(SQLUtil.UPDATE_ENDERECO);

            statement.setString(1, e.getBairro());
            statement.setString(2, e.getUf());
            statement.setString(3, e.getCidade());
            statement.setString(4, e.getCep());
            statement.setString(5, e.getLogradouro());
            statement.setInt(6, e.getNum());
            statement.setInt(7, e.getId());
            
            statement.execute();
       } catch (Exception ex) {
           Mensagem.exibirMensagem("Erro ao editar endereço!\n"+ex.getMessage());
       }
   }
   public void excluir(Endereco c){
       try {
           statement = SQLUtil.prepareStatement(SQLUtil.DELETE_ENDERECO);
           statement.setInt(1, c.getId());
       } catch (Exception ex) {
           Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public Endereco getById(int id){
        ResultSet result;
        try {
           statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_ENDERECO);
           statement.setInt(1, id);
           
           result = statement.executeQuery();
           result.next();
           return get(result);
       } catch (Exception ex) {
           Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }
   
   public Endereco get(ResultSet result){
       Endereco e = new Endereco();
       
       try {
           e.setId(result.getInt(1));
           e.setBairro(result.getString(2));
           e.setUf(result.getString(3));
           e.setCidade(result.getString(4));
           e.setCep(result.getString(5));
           e.setLogradouro(result.getString(6));
           e.setNum((result.getInt(7)));
           
           return e;
       } catch (SQLException ex) {
           Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       return null;
   }
}
