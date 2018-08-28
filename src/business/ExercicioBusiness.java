/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.ExercicioDao;
import java.util.ArrayList;
import model.Exercicio;

/**
 *
 * @author Elvis
 */
public class ExercicioBusiness {
    ExercicioDao dao;

    public ExercicioBusiness() {
        dao = new ExercicioDao();
    }
    
    
    
    public void cadastrar(Exercicio e){
        dao.cadastrar(e);
    }
    
    public void editar(Exercicio e){
        dao.editar(e);
    }
    
    public void excluir(Exercicio e){
        dao.excluir(e);
    }
    
    public Exercicio getByIdExercicio(int i){
        return dao.getById(i);
    }
    
    public ArrayList<Exercicio> getByAllTipo(String tipo){
        return dao.getAllTipo(tipo);
    }
    
    public ArrayList<Exercicio> getByAll(){
        return dao.getAll();
    }
    
    public ArrayList<Exercicio> getBusca(String busca, String comboBox){
        return dao.getBusca(busca, comboBox);
    }
     public Exercicio getExercicioNome(String nome){
         return dao.getExercicioNome(nome);
     }
}
