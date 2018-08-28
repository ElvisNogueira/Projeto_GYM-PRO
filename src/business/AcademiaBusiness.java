/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.AcademiaDao;
import model.Academia;

/**
 *
 * @author Elvis
 */
public class AcademiaBusiness {
    private AcademiaDao dao;

    public AcademiaBusiness() {
        dao = new AcademiaDao();
    }
    
    public Academia cadastrar(Academia a){
        return dao.cadastrar(a);
    }
    
    public Academia editar(Academia a){
        return dao.editar(a);
    }
    
    public Academia getById(int id){
        return dao.getById(id);
    }
    
}
