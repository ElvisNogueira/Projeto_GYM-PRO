/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import projeto_gym.pro.Projeto_GYMPRO;
import fachada.Fachada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Instrutor;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class InstrutorDao {
    private PreparedStatement statement;
    
    public void cadastrar(Instrutor i){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_INSTRUTOR);
//            (cref,funcionario_id)
            statement.setInt(1, i.getCref());
            statement.setInt(2, SQLUtil.getLastIdTabela("funcionario"));
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Instrutor!");
        }
    }
    public void editar(Instrutor i){}
    
    public void excluir(Instrutor i){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_INSTRUTOR);
            statement.setInt(1, i.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Instrutor getById(int id){
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_INSTRUTOR);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(InstrutorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public Instrutor getByIdFunc(int func_id){
        ResultSet result;
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.SELECT_INSTRUTOR_BY_ID_FUNCIONARIO);
            statement.setInt(1, func_id);
            result=statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao selecionar instrutor!"+ex.getMessage());
        }
        return null;
    }
    public Instrutor getByCREF(int cref){return null;}
    public ArrayList<Instrutor> getAll(){return null;}
    
    public Instrutor get(ResultSet result){
        Instrutor instrutor=new Instrutor();
        try {
            instrutor.setId(result.getInt(1));
            instrutor.setCref(result.getInt(2));
            instrutor.setFuncionario(Fachada.getInstance().getByIdFuncionario(result.getInt(3)));//Quando fizer o select de Funcionario por ID preencher o obj
        } catch (SQLException ex) {
            Mensagem.exibirMensagem("Erro ao pegar Instrutor!"+ex.getMessage());
        }
        return instrutor; 
    }
}
