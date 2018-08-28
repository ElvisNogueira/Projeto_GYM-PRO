/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.PerimetriaDao;
import model.Perimetria;

/**
 *
 * @author Elvis
 */
public class PerimetriaBusiness {
    private PerimetriaDao dao;

    public PerimetriaBusiness() {
        dao=new PerimetriaDao();
    }
    
    public void  cadastrar(Perimetria p){
        dao.cadastrar(p);
    }
    
    public void  editar(Perimetria p){
        dao.editar(p);
    }
    
    public void  excluir(Perimetria p){
        dao.excluir(p);
    }
    
    public Perimetria  getById(int id){
        return dao.getById(id);
    }
    
    
    
}
