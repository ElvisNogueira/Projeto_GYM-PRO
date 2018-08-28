/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Elvis
 */
public class Metas_ideais {
    private int id;
    private float peso, imc, porcentual_gordura;
    private String nivel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public float getPorcentual_gordura() {
        return porcentual_gordura;
    }

    public void setPorcentual_gordura(float porcentual_gordura) {
        this.porcentual_gordura = porcentual_gordura;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}

