CREATE TABLE endereco(
	id serial PRIMARY KEY,
	bairro Varchar(255), 
	uf Varchar(2), 
	cidade Varchar(255), 
	cep Varchar(255), 
	logradouro Varchar(255), 
	num int
);

CREATE TABLE aluno(
	id serial PRIMARY KEY,
	nome Varchar(255),
	cpf Varchar(14) unique, 
	status Varchar(50),
	data_nascimento date,
	sexo Varchar(10),
	vencimento_mens int,
	endereco_id int references endereco(id),
	rg VARCHAR(30),
	email VARCHAR(100),
	celular VARCHAR(15),
	tipo_plano VARCHAR(15),
	valor_plano float
);


CREATE TABLE funcionario(
	id serial PRIMARY KEY,
	nome Varchar(255),
	cpf Varchar(14) unique,
	salario float,
	telefone Varchar(20), 
	login Varchar(255) unique, 
	senha Varchar(255),
	rg varchar(50),
	data_nascimento date,
	sexo varchar(20),
	status varchar(20),
	email varchar(20),
	data_admissao date,
	data_demissao date,
	funcao varchar(50),
	cadAlunoAcessar boolean, 
	cadAlunoCadastrar boolean, 
	cadAlunoEditar boolean,
	cadAlunoExcluir boolean,
	cadAlunoRecebPag boolean,
    cadFuncAcessar boolean, 
	cadFuncCadastrar boolean, 
	cadFuncEditar boolean,
	cadFuncExcluir boolean,
	cadFuncRecebPag boolean,
    avFisicaAcessar boolean, 
    fichaTreinoAcessar boolean, 
	relatorioAcessar boolean, 
	relatorioCadastrar boolean, 
	relatorioEditar boolean, 
	relatorioExcluir boolean, 
	relatorioRecebPag boolean,
    lancarPagAcessar boolean, 
	lancarPagCadastrar boolean, 
	lancarPagEditar boolean, 
	lancarPagExcluir boolean, 
	lancarPagRecebPag boolean,
    controleCaixaAcessar boolean, 
	controleCaixaCadastrar boolean, 
	controleCaixaEditar boolean, 
	controleCaixaExcluir boolean, 
	controleCaixaRecebPag boolean,
	endereco_id int references endereco(id)
);


CREATE TABLE composicao_corporal(
	id serial PRIMARY KEY, 
	peso_gorda float, 
	peso_magra float, 
	imc float, 
	rcq float, 
	porcentual_gordura float,
	pressao_arterial Varchar(10)
);

CREATE TABLE metas_ideais(
	id serial PRIMARY KEY, 
	peso float, 
	imc float, 
	nivel Varchar, 
	porcentual_gordura float
);

CREATE TABLE perimetria(
	id serial PRIMARY KEY, 
	altura float, 
	cintura float,
	peso float, 
	coxa_esquerda float,
	panturrilha_esquerda float, 
	ombro float, 
	braco_esquerdo float, 
	coxa_direita float, 
	abdomem float, 
	torax float, 
	quadril float, 
	panturrilha_direita float, 
	braco_direito float, 
	ante_braco_direito float, 
	ante_braco_esquerdo float
);


CREATE TABLE dobras_cutaneas(
	id serial PRIMARY KEY, 
	peitoral float, 
	axilar_media float, 
	abdominal float, 
	coxa float, 
	bicipita float, 
	supra_iliaca float, 
	subscapular float, 
	tricipital float
);


CREATE TABLE exercicio(
	id serial PRIMARY KEY, 
	tipo Varchar(50), 
	nome Varchar(255) 
);

CREATE TABLE instrutor(
	id serial PRIMARY KEY,
	cref int unique, 
	funcionario_id int references funcionario(id)
);

CREATE TABLE ficha_de_treino(
	id serial PRIMARY KEY, 
	instrutor_id int references instrutor(id), 
	aluno_id int references aluno(id),
	objetivo VARCHAR(255),
	observacao VARCHAR(255),
	data date,
	dataReavaliacao date
);

