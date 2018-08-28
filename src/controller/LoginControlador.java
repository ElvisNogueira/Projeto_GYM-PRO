/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import projeto_gym.pro.Projeto_GYMPRO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Funcionario;
import view.HomeJFrame;
import view.LoginJFrame;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class LoginControlador implements ActionListener{
    LoginJFrame login;
    HomeJFrame home;

    public LoginControlador(LoginJFrame login) {
        this.login = login;
        login.getjButton1().addActionListener(this);
        home = new HomeJFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario=login.getjTextFieldUsuario().getText();
        String senha=login.getjPasswordFieldSenha().getText();

        if(projeto_gym.pro.Projeto_GYMPRO.fachada.login(senha, usuario)!=null){
          
            login.dispose();
            home.setVisible(true);
            
        }else{
            Mensagem.exibirMensagem("Senha ou login incorreto");
            login.getjTextFieldUsuario().setText(null);
        }
    }
    
    
}
