/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import projeto_gym.pro.Util;
import dao.AlunoDao;
import fachada.Fachada;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.Avaliacao;
import model.Pagamento;
import model.Parcelas;

/**
 *
 * @author Elvis
 */
public class AlunoBusiness {

    private AlunoDao dao;

    public AlunoBusiness() {
        this.dao = new AlunoDao();
    }

    public Aluno cadastrar(Aluno aluno) {
        if(Util.validarCPF(Util.prepararCPF(aluno.getCpf()))){
            Fachada.getInstance().cadastrarEndereco(aluno.getEndereco());
            Aluno a = dao.cadastrar(aluno);
            if(a!=null || !a.getPlano().equals("Vitalício"))
                Util.criarMensalidade(a);
            return a;
        }
        aluno.setCpf("");
        return aluno;
    }

    public Aluno editar(Aluno aluno) {
        return dao.editar(aluno);
    }

    public Aluno getById(int id) {
        return dao.getAlunoById(id);
    }

    public Aluno getByNome(String nome) {
        return dao.getAlunoByNome(nome);
    }

    public ArrayList<Aluno> getall() {
        return dao.getAll();
    }

    public ArrayList<Aluno> getPorBusca(String busca) {
        ArrayList<Aluno> alunosBusca = new ArrayList<>();
        for (Aluno a : getall()) {
            if (a.getCpf().contains(busca) || a.getNome().toLowerCase().contains(busca) || a.getEmail().contains(busca)) {
                alunosBusca.add(a);
            }
        }
        return alunosBusca;
    }
    
    public ArrayList<Aluno> getAlunosCredito(){
        ArrayList<Aluno> alunos = new ArrayList<>();
        for(Aluno a : dao.getAll()){
            if(dao.getAlunosCred(a.getId())){
                alunos.add(a);
            }
        }
        return alunos;
    }

}