CREATE TABLE ficha_exercicio(
	id serial PRIMARY KEY, 
	repeticoes int, 
	ordem int,
	dia Varchar(50),
	serie int,
	exercicio_id int references exercicio(id), 
	ficha_treino_id int references ficha_de_treino(id)
);

CREATE TABLE anamnese(
	id serial PRIMARY KEY,
	tabagismo boolean,
	restricaoArticular boolean, 
	cardiopatias boolean, 
	medicamentos boolean, 
	hipertensao boolean,
    outros boolean,
	diabetes boolean,
	probPulmonares boolean,
	ativFisica boolean,
	nivel VARCHAR(255), 
	tabagismoObs VARCHAR(500), 
	restricaoArticularObs VARCHAR(500), 
	cardiopatiasObs VARCHAR(500), 
	medicamentosObs VARCHAR(500), 
	hipertensaoObs VARCHAR(500),
	outrosObs VARCHAR(500),
	diabetesObs VARCHAR(500), 
	probPulmonaresObs VARCHAR(500),
	ativFisicaObs VARCHAR(500)	
);

CREATE TABLE avaliacao(
	id serial PRIMARY KEY, 
	objetivo Varchar(255), 
	proxima_avaliacao date, 
	data date,
	anamnese_id int references anamnese(id),
	composicao_corporal_id int references composicao_corporal(id), 
	metas_ideais_id int references metas_ideais(id), 
	perimetria_id int references perimetria(id), 
	dobras_cutaneas_id int references dobras_cutaneas(id),
	aluno_id int references aluno(id),
	instrutor_id int references instrutor(id)
);

CREATE TABLE pagamento(
	id serial PRIMARY KEY, 
	valor float, 
	descricao Varchar(255),
	data date,
	dataVenc date,
	formaPag VARCHAR(50),
	aluno_id int references aluno(id),  
	funcionario_id int references funcionario(id)
);

CREATE TABLE historico(
	id serial PRIMARY KEY,
	nome Varchar(255),
	tipo Varchar(255)	
);

CREATE TABLE parcelas(
	id serial PRIMARY KEY,
	data_de_vencimento date,
	valor float,
	status VARCHAR(255),
	aluno_id int references aluno(id),
	conta_id int references historico(id)
);

CREATE TABLE controle_financeiro(
	id serial PRIMARY KEY, 
	data date,  
	descricao Varchar(255), 
	valor float, 
	historico_id int references historico(id)
);

CREATE TABLE cadastro_academia(
	id serial PRIMARY KEY,
	nome Varchar(255),
	nome_fantasia Varchar(255),
	nome_proprietario Varchar(255),
	cnpj Varchar(255),
	cpf Varchar(255),
	logo Varchar(255),
	email Varchar(255),
	telefone Varchar(255),
	celular Varchar(255),
	endereco_id int references endereco(id)
);

