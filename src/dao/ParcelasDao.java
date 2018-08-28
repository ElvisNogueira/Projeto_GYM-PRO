/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fachada.Fachada;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import model.Parcelas;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class ParcelasDao {
    private PreparedStatement statement;
    
    public void cadastrar(Parcelas p){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_PARCELAS);
            statement.setDate(1, p.getData_de_Vencimento());
            statement.setFloat(2, p.getValor());
            statement.setString(3, p.getStatus());
            statement.setInt(4, p.getAlunos().getId());
            statement.setInt(5, p.getConta().getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar parcela\n"+ex.getMessage());
        }
    }
    public void editar(Parcelas p){
        try {
//            data_de_vencimento=?,valor=?,status=?,aluno_id=? where id=?
            statement = SQLUtil.prepareStatement(SQLUtil.UPDATE_PARCELAS);
            statement.setDate(1, p.getData_de_Vencimento());
            statement.setFloat(2, p.getValor());
            statement.setString(3, p.getStatus());
            statement.setInt(4, p.getAlunos().getId());
            statement.setInt(5, p.getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar parcela\n"+ex.getMessage());
        }
    }
    
    public Parcelas getById(int id){
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_PARCELAS);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    public ArrayList<Parcelas> getAll(){
        ResultSet result;
        ArrayList<Parcelas> parcelas = new ArrayList<>();
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_PARCELAS);
            result = statement.executeQuery(); 
            while (result.next())              
                parcelas.add(get(result));
            return parcelas;
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<Parcelas> getAllById(int id){
        ArrayList<Parcelas> parcelas = new ArrayList<>();
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_PARCELAS_BY_ID);
            statement.setInt(1, id);
            result = statement.executeQuery();
            
            while (result.next())
                parcelas.add(get(result));
            return parcelas;
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return parcelas;
    }
    
    public boolean verificarParcela(Parcelas p){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.VERIFICAR_PARCELA);
            statement.setInt(1, p.getAlunos().getId());
            statement.setDate(2, p.getData_de_Vencimento());

            result = statement.executeQuery();
            
            if(!result.next()){
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void excluir(Parcelas p){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_PARCELAS);
            statement.setInt(1, p.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void pagarParcela(Aluno a, Date d){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.UPDATE_PAGAR_PARCELA);
            statement.setInt(1, a.getId());
            statement.setDate(2, d);
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Parcelas getVencerPlano(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_PARCELA_ALUUNO_VENCER);
            statement.setInt(1, id);
            result = statement.executeQuery();
            if(result.next())
                return get(result);
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
    
    public void atualizarParcelasAtrasadas(){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.UPDATE_PARCELAS_ATRASADAS);
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<Parcelas> getParcelasVencidas(){
        ArrayList<Parcelas> parcelas = new ArrayList<>();
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_PARCELAS_ATRASADAS);
            result = statement.executeQuery();
            while(result.next())
                parcelas.add(get(result));
        } catch (Exception ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parcelas;
    }
    
    
    private Parcelas get(ResultSet result){
        Parcelas p = new Parcelas();
       
        try {
            p.setId(result.getInt(1));
            p.setData_de_Vencimento(result.getDate(2));
            p.setValor(result.getInt(3));
            p.setStatus(result.getString(4));
            p.setAlunos(Fachada.getInstance().getByIdAluno(result.getInt(5)));
            p.setConta(Fachada.getInstance().getByIdConta(result.getInt(6)));
            
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(ParcelasDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
}
