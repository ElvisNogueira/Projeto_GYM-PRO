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
public class FichaExercicio {
   private int id, repeticoes,ordem, serie; 
   private Exercicio exercicio;
   private int fichaDeTreino;
   private String dia,obs; // INSERIR AGORA  O OBS

   
   public FichaExercicio(){}

    public FichaExercicio( String dia, FichaExercicio f) {
        this.repeticoes = f.repeticoes;
        this.ordem = f.ordem;
        this.serie = f.serie;
        this.exercicio = f.exercicio;
        this.fichaDeTreino = f.fichaDeTreino;
        this.dia = dia;
        this.obs = f.obs;
    }
    
    public FichaExercicio(FichaExercicio f) {
        this.repeticoes = f.repeticoes;
        this.ordem = f.ordem;
        this.serie = f.serie;
        this.exercicio = f.exercicio;
        this.fichaDeTreino = f.fichaDeTreino;
        this.dia = f.getDia();
        this.obs = f.obs;
        this.id = f.getId();
    }
   
    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
   
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    public int getFichaDeTreino() {
        return fichaDeTreino;
    }

    public void setFichaDeTreino(int fichaDeTreino) {
        this.fichaDeTreino = fichaDeTreino;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
   
    
   
}
