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
public class Parcelas {
    private int id;
    private Date data_de_Vencimento;
    private float valor;
    private String status;
    private Aluno alunos;
    private Conta conta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_de_Vencimento() {
        return data_de_Vencimento;
    }

    public void setData_de_Vencimento(Date data_de_Vencimento) {
        this.data_de_Vencimento = data_de_Vencimento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }           
}
