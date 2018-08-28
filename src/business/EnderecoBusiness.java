/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.EnderecoDao;
import model.Endereco;

/**
 *
 * @author Elvis
 */
public class EnderecoBusiness {
    EnderecoDao dao;

    public EnderecoBusiness() {
        dao = new EnderecoDao();
    }
    
    public void cadastrar(Endereco e){
        dao.cadastrar(e);
    }
    
    public void editar(Endereco e){
        dao.editar(e);
    }
    
     public void excluir(Endereco e){
        dao.excluir(e);
    }
     
    public Endereco getById(int i){
        return dao.getById(i);
    }
    
}
