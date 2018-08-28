/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.PagamentoDao;
import java.util.ArrayList;
import model.Pagamento;

/**
 *
 * @author Elvis
 */
public class PagamentoBusiness {
    private PagamentoDao dao;

    public PagamentoBusiness() {
        dao=new PagamentoDao();
    }
    
    public void cadastrar(Pagamento p){
        dao.cadastrar(p);
    }
    
    public void editar(Pagamento p){
        dao.editar(p);
    }
    
    public void excluir(Pagamento p){
        dao.excluir(p);
    }
    
    public Pagamento getById(int id){
        return dao.getById(id);
    }
    
    public ArrayList<Pagamento> getAll(){
        return dao.getAll();
    }
    
       
}
