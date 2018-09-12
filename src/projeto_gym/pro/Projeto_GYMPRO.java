/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_gym.pro;

import controller.LoginControlador;
import fachada.Fachada;
import java.util.ArrayList;
import java.util.Calendar;
import sql.SQLConnection;
import sql.SQLUtil;
import view.LoginJFrame;

/**
 *
 * @author Elvis
 */
public class Projeto_GYMPRO {

    /**
     * @param args the command line arguments
     */
    public static Fachada fachada = Fachada.getInstance();
    
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Fachada.getInstance().atualizarParcelasAtrasadas();
        projeto_gym.pro.Util.atualizarMensalidades();
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
        new LoginControlador(login);
        
    }
    
}
