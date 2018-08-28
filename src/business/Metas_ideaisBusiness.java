/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.Metas_ideaisDao;
import model.Metas_ideais;

/**
 *
 * @author Elvis
 */
public class Metas_ideaisBusiness {
    private Metas_ideaisDao dao;

    public Metas_ideaisBusiness() {
        dao=new Metas_ideaisDao();
    }
    
    public void cadastrar(Metas_ideais m){
        dao.cadastrar(m);
    }    
    
    public void editar(Metas_ideais m){
        dao.editar(m);
    }
    
    public void excluir(Metas_ideais m){
        dao.excluir(m);
    }
    
    public Metas_ideais getById(int id) {
        return dao.getById(id);
    }
}
