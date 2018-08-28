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
import model.Funcionario;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class FuncionarioDao {
    private PreparedStatement statement;
    
    public void cadastrar(Funcionario f){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.INSERIR_FUNCIONARIO);
            
            statement.setString(1, f.getNome());
            statement.setString(2, f.getCpf());
            statement.setFloat(3, f.getSalario());
            statement.setString(4, f.getTelefone());
            statement.setString(5, f.getLogin());
            statement.setString(6, f.getSenha());
            statement.setString(7, f.getRg());
            statement.setDate(8, f.getData_nascimento());
            statement.setString(9, f.getSexo());
            statement.setString(10, f.getStatus());
            statement.setString(11, f.getEmail());
            statement.setDate(12, f.getData_admissao());
            statement.setDate(13, f.getData_demissao());
            statement.setString(14, f.getFuncao());
            statement.setBoolean(15, f.isCadAlunoAcessar());
            statement.setBoolean(16, f.isCadAlunoCadastrar());
            statement.setBoolean(17, f.isCadAlunoEditar());
            statement.setBoolean(18, f.isCadAlunoExcluir());
            statement.setBoolean(19, f.isCadAlunoRecebPag());
            statement.setBoolean(20, f.isCadFuncAcessar());
            statement.setBoolean(21, f.isCadFuncCadastrar());
            statement.setBoolean(22, f.isCadFuncEditar());
            statement.setBoolean(23, f.isCadFuncExcluir());
            statement.setBoolean(24, f.isCadFuncRecebPag());
            statement.setBoolean(25, f.isAvFisicaAcessar());
            statement.setBoolean(26, f.isFichaTreinoAcessar());
            statement.setBoolean(27, f.isRelatorioAcessar());
            statement.setBoolean(28, f.isRelatorioCadastrar());
            statement.setBoolean(29, f.isRelatorioEditar());
            statement.setBoolean(30, f.isRelatorioExcluir());
            statement.setBoolean(31, f.isRelatorioRecebPag());
            statement.setBoolean(32, f.isLancarPagAcessar());
            statement.setBoolean(33, f.isLancarPagCadastrar());
            statement.setBoolean(34, f.isLancarPagEditar());
            statement.setBoolean(35, f.isLancarPagExcluir());
            statement.setBoolean(36, f.isLancarPagRecebPag());
            statement.setBoolean(37, f.isControleCaixaAcessar());
            statement.setBoolean(38, f.isControleCaixaCadastrar());
            statement.setBoolean(39, f.isControleCaixaEditar());
            statement.setBoolean(40, f.isControleCaixaExcluir());
            statement.setBoolean(41, f.isControleCaixaRecebPag());
            statement.setInt(42, SQLUtil.getLastIdTabela("endereco"));
            
            statement.execute();
            
            
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao cadastrar Funcionario!"+ex.getMessage());
        }
    }
    public void editar(Funcionario f){
        try {
            statement=SQLUtil.prepareStatement(SQLUtil.UPDATE_FUNCIONARIO);
            
            statement.setString(1, f.getNome());
            statement.setString(2, f.getCpf());
            statement.setFloat(3, f.getSalario());
            statement.setString(4, f.getTelefone());
            statement.setString(5, f.getLogin());
            statement.setString(6, f.getSenha());
            statement.setString(7, f.getRg());
            statement.setDate(8, f.getData_nascimento());
            statement.setString(9, f.getSexo());
            statement.setString(10, f.getStatus());
            statement.setString(11, f.getEmail());
            statement.setDate(12, f.getData_admissao());
            statement.setDate(13, f.getData_demissao());
            statement.setString(14, f.getFuncao());
            statement.setBoolean(15, f.isCadAlunoAcessar());
            statement.setBoolean(16, f.isCadAlunoCadastrar());
            statement.setBoolean(17, f.isCadAlunoEditar());
            statement.setBoolean(18, f.isCadAlunoExcluir());
            statement.setBoolean(19, f.isCadAlunoRecebPag());
            statement.setBoolean(20, f.isCadFuncAcessar());
            statement.setBoolean(21, f.isCadFuncCadastrar());
            statement.setBoolean(22, f.isCadFuncEditar());
            statement.setBoolean(23, f.isCadFuncExcluir());
            statement.setBoolean(24, f.isCadFuncRecebPag());
            statement.setBoolean(25, f.isAvFisicaAcessar());
            statement.setBoolean(26, f.isFichaTreinoAcessar());
            statement.setBoolean(27, f.isRelatorioAcessar());
            statement.setBoolean(28, f.isRelatorioCadastrar());
            statement.setBoolean(29, f.isRelatorioEditar());
            statement.setBoolean(30, f.isRelatorioExcluir());
            statement.setBoolean(31, f.isRelatorioRecebPag());
            statement.setBoolean(32, f.isLancarPagAcessar());
            statement.setBoolean(33, f.isLancarPagCadastrar());
            statement.setBoolean(34, f.isLancarPagEditar());
            statement.setBoolean(35, f.isLancarPagExcluir());
            statement.setBoolean(36, f.isLancarPagRecebPag());
            statement.setBoolean(37, f.isControleCaixaAcessar());
            statement.setBoolean(38, f.isControleCaixaCadastrar());
            statement.setBoolean(39, f.isControleCaixaEditar());
            statement.setBoolean(40, f.isControleCaixaExcluir());
            statement.setBoolean(41, f.isControleCaixaRecebPag());
            statement.setInt(42, f.getEndereco().getId());
            statement.setInt(43, f.getId());
            
            statement.execute();
            
            
        } catch (Exception ex) {
            Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
//            Mensagem.exibirMensagem("Erro ao editar Funcionario!"+ex.getMessage());
        }
    }
    public void excluir(Funcionario f){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_FUNCIONARIO);
            statement.setInt(1, f.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Funcionario getById(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_FUNCIONARIO);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao selecionar Funcionario!\n"+ex.getMessage());
        }
        return null;
    }
    
    public ArrayList<Funcionario> getAll(){
        ResultSet result;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_ALL_FUNCIONARIO);
            result = statement.executeQuery();
            
            while (result.next()) {                
                funcionarios.add(get(result));
            }
            return funcionarios;
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao pegar alunos"+ex.getMessage());
        }
        
        return null;
    }
    
    public Funcionario login(String senha, String login){
        try {
            ResultSet result;
            statement=SQLUtil.prepareStatement("select * from funcionario where login = '"+login+"' and senha = '"+senha+"' limit 1");
            
            result=statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao fazer login");
        }
        return null;
    }
    
    private Funcionario get(ResultSet result){
        Funcionario f = new Funcionario();
        
        try {
            
            f.setId(result.getInt(1));
            f.setNome(result.getString(2));
            f.setCpf(result.getString(3));
            f.setSalario(result.getFloat(4));
            f.setTelefone(result.getString(5));
            f.setLogin(result.getString(6));
            f.setSenha(result.getString(7));
            f.setRg(result.getString(8));
            f.setData_nascimento(result.getDate(9));
            f.setSexo(result.getString(10));
            f.setStatus(result.getString(11));
            f.setEmail(result.getString(12));
            f.setData_admissao(result.getDate(13));
            f.setData_demissao(result.getDate(14));
            f.setFuncao(result.getString(15));
            f.setCadAlunoAcessar(result.getBoolean(16));
            f.setCadAlunoCadastrar(result.getBoolean(17));
            f.setCadAlunoEditar(result.getBoolean(18));
            f.setCadAlunoExcluir(result.getBoolean(19));
            f.setCadAlunoRecebPag(result.getBoolean(20));
            f.setCadFuncAcessar(result.getBoolean(21));
            f.setCadFuncCadastrar(result.getBoolean(22));
            f.setCadFuncEditar(result.getBoolean(23));
            f.setCadFuncExcluir(result.getBoolean(24));
            f.setCadFuncRecebPag(result.getBoolean(25));
            f.setAvFisicaAcessar(result.getBoolean(26));
            f.setFichaTreinoAcessar(result.getBoolean(27));
            f.setRelatorioAcessar(result.getBoolean(28));
            f.setRelatorioCadastrar(result.getBoolean(29));
            f.setRelatorioEditar(result.getBoolean(30));
            f.setRelatorioExcluir(result.getBoolean(31));
            f.setRelatorioRecebPag(result.getBoolean(32));
            f.setLancarPagAcessar(result.getBoolean(33));
            f.setLancarPagCadastrar(result.getBoolean(34));
            f.setLancarPagEditar(result.getBoolean(35));
            f.setLancarPagExcluir(result.getBoolean(36));
            f.setLancarPagRecebPag(result.getBoolean(37));
            f.setControleCaixaAcessar(result.getBoolean(38));
            f.setControleCaixaCadastrar(result.getBoolean(39));
            f.setControleCaixaEditar(result.getBoolean(40));
            f.setControleCaixaExcluir(result.getBoolean(41));
            f.setControleCaixaRecebPag(result.getBoolean(42));
            f.setEndereco(Fachada.getInstance().getByIdEndereco(result.getInt(43)));

            return f;
        } catch (SQLException ex) {}        
        
        return null;
    }
}
