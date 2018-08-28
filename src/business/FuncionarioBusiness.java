/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.FuncionarioDao;
import fachada.Fachada;
import java.util.ArrayList;
import model.Funcionario;

/**
 *
 * @author Elvis
 */
public class FuncionarioBusiness {

    FuncionarioDao dao;

    public FuncionarioBusiness() {
        dao = new FuncionarioDao();
    }

    public void cadastrar(Funcionario f) {
        dao.cadastrar(f);
    }

    public void editar(Funcionario f) {
        dao.editar(f);
    }

    public void excluir(Funcionario f) {
        Fachada.getInstance().excluirInstrutor(Fachada.getInstance().getByFuncionario_IdInstrutor(f.getId()));
        dao.excluir(f);
        Fachada.getInstance().excluirEndereco(f.getEndereco());
    }
    
    public Funcionario getById(int id) {
        return dao.getById(id);
    }
    
    public ArrayList<Funcionario> getAll() {
        return dao.getAll();
    }
    
    public Funcionario login(String senha,String login){
        return dao.login(senha,login);
    }
    
    public ArrayList<Funcionario> getBusca(String busca){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        for(Funcionario f : getAll()){
            if(f.getCpf().contains(busca) || f.getNome().toLowerCase().contains(busca) || f.getRg().contains(busca) || 
                f.getEmail().contains(busca)){
                funcionarios.add(f);
            }
        }
        return funcionarios;
    }

}
