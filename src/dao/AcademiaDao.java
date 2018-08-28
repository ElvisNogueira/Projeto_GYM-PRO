/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Academia;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class AcademiaDao {
    PreparedStatement statement;
    
    public Academia cadastrar(Academia a){
        try {
            
//            (nome,nome_fantasia,nome_proprietario,cnpj,cpf,"
//            + "logo,email,telefone,celular,endereco_id)
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_ACADEMIA);
            statement.setString(1, a.getNome());
            statement.setString(2, a.getNomeFantasia());
            statement.setString(3, a.getNomeProprietario());
            statement.setString(4, a.getCnpj());
            statement.setString(5, a.getCpf());
            statement.setString(6, a.getLogo());
            statement.setString(7, a.getEmail());
            statement.setString(8, a.getTelefone());
            statement.setString(9, a.getCelular());
            statement.setInt(10, SQLUtil.getLastIdTabela("endereco"));
            
            a.setId(SQLUtil.getLastIdTabela("academia"));
            a.getEndereco().setId(SQLUtil.getLastIdTabela("endereco"));
            
            return a;
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar academia");
        }
        return null;
    }
    
    public Academia editar(Academia a){
        return null;
    }

    public Academia getById(int id){
        return null;
    }
}
