/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Comparator;
import model.FichaExercicio;

/**
 *
 * @author Elvis
 */
public class ComparadorFichaExercicio implements Comparator<FichaExercicio>{

    @Override
    public int compare(FichaExercicio o1, FichaExercicio o2) {
        if(o1.getOrdem() < o2.getOrdem())
            return -1;
        else if(o1.getOrdem() > o2.getOrdem())
            return +1;
        else
            return 0;
    }
}
