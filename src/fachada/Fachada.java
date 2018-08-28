/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import business.AcademiaBusiness;
import business.AlunoBusiness;
import business.AnamneseBusiness;
import business.AvaliacaoBusiness;
import business.Composicao_corporalBusiness;
import business.ContaBusiness;
import business.ControleFinaceiroBusiness;
import business.Dobras_cutaneasBusiness;
import business.EnderecoBusiness;
import business.ExercicioBusiness;
import business.FichaDeTreinoBusiness;
import business.FichaExercicioBusiness;
import business.FuncionarioBusiness;
import business.InstrutorBusiness;
import business.Metas_ideaisBusiness;
import business.PagamentoBusiness;
import business.ParcelasBusiness;
import business.PerimetriaBusiness;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.Academia;
import model.Aluno;
import model.Anamnese;
import model.Avaliacao;
import model.Composicao_corporal;
import model.Conta;
import model.ControleFinanceiro;
import model.Dobras_Cutaneas;
import model.Endereco;
import model.Exercicio;
import model.FichaDeTreino;
import model.FichaExercicio;
import model.Funcionario;
import model.Instrutor;
import model.Metas_ideais;
import model.Pagamento;
import model.Parcelas;
import model.Perimetria;

/**
 *
 * @author Elvis
 */
public class Fachada {
    
    private static Funcionario funcionarioLogado;
    private static AlunoBusiness alunoBusiness;
    private static AnamneseBusiness anamsBusiness;
    private static AvaliacaoBusiness avaliacaoBusiness;
    private static Composicao_corporalBusiness composicao_corporalBusiness;
    private static ContaBusiness contaBusiness;
    private static ControleFinaceiroBusiness controleFinaceiroBusiness;
    private static Dobras_cutaneasBusiness dobras_cutaneasBusiness;
    private static EnderecoBusiness enderecoBusiness;
    private static ExercicioBusiness exercicioBusiness;
    private static FichaExercicioBusiness fichaExercicioBusiness;
    private static FichaDeTreinoBusiness fichaDeTreinoBusiness;
    private static FuncionarioBusiness funcionarioBusiness;
    private static InstrutorBusiness instrutorBusiness;
    private static Metas_ideaisBusiness metas_ideaisBusiness;
    private static PagamentoBusiness pagamentoBusiness;
    private static PerimetriaBusiness perimetriaBusiness;
    private static AcademiaBusiness academiaBusiness;
    private static ParcelasBusiness parcelasBusiness;
    
    private static Fachada fachada;
    
    public static Fachada getInstance() {
        if (fachada == null) {
            fachada = new Fachada();
        }
        return fachada;
    }

    private Fachada() {
        alunoBusiness = new AlunoBusiness();
        anamsBusiness = new AnamneseBusiness();
        avaliacaoBusiness = new AvaliacaoBusiness();
        composicao_corporalBusiness = new Composicao_corporalBusiness();
        contaBusiness = new ContaBusiness();
        controleFinaceiroBusiness = new ControleFinaceiroBusiness();
        dobras_cutaneasBusiness = new Dobras_cutaneasBusiness();
        enderecoBusiness = new EnderecoBusiness();
        exercicioBusiness = new ExercicioBusiness();
        fichaDeTreinoBusiness = new FichaDeTreinoBusiness();
        fichaExercicioBusiness = new FichaExercicioBusiness();
        funcionarioBusiness = new FuncionarioBusiness();
        instrutorBusiness = new InstrutorBusiness();
        metas_ideaisBusiness = new Metas_ideaisBusiness();
        pagamentoBusiness = new PagamentoBusiness();
        perimetriaBusiness = new PerimetriaBusiness();
        academiaBusiness = new AcademiaBusiness();
        parcelasBusiness = new ParcelasBusiness();
    }
    
    public Aluno cadastrarAluno(Aluno a){
        enderecoBusiness.cadastrar(a.getEndereco());
        return alunoBusiness.cadastrar(a);
    }
    
