/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import app.Util;
import dao.ParcelasDao;
import fachada.Fachada;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Aluno;
import model.Parcelas;

/**
 *
 * @author Elvis
 */
public class ParcelasBusiness {
    private ParcelasDao dao;
    
    public ParcelasBusiness(){
        dao = new ParcelasDao();
    }

    
    public void cadastrar(Parcelas p){
        if(dao.verificarParcela(p)){
            dao.cadastrar(p);
        }
    }
    public void editar(Parcelas p){
        dao.editar(p);
    }
    public Parcelas getById(int id){
        return dao.getById(id);
    }
    public ArrayList<Parcelas> getAll(){
        return dao.getAll();
    }
    
    public void excluir(Parcelas p){
        dao.excluir(p);
    }
    
    public ArrayList<Parcelas> getAllById(int id){
        return dao.getAllById(id);
    }
    
    public void pagarParcela(Aluno a, Date d){
        dao.pagarParcela(a, d);
    }
    
    public ArrayList<Parcelas> AlunosPlanosVencer(){
        ArrayList<Parcelas> parcelas = new ArrayList<>();
        Parcelas p;
        for(Aluno a : Fachada.getInstance().getAllAluno()){
            if(a.getStatus().equals("Ativo")){
                p = dao.getVencerPlano(a.getId());
                
                if(p!=null){
                    parcelas.add(p);
                }
            }
        }
        
        
        return  parcelas;
    }
    
    public ArrayList<Parcelas> getParcelasVencidas(){
        return dao.getParcelasVencidas();
    }
    
    public void atualizarParcelasAtrasadas(){
        dao.atualizarParcelasAtrasadas();
    }
    
}
