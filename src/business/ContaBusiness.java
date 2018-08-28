/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ContaDao;
import fachada.Fachada;
import java.util.ArrayList;
import java.util.Calendar;
import model.Conta;

/**
 *
 * @author Elvis
 */
public class ContaBusiness {
    ContaDao dao;

    public ContaBusiness() {
        dao = new ContaDao();
    }
    
    public void cadastrar(Conta c){
        dao.cadastrar(c);
    }
    
    public void editar(Conta c){
        dao.editar(c);
    }
    
    public void excluir(Conta c){
        dao.excluir(c);
    }
    
    public Conta getById(int id){
        return dao.getById(id);
    }
    
    public Conta getByNome(String nome){
        return dao.getByNome(nome);
    }
    
    public Conta getByData(Calendar c){
        return dao.getByData(c);
    }
    
    public ArrayList<String> getAllNomeContas(){      
        return dao.getAllNomeContas();
    }
    
    public ArrayList<Conta> getAllContas(){      
        return dao.getAllContas();
    }
    
    public ArrayList<Conta> getBusca(String busca, String combobox){
        ArrayList<Conta> contas = new ArrayList<>();
        
        if((combobox).equals("Todos")){
            for(Conta c : Fachada.getInstance().getAllContas()){
                if(c.getDescricao().toLowerCase().toLowerCase().trim().contains(busca))
                    contas.add(c);
            }
        }else{
            for(Conta c : Fachada.getInstance().getAllContas()){
                if(c.getDescricao().toLowerCase().trim().contains(busca) && c.getTipo().equals(combobox))
                    contas.add(c);
            }            
        }
        return contas;
    }
}