    public Aluno editarAluno(Aluno a){
        return alunoBusiness.editar(a);
    }
    
    public Aluno getByIdAluno(int id){
        return alunoBusiness.getById(id);
    }
    
    public ArrayList<Aluno> getAlunosPosBusca(String busca) {
       return alunoBusiness.getPorBusca(busca);
    }
    
    public Aluno getByNomeAluno(String nome){
        return alunoBusiness.getByNome(nome);
    }
    
    public ArrayList<Aluno> getAllAluno(){
        return alunoBusiness.getall();
    }
    
    public void cadastrarAnamnese(Anamnese a){
        anamsBusiness.cadastrar(a);
    }
    
    public void editarAnamnese(Anamnese a){
        anamsBusiness.editar(a);
    }
    
    public void excluirAnamnese(Anamnese a){
        anamsBusiness.excluir(a);
    }
    
    public Anamnese getByIdAnamnese(int id){
        return anamsBusiness.getById(id);
    }

    
    public void cadastrarAvaliacao(Avaliacao a){
        avaliacaoBusiness.cadastrar(a);
    }
    
    public void editarAvaliacao(Avaliacao a){
        avaliacaoBusiness.editar(a);
    }
    
    public void excluirAvaliacao(Avaliacao a){
        avaliacaoBusiness.excluir(a);
    }
    
    public Avaliacao getByIdAvaliacao(int id){
        return avaliacaoBusiness.getById(id);
    }
    
    public ArrayList<Avaliacao> getAllAvaliacao(){
        return avaliacaoBusiness.getAll();
    }
    
    public void cadastrarComposicao_corporal(Composicao_corporal c){
        composicao_corporalBusiness.cadastrar(c);
    }
    
    public void editarComposicao_corporal(Composicao_corporal c){
        composicao_corporalBusiness.editar(c);
    }
    
    public void excluirComposicao_corporal(Composicao_corporal c){
        composicao_corporalBusiness.excluir(c);
    }
    
    public Composicao_corporal getByIdComposicao_corporal(int id){
        return composicao_corporalBusiness.getById(id);
    }
    
    public void cadastrarConta(Conta c){
        contaBusiness.cadastrar(c);
    }
    
    public void editarConta(Conta c){
        contaBusiness.editar(c);
    }
    
    public void excluirConta(Conta c){
        contaBusiness.excluir(c);
    }
    
    public Conta getByIdConta(int id){
        return contaBusiness.getById(id);
    }
    
    public Conta getByNomeConta(String nome){
        return contaBusiness.getByNome(nome);
    }
    
    public Conta getByDataConta(Calendar c){
        return contaBusiness.getByData(c);
    }
    
    public ArrayList<String> getAllNomeContas(){      
        return contaBusiness.getAllNomeContas();
    }
    
     public ArrayList<Conta> getAllContas(){      
        return contaBusiness.getAllContas();
    }
    
    public void cadastrarControleFinanceiro(ControleFinanceiro c){
        controleFinaceiroBusiness.cadastrar(c);
    }
    
    public void editarControleFinanceiro(ControleFinanceiro c){
        controleFinaceiroBusiness.editar(c);
    }
    
    public void excluirControleFinanceiro(ControleFinanceiro c){
        controleFinaceiroBusiness.excluir(c);
    }
    
    public ControleFinanceiro getByIdControleFinanceiro(int id){
        return controleFinaceiroBusiness.getById(id);
    }
    
    public ArrayList<ControleFinanceiro> getAllControleFinanceiro(){
        return controleFinaceiroBusiness.getAll();
    }
    
    public void cadastrarDobras_Cutaneas(Dobras_Cutaneas d){
        dobras_cutaneasBusiness.cadastrar(d);
    }
    
    public void editarDobras_Cutaneas(Dobras_Cutaneas d){
        dobras_cutaneasBusiness.editar(d);
    }
    
    public void excluirDobras_Cutaneas(Dobras_Cutaneas d){
        dobras_cutaneasBusiness.excluir(d);
    }
    
