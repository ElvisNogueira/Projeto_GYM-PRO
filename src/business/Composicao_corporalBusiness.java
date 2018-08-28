/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.Composicao_corporalDao;
import model.Composicao_corporal;



/**
 *
 * @author Elvis
 */
public class Composicao_corporalBusiness {
    Composicao_corporalDao dao;
    
    public Composicao_corporalBusiness(){
        this.dao = new Composicao_corporalDao();
    }
    
    public void cadastrar(Composicao_corporal c){
        dao.cadastrar(c);
    }
    
    public void editar(Composicao_corporal c){
        dao.editar(c);
    }
    
    public void excluir(Composicao_corporal c){
        dao.excluir(c);
    }
    
    public Composicao_corporal getById(int id){
        return dao.getById(id);
    }
}
