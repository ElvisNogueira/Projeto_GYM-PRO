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
import model.Pagamento;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class PagamentoDao {
    private PreparedStatement statement;
    
    public void cadastrar(Pagamento p){
        try {
//            valor,descricao,data,dataVenc,formaPag,aluno_id,funcionario_id
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_PAGAMENTO);
            
            statement.setFloat(1, p.getValor());
            statement.setString(2, p.getDescricao());
            statement.setDate(3, p.getData());
            statement.setDate(4, p.getDataVenc());
            statement.setString(5, p.getFormaPag());
            statement.setInt(6, p.getAluno().getId());
            statement.setInt(7, p.getFuncionario().getId());
            
            statement.execute();
        } catch (Exception ex) {
            
        }
        
    }
    public void editar(Pagamento p){}
    public void excluir(Pagamento p){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_PAGAMENTO);
            statement.setInt(1, p.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Pagamento getById(int id){return null;}
    
    public ArrayList<Pagamento> getAll(){
        ResultSet result;
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_PAGAMENTOS);
            result = statement.executeQuery();
            while(result.next())
                pagamentos.add(get(result));
            return  pagamentos;
        } catch (Exception ex) {
            Logger.getLogger(PagamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private Pagamento get(ResultSet result){
        Pagamento p = new Pagamento();
        
        try {
            p.setId(result.getInt(1));
            p.setValor(result.getFloat(2));
            p.setDescricao(result.getString(3));
            p.setData(result.getDate(4));
            p.setDataVenc(result.getDate(5));
            p.setFormaPag(result.getString(6 ));
            p.setAluno(Fachada.getInstance().getByIdAluno(result.getInt(7)));
            p.setFuncionario(Fachada.getInstance().getByIdFuncionario(result.getInt(8)));
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
}
