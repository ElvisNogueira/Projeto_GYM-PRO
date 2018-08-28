/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import projeto_gym.pro.Projeto_GYMPRO;
import dao.AvaliacaoDao;
import fachada.Fachada;
import java.util.ArrayList;
import model.Aluno;
import model.Avaliacao;
import view.Mensagem;



/**
 *
 * @author Elvis
 */
public class AvaliacaoBusiness {
    private AvaliacaoDao dao;

    public AvaliacaoBusiness() {
        this.dao = new AvaliacaoDao();
    }
    
    public void cadastrar(Avaliacao a){
        dao.cadastrar(a);
    }
    
    public void editar(Avaliacao a){
        dao.editar(a);
    }
    
    public void excluir(Avaliacao a){
        dao.excluir(a);
        Fachada.getInstance().excluirAnamnese(a.getAnamnese());
        Fachada.getInstance().excluirComposicao_corporal(a.getComposicao_corporal());
        Fachada.getInstance().excluirDobras_Cutaneas(a.getDobras_Cutaneas());
        Fachada.getInstance().excluirMetas_ideais(a.getMetas_ideais());
        Fachada.getInstance().excluirPerimetria(a.getPerimetria());
    }
    
    
    public Avaliacao getById(int id){
        return dao.getById(id);
    }
    
    public ArrayList<Avaliacao> getAll(){
        return dao.getAll();
    }
    
    
}
