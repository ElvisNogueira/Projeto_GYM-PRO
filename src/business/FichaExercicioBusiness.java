/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dao.FichaExercicioDao;
import java.util.ArrayList;
import model.FichaExercicio;

/**
 *
 * @author Elvis
 */
public class FichaExercicioBusiness {
    FichaExercicioDao dao;

    public FichaExercicioBusiness() {
        dao = new FichaExercicioDao();
    }
    
    public void cadastrar(FichaExercicio f){
        dao.cadastrar(f);
    }
    
    public void editar(FichaExercicio f){
        dao.editar(f);
    }
    
    public void excluir(FichaExercicio f){
        dao.excluir(f);
    }
    
    public ArrayList<FichaExercicio> getByIdFichaTreino(int id){
        return dao.getByIdFichaTreino(id);
    }
    
    
}
