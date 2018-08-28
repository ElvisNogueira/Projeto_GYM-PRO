/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.Dobras_CutaneasDao;
import model.Dobras_Cutaneas;

/**
 *
 * @author Elvis
 */
public class Dobras_cutaneasBusiness {
    Dobras_CutaneasDao dao;
    public Dobras_cutaneasBusiness() {
        dao = new Dobras_CutaneasDao();
    }
    
    
    
    public void cadastrar(Dobras_Cutaneas d){
        dao.cadastrar(d);
    }
    
    public void editar(Dobras_Cutaneas d){
        dao.editar(d);
    }
    
    public void excluir(Dobras_Cutaneas d){
       dao.excluir(d); 
    }
    
    public Dobras_Cutaneas getById(int id){
        return dao.getById(id);
    }
}
