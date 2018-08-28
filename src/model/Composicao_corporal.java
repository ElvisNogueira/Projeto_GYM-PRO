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
public class Composicao_corporal {
   private int id; 
   private float peso_gorda, peso_magra,imc, rcq, porcentual_gordura, pressao_arterial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPeso_gorda() {
        return peso_gorda;
    }

    public void setPeso_gorda(float peso_gorda) {
        this.peso_gorda = peso_gorda;
    }

    public float getPeso_magra() {
        return peso_magra;
    }

    public void setPeso_magra(float peso_magra) {
        this.peso_magra = peso_magra;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public float getRcq() {
        return rcq;
    }

    public void setRcq(float rcq) {
        this.rcq = rcq;
    }

    public float getPorcentual_gordura() {
        return porcentual_gordura;
    }

    public void setPorcentual_gordura(float porcentual_gordura) {
        this.porcentual_gordura = porcentual_gordura;
    }

    public float getPressao_arterial() {
        return pressao_arterial;
    }

    public void setPressao_arterial(float pressao_arterial) {
        this.pressao_arterial = pressao_arterial;
    }
   
   
}