INSERT INTO exercicio (tipo, nome) VALUES 
	('Abdome','Elevação de perna'),('Abdome','Elevação de perna alternada'), ('Abdome','Infra Tesoura'),
	('Abdome','Oblíquo -  Rotação de tronco'),('Abdome','Oblíquo – Flexão lateral de troco em pé'),('Abdome','Oblíquo – Flexão lateral de troco no solo'),
	('Abdome','Oblíquo – Toque no calcanhar'), ('Abdome','Prancha'),('Abdome','Remador'),
	('Abdome','Roda de suspensão'),('Abdome','Superior curto'),('Abdome','Superior longo'),
	('Aeróbico','Bike'),('Aeróbico','Elíptico'), ('Aeróbico','Esteira'),
	('Bíceps','Rosca 90º'),('Bíceps','Rosca alternada'),('Bíceps','Rosca concentrada'),
	('Bíceps','Rosca de punho'),('Bíceps','Rosca de punho inversa'),('Bíceps','Rosca direta'),
	('Bíceps','Rosca martelo'),('Bíceps','Rosca scott'),('Costas','Crucifixo Inverso'),
	('Costas','Poll dow'),('Costas','Puxador alto costa'),('Costas','Puxador alto frente'),
	('Costas','Ramada cavalinho'),('Costas','Ramada curvada'),('Costas','Ramada unilateral'),
	('Costas','Remada sentada'),('Costas','Voador inverso'),('Glúteo','Cadeira abdutora curvada'),
	('Glúteo','Cadeira abdutora reta'),('Glúteo','Coice no cross'),('Glúteo','Elevação da pelve'),
	('Glúteo','Elevação lateral de perna'),('Glúteo','Flexora deitada'),('Glúteo','Flexora em pé'),
	('Glúteo','Quatro apoios'),('Glúteo','Quatro apoios cachorrinho'),('Glúteo','Stiff'),
	('Ombro','Desenvolvimento de ombro'),('Ombro','Elevação frontal'),('Ombro','Elevação frontal martelo'),
	('Ombro','Elevação lateral'),('Ombro','Encolhimento dos ombros'),('Ombro','Remada alta'),
	('Ombro','Rotação externa'),('Peito','Cross over'),('Peito','Crucifixo'),
	('Peito','Crucifixo inclinado'),('Peito','Poll over'),('Peito','Supino declinado'),
	('Peito','Supino inclinado'),('Peito','Supino reto'),('Peito','Voador '),
	('Perna','Adutora'),('Perna','Agachamento'),('Perna','Agachamento sumô'),
	('Perna','Avanço'),('Perna','Cadeira adutora'),('Perna','Extensora'),
	('Perna','Leg press '),('Perna','Leg press sumô'),('Perna','Panturrilha'),
	('Tríceps','Coice'),('Tríceps','Cord'),('Tríceps','Francês'),
	('Tríceps','No banco'),('Tríceps','Puley'),('Tríceps','Testal');
	
INSERT INTO historico (nome, tipo) VALUES 
	('Salário','Débito'),('Conta de água','Débito'),('Conta de luz','Débito'),
	('Conta de telefone','Débito'),('Contabilidade','Débito'),('Dispesas café e almoço','Débito'),
	('Imprestimos','Débito'),('Impostos','Débito'),('Doações','Débito'),
	('Compra de materiais de escritório','Débito'),('Compra de materiais de limpeza','Débito'),('Compra de materiais de manutenção','Débito'),
	('Aquisição de máquinas','Débito'),('Prestação de serviços de manutenção','Débito'),('Acerto de caixa','Débito'),
	('Outras receitas','Crédito'),('Mensalidade','Crédito'),('Avaliação Física','Crédito');
	
insert into endereco (bairro,uf,cidade,cep,logradouro,num) values ('Santa Rosa','PE','Floresta','56400-000','Rua Tito Rosa','123');

	
insert into funcionario (nome,cpf,salario,telefone,login,senha,rg,data_nascimento,sexo,status,email,data_admissao,
		data_demissao,funcao,cadAlunoAcessar,cadAlunoCadastrar,cadAlunoEditar,cadAlunoExcluir,cadAlunoRecebPag,cadFuncAcessar,cadFuncCadastrar,cadFuncEditar,cadFuncExcluir,cadFuncRecebPag,avFisicaAcessar,fichaTreinoAcessar,relatorioAcessar,relatorioCadastrar,relatorioEditar,relatorioExcluir,relatorioRecebPag,lancarPagAcessar,lancarPagCadastrar,lancarPagEditar,lancarPagExcluir,lancarPagRecebPag,controleCaixaAcessar,controleCaixaCadastrar,controleCaixaEditar,controleCaixaExcluir,controleCaixaRecebPag,endereco_id) values 
		('ADMIN','00000000','0','9','admin','admin','8','1997-12-02','Unissex','ativo','email','2018-07-08',null,'Root',TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,TRUE,1);
		
insert into instrutor (cref,funcionario_id) values ('12345','1');