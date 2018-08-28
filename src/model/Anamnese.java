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
public class Anamnese {
    private boolean tabagismo, restricaoArticular, cardiopatias, medicamentos, hipertensao,
            outros,diabetes, probPulmonares,ativFisica;
    private String nivel, tabagismoObs, restricaoArticularObs, cardiopatiasObs, medicamentosObs, hipertensaoObs,
            outrosObs,diabetesObs, probPulmonaresObs,ativFisicaObs;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public boolean isTabagismo() {
        return tabagismo;
    }

    public void setTabagismo(boolean tabagismo) {
        this.tabagismo = tabagismo;
    }

    public boolean isRestricaoArticular() {
        return restricaoArticular;
    }

    public void setRestricaoArticular(boolean restricaoArticular) {
        this.restricaoArticular = restricaoArticular;
    }

    public boolean isCardiopatias() {
        return cardiopatias;
    }

    public void setCardiopatias(boolean cardiopatias) {
        this.cardiopatias = cardiopatias;
    }

    public boolean isMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(boolean medicamentos) {
        this.medicamentos = medicamentos;
    }

    public boolean isHipertensao() {
        return hipertensao;
    }

    public void setHipertensao(boolean hipertensao) {
        this.hipertensao = hipertensao;
    }

    public boolean isOutros() {
        return outros;
    }

    public void setOutros(boolean outros) {
        this.outros = outros;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isProbPulmonares() {
        return probPulmonares;
    }

    public void setProbPulmonares(boolean probPulmonares) {
        this.probPulmonares = probPulmonares;
    }

    public boolean isAtivFisica() {
        return ativFisica;
    }

    public void setAtivFisica(boolean ativFisica) {
        this.ativFisica = ativFisica;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTabagismoObs() {
        return tabagismoObs;
    }

    public void setTabagismoObs(String tabagismoObs) {
        this.tabagismoObs = tabagismoObs;
    }

    public String getRestricaoArticularObs() {
        return restricaoArticularObs;
    }

    public void setRestricaoArticularObs(String restricaoArticularObs) {
        this.restricaoArticularObs = restricaoArticularObs;
    }

    public String getCardiopatiasObs() {
        return cardiopatiasObs;
    }

    public void setCardiopatiasObs(String cardiopatiasObs) {
        this.cardiopatiasObs = cardiopatiasObs;
    }

    public String getMedicamentosObs() {
        return medicamentosObs;
    }

    public void setMedicamentosObs(String medicamentosObs) {
        this.medicamentosObs = medicamentosObs;
    }

    public String getHipertensaoObs() {
        return hipertensaoObs;
    }

    public void setHipertensaoObs(String hipertensaoObs) {
        this.hipertensaoObs = hipertensaoObs;
    }

    public String getOutrosObs() {
        return outrosObs;
    }

    public void setOutrosObs(String outrosObs) {
        this.outrosObs = outrosObs;
    }

    public String getDiabetesObs() {
        return diabetesObs;
    }

    public void setDiabetesObs(String diabetesObs) {
        this.diabetesObs = diabetesObs;
    }

    public String getProbPulmonaresObs() {
        return probPulmonaresObs;
    }

    public void setProbPulmonaresObs(String probPulmonaresObs) {
        this.probPulmonaresObs = probPulmonaresObs;
    }

    public String getAtivFisicaObs() {
        return ativFisicaObs;
    }

    public void setAtivFisicaObs(String ativFisicaObs) {
        this.ativFisicaObs = ativFisicaObs;
    }
    
    
}
