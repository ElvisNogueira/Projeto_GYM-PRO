/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conta;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class ContaDao {
    private PreparedStatement statement;
    
    public void cadastrar(Conta c){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_CONTAS);
            
            statement.setString(1, c.getDescricao());
            statement.setString(2, c.getTipo());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar conta!");
        }
    }
    
    public void editar(Conta c){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_CONTA);
            
            statement.setString(1, c.getDescricao());
            statement.setString(2, c.getTipo());
            statement.setInt(3, c.getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar conta!");
        }
    }
    
    public void excluir(Conta c){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_CONTAS);
            statement.setInt(1, c.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Conta getById(int id){
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_CONTA_BY_ID);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(ContaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public ArrayList<String> getAllNomeContas(){
        ResultSet result;
        ArrayList<String> contas = new ArrayList<>();
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_CONTA_ALL_NOMES);
            result=statement.executeQuery();
            while (result.next()) {                
                contas.add(result.getString(1));
            }
            return contas;
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao pegar nome das contas!\n"+ex.getMessage());
        }
        
        return contas;
    }
    
    public ArrayList<Conta> getAllContas(){
        ResultSet result;
        ArrayList<Conta> contas = new ArrayList<>();
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_CONTA);
            result=statement.executeQuery();
            while (result.next()) {                
                contas.add(get(result));
            }
            return contas;
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao pegar nome das contas!\n"+ex.getMessage());
        }
        
        return contas;
    }
    
    public Conta getByNome(String nome){
        ResultSet result;
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.SELECT_CONTA_BY_NOME);
            statement.setString(1, nome);
            result=statement.executeQuery();
            
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao pegar Conta pelo nome!");
        }
        return null;
    }
    public Conta getByData(Calendar c){return null;}
    
    private Conta get(ResultSet result){
        Conta c = new Conta();
        
        try {
            c.setId(result.getInt(1));
            c.setDescricao(result.getString(2));
            c.setTipo(result.getString(3));
            return c;
        } catch (SQLException ex) {
            Mensagem.exibirMensagem("Erro ao pegar Conta!");
        }
        return c;        
    }
}