    public Dobras_Cutaneas getByIdDobras_Cutaneas(int id){
        return dobras_cutaneasBusiness.getById(id);
    }
    
    public void cadastrarEndereco(Endereco e){
        enderecoBusiness.cadastrar(e);
    }
    
    public void editarEndereco(Endereco e){
        enderecoBusiness.editar(e);
    }
    
    public void excluirEndereco(Endereco e){
        enderecoBusiness.excluir(e);
    }
    
    public Endereco getByIdEndereco(int id){
        return enderecoBusiness.getById(id);
    }
    
    public void cadastrarExercicio(Exercicio e){
        exercicioBusiness.cadastrar(e);
    }
    
    public void editarExercicio(Exercicio e){
        exercicioBusiness.editar(e);
    }
    
    public void excluirExercicio(Exercicio e){
        exercicioBusiness.excluir(e);
    }
    
    public Exercicio getByIdExercicio(int id){
        return exercicioBusiness.getByIdExercicio(id);
    }
    
    public ArrayList<Exercicio> getAllTipoExercicio(String tipo){
        return exercicioBusiness.getByAllTipo(tipo);
    }
    
    public ArrayList<Exercicio> getExercicioAll(){
        return exercicioBusiness.getByAll();
    }
    
    public void cadastrarFichaDeTreino(FichaDeTreino f){
        fichaDeTreinoBusiness.Cadastrar(f);
    }
    
    public void editarFichaDeTreino(FichaDeTreino f){
        fichaDeTreinoBusiness.editar(f);
    }
    
    public void excluirFichaDeTreino(FichaDeTreino f){
        fichaDeTreinoBusiness.excluir(f);
    }
    
    public FichaDeTreino getByIdFichaDeTreino(int id){
        return fichaDeTreinoBusiness.getById(id);
    }
    
    public void cadastrarFichaExercicio(FichaExercicio f){
        fichaExercicioBusiness.cadastrar(f);
    }
    
    public void editarFichaExercicio(FichaExercicio f){
        fichaExercicioBusiness.editar(f);
    }
    
    public void excluirFichaExercicio(FichaExercicio f){
        fichaExercicioBusiness.excluir(f);
    }
    
    public void cadastrarFuncionario(Funcionario f){
        funcionarioBusiness.cadastrar(f);
    }
    
    public void editarFuncionario(Funcionario f){
        funcionarioBusiness.editar(f);
    }
    
    public void excluirFuncionario(Funcionario f){
        funcionarioBusiness.excluir(f);
    }
    
    public Funcionario getByIdFuncionario(int id){
        return funcionarioBusiness.getById(id);
    }
    
    public ArrayList<Funcionario> getFuncionariosBusca(String busca){
        return funcionarioBusiness.getBusca(busca);
    }
    
    public ArrayList<Funcionario> getAllFuncionario(){
        return funcionarioBusiness.getAll();
    }
    
    public Funcionario login(String senha, String login){
        funcionarioLogado=funcionarioBusiness.login(senha, login);
        return funcionarioLogado;
    }
    
    public void cadastrarInstrutor(Instrutor i){
        instrutorBusiness.cadastrar(i);
    }
    
    public void editarInstrutor(Instrutor i){
        instrutorBusiness.editar(i);
    }
    
    public void excluirInstrutor(Instrutor i){
        instrutorBusiness.excluir(i);
    }
    
    public Instrutor getByIdInstrutor(int id){
        return instrutorBusiness.getById(id);
    }
    
    public ArrayList<Instrutor> getAllInstrutor(){
        return instrutorBusiness.getAll();
    }
    
    public Instrutor getByFuncionario_IdInstrutor(int id){
        return instrutorBusiness.getByIdFunc(id);
    }
    
    public void cadastrarMetas_ideais(Metas_ideais m){
        metas_ideaisBusiness.cadastrar(m);
    }
    
    public void editarMetas_ideais(Metas_ideais m){
        metas_ideaisBusiness.editar(m);
    }
    
