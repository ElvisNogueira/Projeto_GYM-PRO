/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Elvis
 */
public class Avaliacao {
    private int id;
    private String objetivo;
    private Date proxima_avaliacao, data;
    private Composicao_corporal composicao_corporal;
    private Metas_ideais metas_ideais;
    private Perimetria perimetria;
    private Dobras_Cutaneas dobras_Cutaneas;
    private Anamnese anamnese;
    private Aluno aluno;
    private Instrutor instrutor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Date getProxima_avaliacao() {
        return proxima_avaliacao;
    }

    public void setProxima_avaliacao(Date proxima_avaliacao) {
        this.proxima_avaliacao = proxima_avaliacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Composicao_corporal getComposicao_corporal() {
        return composicao_corporal;
    }

    public void setComposicao_corporal(Composicao_corporal composicao_corporal) {
        this.composicao_corporal = composicao_corporal;
    }

    public Metas_ideais getMetas_ideais() {
        return metas_ideais;
    }

    public void setMetas_ideais(Metas_ideais metas_ideais) {
        this.metas_ideais = metas_ideais;
    }

    public Perimetria getPerimetria() {
        return perimetria;
    }

    public void setPerimetria(Perimetria perimetria) {
        this.perimetria = perimetria;
    }

    public Dobras_Cutaneas getDobras_Cutaneas() {
        return dobras_Cutaneas;
    }

    public void setDobras_Cutaneas(Dobras_Cutaneas dobras_Cutaneas) {
        this.dobras_Cutaneas = dobras_Cutaneas;
    }

    public Anamnese getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(Anamnese anamnese) {
        this.anamnese = anamnese;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    
    
    
}
