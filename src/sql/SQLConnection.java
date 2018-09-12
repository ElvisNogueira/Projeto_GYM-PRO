/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class SQLConnection {
public static String BD__POSTGRESS = "POSTGRES";
    
    private static Connection conexao = null;
    
    private SQLConnection() {
        
    }
    public static Connection getConexao(String bd){
        try {
            if (conexao == null) {
                switch (bd) {
                    case "POSTGRES":
                        conexao = DriverManager.getConnection(
                                SQLUtil.URL_POSTGRES,
                                SQLUtil.USUARIO_POSTGRES,
                                SQLUtil.SENHA_POSTGRES 
                       );
                        break;
                    default:
                        break;
                }
                
            }
        } catch (SQLException ex) {
             
            if("postgres".equals(SQLUtil.SENHA_POSTGRES)){
                SQLUtil.SENHA_POSTGRES= "123";
                getConexao("POSTGRES");
            }
            else
                Mensagem.exibirMensagem("Problema na Conexão com o BD\n"+ex.getMessage());
        }
        return conexao;
    }
}