    public void excluirMetas_ideais(Metas_ideais m){
        metas_ideaisBusiness.excluir(m);
    }
    
    public Metas_ideais getByIdMetas_ideais(int id){
        return metas_ideaisBusiness.getById(id);
    }
    
    
    public void cadastrarPagamento(Pagamento p){
        pagamentoBusiness.cadastrar(p);
    }
    
    public void editarPagamento(Pagamento p){
        pagamentoBusiness.editar(p);
    }
    
    public void excluirPagamento(Pagamento p){
        pagamentoBusiness.excluir(p);
    }
    
    public Pagamento getByIdPagamento(int id){
        return pagamentoBusiness.getById(id);
    }
    
    public ArrayList<Pagamento> getAllPagamento(){
        return pagamentoBusiness.getAll();
    }
    
    public void cadastrarPerimetria(Perimetria p){
        perimetriaBusiness.cadastrar(p);
    }
    
    public void editarPerimetria(Perimetria p){
        perimetriaBusiness.editar(p);
    }
    
    public void excluirPerimetria(Perimetria p){
        perimetriaBusiness.excluir(p);
    }
    
    public Perimetria getByIdPerimetria(int id){
        return perimetriaBusiness.getById(id);
    }

    public static Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public static void setFuncionarioLogado(Funcionario funcionarioLogado) {
        Fachada.funcionarioLogado = funcionarioLogado;
    }
    
    public Academia cadastrarAcademia(Academia a){
        return academiaBusiness.cadastrar(a);
    }
    
    public Academia editarAcademia(Academia a){
        return academiaBusiness.editar(a);
    }
    
    public Academia getByIdAcademia(int id){
        return academiaBusiness.getById(id);
    }

    public void cadastrarParcelas(Parcelas p){
        parcelasBusiness.cadastrar(p);
    }
    
    public void editarParcelas(Parcelas p){
        parcelasBusiness.editar(p);
    }
    
    public Parcelas getByIdParcelas(int id){
        return parcelasBusiness.getById(id);
    }
    
    public ArrayList<Parcelas> getAllParcelas(){
        return parcelasBusiness.getAll();
    }
    
    public ArrayList<Parcelas> getAllByIdParcelas(int id){
        return parcelasBusiness.getAllById(id);
    }
    
    public void excluirParcelas(Parcelas p){
        parcelasBusiness.cadastrar(p);
    }
    
    public ArrayList<Exercicio> getBuscaExercicio(String busca, String comboBox){
        return exercicioBusiness.getBusca(busca, comboBox);
    }
    
    public ArrayList<Conta> getBuscaConta(String busca, String combobox){
        return contaBusiness.getBusca(busca, combobox);
    }
    
    public Exercicio getExercicioNomeExercicio(String nome){
        return exercicioBusiness.getExercicioNome(nome);
    }
    
    public ArrayList<ControleFinanceiro> getBuscaControleFinanceiro(Date d1,Date d2){
        return controleFinaceiroBusiness.getByBusca(d1, d2);
    }
    
    public ArrayList<FichaExercicio> getFichaExercByIdFichaTreino(int id){
        return fichaExercicioBusiness.getByIdFichaTreino(id);
    }
    
    public ArrayList<FichaDeTreino> getByAlunoFichaTreino(int id){
        return fichaDeTreinoBusiness.getByAlunoId(id);
    }
    
    public void pagarParcela(Aluno a, Date d){
        parcelasBusiness.pagarParcela(a, d);
    }
    
    public ArrayList<Parcelas> AlunosPlanosVencer(){
       return parcelasBusiness.AlunosPlanosVencer();
    }
    
    public ArrayList<Parcelas> getParcelasVencidas(){
        return parcelasBusiness.getParcelasVencidas();
    }
     
    public void atualizarParcelasAtrasadas(){
        parcelasBusiness.atualizarParcelasAtrasadas();
    }
    
    public ArrayList<Aluno> getAlunosCredito(){
        return alunoBusiness.getAlunosCredito();
    }
}
