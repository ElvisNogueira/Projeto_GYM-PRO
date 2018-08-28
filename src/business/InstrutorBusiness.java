/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.InstrutorDao;
import java.util.ArrayList;
import model.Instrutor;

/**
 *
 * @author Elvis
 */
public class InstrutorBusiness {
    private InstrutorDao dao;

    public InstrutorBusiness() {
        dao=new InstrutorDao();
    }
    
    public void cadastrar(Instrutor i){
        dao.cadastrar(i);
    }
    
    public void editar(Instrutor i){
        dao.editar(i);
    }
    
    public void excluir(Instrutor i){
        dao.excluir(i);
    }
    
    public Instrutor getById(int id) {
        return dao.getById(id);
    }
    
    public Instrutor getByIdFunc(int func_id){
        return dao.getByIdFunc(func_id);
    }
    
    public ArrayList<Instrutor> getAll() {
        return dao.getAll();
    }
}
