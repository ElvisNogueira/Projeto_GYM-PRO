/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Elvis
 */
public class FichaDeTreino {
    private int id;
    private Aluno aluno;
    private Instrutor instrutor;
    private ArrayList<FichaExercicio> exercicios;
    private String obg, obs;   // INSERIR AGORA
    private Date data,dataReavaliacao; // INSERIR AGORA
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public ArrayList<FichaExercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<FichaExercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getObg() {
        return obg;
    }

    public void setObg(String obg) {
        this.obg = obg;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getDataReavaliacao() {
        return dataReavaliacao;
    }

    public void setDataReavaliacao(Date dataReavaliacao) {
        this.dataReavaliacao = dataReavaliacao;
    }
   
}
