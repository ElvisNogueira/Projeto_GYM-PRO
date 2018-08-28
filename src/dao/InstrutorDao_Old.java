/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
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
public class InstrutorDao_Old {
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
    public void excluir(Instrutor i){}
    public Instrutor getById(int id){return null;}
    public Instrutor getByIdFunc(int func_id){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.SELECT_INSTRUTOR_BY_ID_FUNCIONARIO);
        } catch (Exception ex) {
            Logger.getLogger(InstrutorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }
    public Instrutor getByCREF(int cref){return null;}
    public ArrayList<Instrutor> getAll(){return null;}
}
