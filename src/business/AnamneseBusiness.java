/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.AnamneseDao;
import model.Anamnese;

/**
 *
 * @author Elvis
 */
public class AnamneseBusiness {
    private AnamneseDao dao;

    public AnamneseBusiness() {
        dao = new AnamneseDao();
    }
    
    public void cadastrar(Anamnese a){
        dao.cadastrar(a);
    }
    
    public void editar(Anamnese a){
        dao.editar(a);
    }
    
    public void excluir(Anamnese a){
        dao.excluir(a);
    }
    
    public Anamnese getById(int id){
        return dao.getById(id);
    }
}
