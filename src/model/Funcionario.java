/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Elvis
 */
public class Funcionario {
    private int id;
    private String nome, cpf, telefone, login, senha;
    private float salario;
    private boolean cadAlunoAcessar, cadAlunoCadastrar, cadAlunoEditar,cadAlunoExcluir,cadAlunoRecebPag;
    private boolean cadFuncAcessar, cadFuncCadastrar, cadFuncEditar,cadFuncExcluir,cadFuncRecebPag;
    private boolean AvFisicaAcessar;
    private boolean FichaTreinoAcessar;
    private boolean relatorioAcessar, relatorioCadastrar, relatorioEditar, relatorioExcluir, relatorioRecebPag;
    private boolean LancarPagAcessar, LancarPagCadastrar, LancarPagEditar, LancarPagExcluir, LancarPagRecebPag;
    private boolean controleCaixaAcessar, controleCaixaCadastrar, controleCaixaEditar, controleCaixaExcluir, controleCaixaRecebPag;
    private Endereco endereco;
    private String rg,funcao,email,sexo,status;
    private Date data_nascimento ,data_admissao,data_demissao;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Date getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Date getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }
    
    
	 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isCadAlunoAcessar() {
        return cadAlunoAcessar;
    }

    public void setCadAlunoAcessar(boolean cadAlunoAcessar) {
        this.cadAlunoAcessar = cadAlunoAcessar;
    }

    public boolean isCadAlunoCadastrar() {
        return cadAlunoCadastrar;
    }

    public void setCadAlunoCadastrar(boolean cadAlunoCadastrar) {
        this.cadAlunoCadastrar = cadAlunoCadastrar;
    }

    public boolean isCadAlunoEditar() {
        return cadAlunoEditar;
    }

    public void setCadAlunoEditar(boolean cadAlunoEditar) {
        this.cadAlunoEditar = cadAlunoEditar;
    }

    public boolean isCadAlunoExcluir() {
        return cadAlunoExcluir;
    }

    public void setCadAlunoExcluir(boolean cadAlunoExcluir) {
        this.cadAlunoExcluir = cadAlunoExcluir;
    }

    public boolean isCadAlunoRecebPag() {
        return cadAlunoRecebPag;
    }

    public void setCadAlunoRecebPag(boolean cadAlunoRecebPag) {
        this.cadAlunoRecebPag = cadAlunoRecebPag;
    }

    public boolean isCadFuncAcessar() {
        return cadFuncAcessar;
    }

    public void setCadFuncAcessar(boolean cadFuncAcessar) {
        this.cadFuncAcessar = cadFuncAcessar;
    }

    public boolean isCadFuncCadastrar() {
        return cadFuncCadastrar;
    }

    public void setCadFuncCadastrar(boolean cadFuncCadastrar) {
        this.cadFuncCadastrar = cadFuncCadastrar;
    }

    public boolean isCadFuncEditar() {
        return cadFuncEditar;
    }

    public void setCadFuncEditar(boolean cadFuncEditar) {
        this.cadFuncEditar = cadFuncEditar;
    }

    public boolean isCadFuncExcluir() {
        return cadFuncExcluir;
    }

    public void setCadFuncExcluir(boolean cadFuncExcluir) {
        this.cadFuncExcluir = cadFuncExcluir;
    }

    public boolean isCadFuncRecebPag() {
        return cadFuncRecebPag;
    }

    public void setCadFuncRecebPag(boolean cadFuncRecebPag) {
        this.cadFuncRecebPag = cadFuncRecebPag;
    }

    public boolean isAvFisicaAcessar() {
        return AvFisicaAcessar;
    }

    public void setAvFisicaAcessar(boolean AvFisicaAcessar) {
        this.AvFisicaAcessar = AvFisicaAcessar;
    }

    public boolean isFichaTreinoAcessar() {
        return FichaTreinoAcessar;
    }

    public void setFichaTreinoAcessar(boolean FichaTreinoAcessar) {
        this.FichaTreinoAcessar = FichaTreinoAcessar;
    }

    public boolean isRelatorioAcessar() {
        return relatorioAcessar;
    }

    public void setRelatorioAcessar(boolean relatorioAcessar) {
        this.relatorioAcessar = relatorioAcessar;
    }

    public boolean isRelatorioCadastrar() {
        return relatorioCadastrar;
    }

    public void setRelatorioCadastrar(boolean relatorioCadastrar) {
        this.relatorioCadastrar = relatorioCadastrar;
    }

    public boolean isRelatorioEditar() {
        return relatorioEditar;
    }

    public void setRelatorioEditar(boolean relatorioEditar) {
        this.relatorioEditar = relatorioEditar;
    }

    public boolean isRelatorioExcluir() {
        return relatorioExcluir;
    }

    public void setRelatorioExcluir(boolean relatorioExcluir) {
        this.relatorioExcluir = relatorioExcluir;
    }

    public boolean isRelatorioRecebPag() {
        return relatorioRecebPag;
    }

    public void setRelatorioRecebPag(boolean relatorioRecebPag) {
        this.relatorioRecebPag = relatorioRecebPag;
    }

    public boolean isLancarPagAcessar() {
        return LancarPagAcessar;
    }

    public void setLancarPagAcessar(boolean LancarPagAcessar) {
        this.LancarPagAcessar = LancarPagAcessar;
    }

    public boolean isLancarPagCadastrar() {
        return LancarPagCadastrar;
    }

    public void setLancarPagCadastrar(boolean LancarPagCadastrar) {
        this.LancarPagCadastrar = LancarPagCadastrar;
    }

    public boolean isLancarPagEditar() {
        return LancarPagEditar;
    }

    public void setLancarPagEditar(boolean LancarPagEditar) {
        this.LancarPagEditar = LancarPagEditar;
    }

    public boolean isLancarPagExcluir() {
        return LancarPagExcluir;
    }

    public void setLancarPagExcluir(boolean LancarPagExcluir) {
        this.LancarPagExcluir = LancarPagExcluir;
    }

    public boolean isLancarPagRecebPag() {
        return LancarPagRecebPag;
    }

    public void setLancarPagRecebPag(boolean LancarPagRecebPag) {
        this.LancarPagRecebPag = LancarPagRecebPag;
    }

    public boolean isControleCaixaAcessar() {
        return controleCaixaAcessar;
    }

    public void setControleCaixaAcessar(boolean controleCaixaAcessar) {
        this.controleCaixaAcessar = controleCaixaAcessar;
    }

    public boolean isControleCaixaCadastrar() {
        return controleCaixaCadastrar;
    }

    public void setControleCaixaCadastrar(boolean controleCaixaCadastrar) {
        this.controleCaixaCadastrar = controleCaixaCadastrar;
    }

    public boolean isControleCaixaEditar() {
        return controleCaixaEditar;
    }

    public void setControleCaixaEditar(boolean controleCaixaEditar) {
        this.controleCaixaEditar = controleCaixaEditar;
    }

    public boolean isControleCaixaExcluir() {
        return controleCaixaExcluir;
    }

    public void setControleCaixaExcluir(boolean controleCaixaExcluir) {
        this.controleCaixaExcluir = controleCaixaExcluir;
    }

    public boolean isControleCaixaRecebPag() {
        return controleCaixaRecebPag;
    }

    public void setControleCaixaRecebPag(boolean controleCaixaRecebPag) {
        this.controleCaixaRecebPag = controleCaixaRecebPag;
    }
    
    
}
