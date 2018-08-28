/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import fachada.Fachada;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;
import model.Endereco;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class AlunoDao {
    private PreparedStatement statement;
    
    
    public Aluno cadastrar(Aluno aluno){
        //Precisa cadastrar primeiro o endereço
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_ALUNO);
            
//            insert into aluno (nome,cpf,data_nascimento,sexo,vencimento_mens,endereco_id)email,celular
            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getCpf());
            statement.setDate(3, aluno.getData_nascimento());
            statement.setString(4, aluno.getSexo());
            statement.setInt(5, aluno.getVencimento_mens());
            statement.setInt(6, SQLUtil.getLastIdTabela("endereco"));
            statement.setString(7, aluno.getRg());
            statement.setString(8, aluno.getEmail());
            statement.setString(9, aluno.getCelular());
            statement.setString(10, aluno.getPlano());
            statement.setFloat(11, aluno.getValorPlano());
            
            statement.execute();
            aluno.setId(SQLUtil.getLastIdTabela("aluno"));
            
            return aluno;
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar aluno!\n"+ex.getMessage());
        }
        return null;
    }
    public Aluno editar(Aluno aluno){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_ALUNO);

//            "update aluno set nome=?,cpf=?,data_nascimento=?,sexo=?,"
//            + "vencimento_mens=?,endereco_id=?,rg=?,email=?,celular=?,status=?,tipo_plano=?,valor_plano=? where id=?";          

            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getCpf());
            statement.setDate(3, aluno.getData_nascimento());
            statement.setString(4, aluno.getSexo());
            statement.setInt(5, aluno.getVencimento_mens());
            statement.setInt(6, aluno.getEndereco().getId());
            statement.setString(7, aluno.getRg());
            statement.setString(8, aluno.getEmail());
            statement.setString(9, aluno.getCelular());
            statement.setString(10, aluno.getStatus());
            statement.setString(11, aluno.getPlano());
            statement.setFloat(12, aluno.getValorPlano());
            statement.setInt(13, aluno.getId());
            
            
            statement.execute();
            return aluno;
        } catch (Exception ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Aluno getAlunoById(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_ALUNO);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Aluno getAlunoByNome(String nome){return null;}
    
    public ArrayList<Aluno> getAll(){
        ArrayList<Aluno> alunos = new ArrayList<>();
        ResultSet result;
        
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_ALUNO);
            result = statement.executeQuery();
            while (result.next()) {                
                alunos.add(get(result));
            }
                    
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao pegar todos os aluno!");
        }
        
        return alunos;
    }
    
    public boolean getAlunosCred(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_PARCELAS_ATRASADAS_POR_ALUNO);
            statement.setInt(1, id);
            result = statement.executeQuery();
            
            
            if(result.next()){
                return false;
            }
//            System.out.println(get(result).getNome()+"");
        } catch (Exception ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return true;
    }
    
    private Aluno get(ResultSet result){
        Aluno a = new Aluno();
        Fachada f = Fachada.getInstance();
        try {
            a.setId(result.getInt(1));
            a.setNome(result.getString(2));
            a.setCpf(result.getString(3));
            a.setStatus(result.getString(4));
            a.setData_nascimento(result.getDate(5));
            a.setSexo(result.getString(6));
            a.setVencimento_mens(result.getInt(7));
            a.setEndereco(f.getByIdEndereco(result.getInt(8)));
            a.setRg(result.getString(9));
            a.setEmail(result.getString(10));
            a.setCelular(result.getString(11));
            a.setPlano(result.getString(12));
            a.setValorPlano(result.getFloat(13));
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
}
