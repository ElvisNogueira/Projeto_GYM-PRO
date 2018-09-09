/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Elvis
 */
public class SQLUtil {
    static Connection conexao;
    
    
    public static String INSERIR_ENDERECO ="insert into endereco (bairro,uf,cidade,cep,logradouro,num) "
            + "values (?,?,?,?,?,?)";
    public static String INSERIR_ALUNO = "insert into aluno (nome,cpf,data_nascimento,sexo,vencimento_mens,"
            + "endereco_id,rg,email,celular,status,tipo_plano,valor_plano) values (?,?,?,?,?,?,?,?,?,"
            + "'Ativo',?,?)";
    public static String INSERIR_FUNCIONARIO = "insert into funcionario (nome,cpf,salario,telefone,login,senha,"
            + "rg,data_nascimento,sexo,status,email,data_admissao,data_demissao,funcao,cadAlunoAcessar,"
            + "cadAlunoCadastrar,cadAlunoEditar,cadAlunoExcluir,cadAlunoRecebPag,cadFuncAcessar,cadFuncCadastrar,"
            + "cadFuncEditar,cadFuncExcluir,cadFuncRecebPag,avFisicaAcessar,fichaTreinoAcessar,relatorioAcessar,"
            + "relatorioCadastrar,relatorioEditar,relatorioExcluir,relatorioRecebPag,lancarPagAcessar,lancarPagCadastrar,"
            + "lancarPagEditar,lancarPagExcluir,lancarPagRecebPag,controleCaixaAcessar,controleCaixaCadastrar,controleCaixaEditar,"
            + "controleCaixaExcluir,controleCaixaRecebPag,endereco_id) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	
    public static String INSERIR_COMPOSICAO_CORPORAL = "insert into composicao_corporal (peso_gorda,peso_magra,imc,rcq,porcentual_gordura,"
            + "pressao_arterial) values (?,?,?,?,?,?)";
    public static String INSERIR_METAS_IDEAIS = "insert into metas_ideais (peso,imc,nivel,porcentual_gordura) values (?,?,?,?)";
    public static String INSERIR_PERIMETRIA = "insert into perimetria (altura,cintura,peso,coxa_esquerda,ombro,braco_esquerdo,"
            + "coxa_direita,abdomem,torax,quadril,panturrilha_direita,braco_direito, ante_braco_direito,ante_braco_esquerdo) values (?,"
            + "?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public static String INSERIR_DOBRAS_CUTANEAS ="insert into dobras_cutaneas (peitoral,axilar_media,abdominal,coxa,bicipita,supra_iliaca,"
            + "subscapular,tricipital) values (?,?,?,?,?,?,?,?)";
    public static String INSERIR_EXERCICIO = "insert into exercicio (tipo,nome) values (?,?)";
    public static String INSERIR_INSTRUTOR = "insert into instrutor (cref,funcionario_id) values (?,?)";
    public static String INSERIR_FICHA_DE_TREINO = "insert into ficha_de_treino (instrutor_id,aluno_id,objetivo,observacao,data,dataReavaliacao) "
            + "values (?,?,?,?,?,?)";
    public static String INSERIR_FICHA_EXERCICIO = "insert into ficha_exercicio (repeticoes,ordem,dia,exercicio_id,ficha_treino_id,serie) values (?,?,?,?,?,?)";
    public static String INSERIR_ANAMNESE = "insert into anamnese (tabagismo,restricaoArticular,cardiopatias,medicamentos,"
            + "hipertensao,outros,diabetes,probPulmonares,ativFisica,nivel,tabagismoObs,restricaoArticularObs,cardiopatiasObs,"
            + "medicamentosObs,hipertensaoObs,outrosObs,diabetesObs,probPulmonaresObs,ativFisicaObs) values (?,?,?,?,?,?,?,?,?,?,"
            + "?,?,?,?,?,?,?,?,?)";
    public static String INSERIR_AVALIACAO = "insert into avaliacao (objetivo,proxima_avaliacao,data,anamnese_id,composicao_corporal_id,metas_ideais_id"
             + ",perimetria_id,dobras_cutaneas_id,aluno_id,instrutor_id) values (?,?,?,?,?,?,?,?,?,?)";
    public static String INSERIR_PAGAMENTO = "insert into pagamento (valor,descricao,data,dataVenc,formaPag,aluno_id,funcionario_id) values (?,?,?,?,?,?,?)";
    public static String INSERIR_CONTAS = "insert into historico (nome,tipo) values (?,?)";
    public static String INSERIR_CONTROLE_FINANCEIRO = "insert into controle_financeiro (data,descricao,valor,historico_id) values (?,?,?,?)";
    public static String INSERIR_ACADEMIA = "insert into cadastro_academia (nome,nome_fantasia,nome_proprietario,cnpj,cpf,"
            + "logo,email,telefone,celular,endereco_id) values (?,?,?,?,?,?,?,?,?,?)";
    public static String INSERIR_PARCELAS = "insert into parcelas (data_de_vencimento,valor,status,aluno_id,conta_id) values "
            + "(?,?,?,?,?)";
    
    public static String SELECT_ALL_PAGAMENTOS = "select * from pagamento";
    public static String SELECT_INSTRUTOR_BY_ID_FUNCIONARIO = "select * from instrutor where funcionario_id=?";
    public static String SELECT_ALL_CONTA = "select * from historico";
    public static String SELECT_CONTA_BY_NOME = "select * from historico where nome=?";
    public static String SELECT_CONTA_BY_ID = "select * from historico where id=?";
    public static String SELECT_CONTA_ALL_NOMES = "select nome from historico";
    public static String SELECT_ALL_ALUNO = "select * from aluno order by nome";
    public static String SELECT_BY_ID_ALUNO = "select * from aluno where id=?";
    public static String SELECT_BY_ID_ENDERECO = "select * from endereco where id=?";
    public static String SELECT_ALL_FUNCIONARIO = "select * from funcionario order by nome";
    public static String SELECT_ALL_EXERCICIOS = "select * from exercicio order by nome";
    public static String SELECT_FUNCIONARIO = "select * from funcionario where id=?";
    public static String SELECT_BY_ID_ANMNESE = "select * from anamnese where id=?";
    public static String SELECT_BY_ID_COMPOSICAO_CORPORAL = "select * from composicao_corporal where id=?";
    public static String SELECT_BY_ID_METAS_IDEAIS = "select * from metas_ideais where id=?";
    public static String SELECT_BY_ID_DOBRAS_CUTANEAS = "select * from dobras_cutaneas where id=?";
    public static String SELECT_BY_ID_PERIMETRIA= "select * from perimetria where id=?";
    public static String SELECT_ALL_AVALIACAO = "select * from avaliacao";
    public static String SELECT_BY_ID_INSTRUTOR = "select * from instrutor where id=?";
    public static String SELECT_ALL_CONTROLE_FINANCEIRO = "select * from controle_financeiro";
    public static String SELECT_BY_ID_PARCELAS = "select * from parcelas where id=?";
    public static String SELECT_ALL_PARCELAS = "select * from parcelas order by id";
    public static String SELECT_ALL_PARCELAS_BY_ID = "select * from parcelas where aluno_id=? order by id";
    public static String SELECT_BY_EXERCICIO_ID = "select * from exercicio where id=? ";
    public static String SELECT_BY_ID_CONTROLE_FINANCEIRO = "select * from controle_financeiro where id=? order data";
    public static String SELECT_BY_ID_AVALIACAO = "select * from avaliacao where id=?";
    public static String SELECT_BY_ALUNO_AVALIACAO = "select * from avaliacao where aluno_id=?";
    public static String SELECT_BY_TIPO_ALL_EXERCICIOS = "select * from exercicio where tipo=?";
    public static String SELECT_BY_NOME_EXERCICIOS = "select * from exercicio where nome=?";
    public static String SELECT_BY_PERIODO_CONTROLE_FINANCEIRO = "select * from controle_financeiro where data between ? and ?";
    public static String SELECT_BY_ID_FICHA_TREINO_FICHAEXERCICIO = "select * from ficha_exercicio where ficha_treino_id=?";
    public static String SELECT_BY_ID_FICHA_TREINO = "select * from ficha_de_treino where id=?";
    public static String SELECT_BY_ALUNO_FICHA_TREINO = "select * from ficha_de_treino where aluno_id=?";
    public static String SELECT_ULTIMA_PARCELA_ALUUNO = "select * from parcelas where id=(select max(id) from "
            + "(select * from parcelas where aluno_id = ?) as parcelas_alias) ";
   
    public static String SELECT_PARCELAS_ATRASADAS = "select * from parcelas where status='Atrasado' order by aluno_id";
    public static String SELECT_PARCELAS_ATRASADAS_POR_ALUNO = "select * from parcelas where aluno_id=? and status='Atrasado'";
    
    public static String SELECT_PARCELA_ALUUNO_VENCER = "select * from (select * from parcelas where id=(select max(id) "
            + "from (select * from parcelas where aluno_id = ?) as parcelas_alias)) as "
    + "parc where DATE_PART('day', data_de_vencimento - now())<8 and DATE_PART("
    + "'day', data_de_vencimento - now())>0";
    
    public static String SELECT_PARCELA_ALUNO_VENCER_PERIODO = "select * from (select * from parcelas where id=(select max(id) from (" +
        "select * from parcelas where aluno_id = ?) as parcelas_alias)) as " +
        "parc where data_de_vencimento between ? and ?";
    
    public static String UPDATE_PARCELAS_ATRASADAS = "update parcelas set status = 'Atrasado' where data_de_vencimento "
            + "< now() and status = 'Em aberto'";
    public static String UPDATE_ALUNO = "update aluno set nome=?,cpf=?,data_nascimento=?,sexo=?,"
            + "vencimento_mens=?,endereco_id=?,rg=?,email=?,celular=?,status=?,tipo_plano=?,valor_plano=? where id=?";
    public static String UPDATE_FUNCIONARIO = "update funcionario set nome=?,cpf=?,salario=?,telefone=?,"
            + "login=?,senha=?,rg=?,data_nascimento=?,sexo=?,status=?,email=?,data_admissao=?,data_demissao=?,"
            + "funcao=?,cadAlunoAcessar=?,cadAlunoCadastrar=?,cadAlunoEditar=?,cadAlunoExcluir=?,"
            + "cadAlunoRecebPag=?,cadFuncAcessar=?,cadFuncCadastrar=?,cadFuncEditar=?,cadFuncExcluir=?,"
            + "cadFuncRecebPag=?,avFisicaAcessar=?,fichaTreinoAcessar=?,relatorioAcessar=?,"
            + "relatorioCadastrar=?,relatorioEditar=?,relatorioExcluir=?,relatorioRecebPag=?,lancarPagAcessar=?,"
            + "lancarPagCadastrar=?,lancarPagEditar=?,lancarPagExcluir=?,lancarPagRecebPag=?,controleCaixaAcessar=?,"
            + "controleCaixaCadastrar=?,controleCaixaEditar=?,controleCaixaExcluir=?,controleCaixaRecebPag=?,"
            + "endereco_id=? where id=?";
    public static String UPDATE_ENDERECO = "update endereco set bairro=?,uf=?,cidade=?,cep=?,logradouro=?,num=?"
            + " where id=?";
    public static String UPDATE_PARCELAS = "update parcelas set data_de_vencimento=?,valor=?,status=?,aluno_id=? where id=?";
    public static String UPDATE_EXERCICIO = "update exercicio set tipo=?,nome=? where id=?";
    public static String UPDATE_CONTROLE_FINANCEIRO = "update controle_financeiro set data=?,descricao=?,valor=?,contas_id=? where id=?";
    public static String UPDATE_CONTA = "update historico set nome=?,tipo=? where id=?";
    public static String UPDATE_AVALIACAO = "update avaliacao set proxima_avaliacao=?,data=? where id=?";
    public static String UPDATE_ANAMNESE = "update anamnese set tabagismo=?,restricaoArticular=?,cardiopatias=?,medicamentos=?,"
            + "hipertensao=?,outros=?,diabetes=?,probPulmonares=?,ativFisica=?,nivel=?,tabagismoObs=?,restricaoArticularObs=?,"
            + "cardiopatiasObs=?,medicamentosObs=?,hipertensaoObs=?,outrosObs=?,diabetesObs=?,probPulmonaresObs=?,"
            + "ativFisicaObs=? where id=?";
    public static String UPDATE_COMPOSICAO_CORPORAL = "update composicao_corporal set peso_gorda=?,peso_magra=?,imc=?,"
            + "rcq=?,porcentual_gordura=?,pressao_arterial=? where id=?";
    public static String UPDATE_DOBRAS_CUTANEAS ="update dobras_cutaneas set peitoral=?,axilar_media=?,abdominal=?,"
            + "coxa=?,bicipita=?,supra_iliaca=?,subscapular=?,tricipital=? where id=?";
    public static String UPDATE_METAS_IDEAIS = "update metas_ideais set peso=?,imc=?,nivel=?,porcentual_gordura=? "
            + "where id=?";
    public static String UPDATE_PERIMETRIA = "update perimetria set altura=?,cintura=?,peso=?,coxa_esquerda=?,ombro=?,"
            + "braco_esquerdo=?,coxa_direita=?,abdomem=?,torax=?,quadril=?,panturrilha_direita=?,braco_direito=?, "
            + "ante_braco_direito=?,ante_braco_esquerdo=? where id=?";
    public static String UPDATE_FICHA_EXERCICIO = "update ficha_exercicio set repeticoes=?,ordem=?,dia=?,exercicio_id=?,"
            + "ficha_treino_id=?,serie=? where id=?";
    public static String UPDATE_FICHA_DE_TREINO = "update ficha_de_treino set instrutor_id=?,aluno_id=?,objetivo=?,"
            + "observacao=?,data=?,dataReavaliacao=? where id=?";
    public static String UPDATE_PAGAR_PARCELA = "update parcelas set status='Pago' "
            + "where aluno_id=? and data_de_vencimento=?";
    
    public static String VERIFICAR_PARCELA = "select id from parcelas where aluno_id=? and data_de_vencimento=?";
    
    public static String DELETE_ENDERECO ="delete from endereco where id=?";
    public static String DELETE_ALUNO = "delete from aluno where id=?";
    public static String DELETE_FUNCIONARIO = "delete from funcionario where id=?";
    public static String DELETE_COMPOSICAO_CORPORAL = "delete from composicao_corporal where id=?";
    public static String DELETE_METAS_IDEAIS = "delete from metas_ideais where id=?";
    public static String DELETE_DOBRAS_CUTANEAS ="delete from dobras_cutaneas where id=?";
    public static String DELETE_EXERCICIO = "delete from exercicio where id=?";
    public static String DELETE_INSTRUTOR = "delete from instrutor where id=?";
    public static String DELETE_FICHA_DE_TREINO = "delete from ficha_de_treino where id=?";
    public static String DELETE_FICHA_EXERCICIO = "delete from ficha_exercicio where id=?";
    public static String DELETE_ANAMNESE = "delete from anamnese where id=?";
    public static String DELETE_AVALIACAO = "delete from avaliacao where id=?";
    public static String DELETE_PAGAMENTO = "delete from pagamento where id=?";
    public static String DELETE_CONTAS = "delete from historico (nome,tipo) values (?,?)";
    public static String DELETE_CONTROLE_FINANCEIRO = "delete from controle_financeiro where id=?";
    public static String DELETE_ACADEMIA = "delete from cadastro_academia where id=?";
    public static String DELETE_PARCELAS = "delete from parcelas where id=?";
    public static String DELETE_PERIMETRIA = "delete from perimetria where id=?";
            
    public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/gym";
    public static String USUARIO_POSTGRES = "postgres";
    public static String SENHA_POSTGRES = "postgres";

    

    private SQLUtil() {

    }
    
    public static PreparedStatement prepareStatement(String SQL) throws Exception {
        conexao =  SQLConnection.getConexao(SQLConnection.BD__POSTGRESS);
        return conexao.prepareStatement(SQL);
    }
    
    public static int getLastIdTabela(String nomeTabela){
        int id = 0;
        try {
            conexao = SQLConnection.getConexao(SQLConnection.BD__POSTGRESS);
            PreparedStatement statement = conexao.prepareStatement("select * from " + nomeTabela + " order by id desc limit 1");
            ResultSet result = statement.executeQuery();
            result.next();
            id = result.getInt(1);
            
        } catch (SQLException e) {
           
        }
        return id;
    }
}
