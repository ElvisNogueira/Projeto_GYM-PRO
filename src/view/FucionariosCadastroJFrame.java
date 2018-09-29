/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import projeto_gym.pro.Projeto_GYMPRO;
import projeto_gym.pro.Util;
import com.toedter.calendar.JDateChooser;
import fachada.Fachada;
import java.awt.Color;
import java.sql.Date;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.Endereco;
import model.Funcionario;
import model.Instrutor;

/**
 *
 * @author Insinuante
 */
public class FucionariosCadastroJFrame extends javax.swing.JFrame {

    private Funcionario f;
    private Instrutor i;

    public FucionariosCadastroJFrame() {
        Util.lookAndFeel();
        initComponents();
        f = new Funcionario();
        f.setEndereco(new Endereco());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        jLabeFuncionario = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelCadastro = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelDN = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jTextFieldRG = new javax.swing.JTextField();
        jComboBoxUf = new javax.swing.JComboBox<>();
        jLabelCidade = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelUF = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jFormattedTextFieldCelular = new javax.swing.JFormattedTextField();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jFormattedTextFieldCPF1 = new javax.swing.JFormattedTextField();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jDateChooserNasc = new com.toedter.calendar.JDateChooser();
        jPanelACesso = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelPesgunta1 = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();
        jLabelPesgunta2 = new javax.swing.JLabel();
        jLabelPesgunta3 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldId3 = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelPesgunta4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCadAluno = new javax.swing.JLabel();
        jLabelCadAluno1 = new javax.swing.JLabel();
        jLabelCadAluno2 = new javax.swing.JLabel();
        jLabelCadAluno3 = new javax.swing.JLabel();
        jLabelCadAluno4 = new javax.swing.JLabel();
        jLabelCadAluno5 = new javax.swing.JLabel();
        jLabelCadAluno6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCadAluno7 = new javax.swing.JLabel();
        jLabelCadAluno8 = new javax.swing.JLabel();
        jLabelCadAluno9 = new javax.swing.JLabel();
        jLabelCadAluno10 = new javax.swing.JLabel();
        jLabelCadAluno11 = new javax.swing.JLabel();
        cadAlunoAcessojCheckBox = new javax.swing.JCheckBox();
        cadAlunoCadastrarjCheckBox = new javax.swing.JCheckBox();
        cadAlunoEditarjCheckBox = new javax.swing.JCheckBox();
        cadAlunoExcluirjCheckBox = new javax.swing.JCheckBox();
        cadAlunoRecebPagjCheckBox = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        cadFuncRecebPagjCheckBox = new javax.swing.JCheckBox();
        cadFuncExcluirjCheckBox = new javax.swing.JCheckBox();
        cadFuncEditarjCheckBox = new javax.swing.JCheckBox();
        cadFuncCadastrarjCheckBox = new javax.swing.JCheckBox();
        cadFunAcessojCheckBox = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        avFisicaAcessojCheckBox = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        fichaTreinoAcessojCheckBox = new javax.swing.JCheckBox();
        jSeparator7 = new javax.swing.JSeparator();
        relatoriosAcessojCheckBox = new javax.swing.JCheckBox();
        relatorioCadastrarjCheckBox = new javax.swing.JCheckBox();
        relatorioEditarjCheckBox = new javax.swing.JCheckBox();
        relatorioExcluirjCheckBox = new javax.swing.JCheckBox();
        relatorioRecebPagjCheckBox = new javax.swing.JCheckBox();
        jSeparator8 = new javax.swing.JSeparator();
        lancarPagamentosAcessojCheckBox = new javax.swing.JCheckBox();
        LancarPagCadastrarjCheckBox = new javax.swing.JCheckBox();
        LancarPagEditarjCheckBox = new javax.swing.JCheckBox();
        LancarPagExcluirjCheckBox = new javax.swing.JCheckBox();
        LancarPagRecebPagjCheckBox = new javax.swing.JCheckBox();
        jSeparator9 = new javax.swing.JSeparator();
        controleCaixaAcessojCheckBox = new javax.swing.JCheckBox();
        controleCaixaCadastrarjCheckBox = new javax.swing.JCheckBox();
        controleCaixaEditarjCheckBox = new javax.swing.JCheckBox();
        controleCaixaExcluirjCheckBox = new javax.swing.JCheckBox();
        controleCaixaRecebPagjCheckBox = new javax.swing.JCheckBox();
        jPaneAdicionais = new javax.swing.JPanel();
        jLabelDados = new javax.swing.JLabel();
        jLabelFuncao = new javax.swing.JLabel();
        jComboBoxFuncaoFuncionario = new javax.swing.JComboBox<>();
        jCheckBoxPROFAV = new javax.swing.JCheckBox();
        jLabelCRF = new javax.swing.JLabel();
        jTextFieldCRf = new javax.swing.JTextField();
        jLabelDataAd = new javax.swing.JLabel();
        jLabelDataDe = new javax.swing.JLabel();
        jLabelSal = new javax.swing.JLabel();
        jTextFieldSalario = new javax.swing.JTextField();
        dataAdmjDateChooser = new com.toedter.calendar.JDateChooser();
        dataDemjDateChooser = new com.toedter.calendar.JDateChooser();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionários");
        setExtendedState(6);

        jPanelBack.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        jLabeFuncionario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jLabeFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/crachá_white.png"))); // NOI18N
        jLabeFuncionario.setText(" Funcionários ");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabeFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBlueLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabeFuncionario)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.setBackground(new java.awt.Color(45, 118, 232));

        jPanelCadastro.setBackground(new java.awt.Color(255, 255, 255));

        jLabelId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(45, 118, 232));
        jLabelId.setText("Id");

        jLabelNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(45, 118, 232));
        jLabelNome.setText("Nome");

        jLabelCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCpf.setText("CPF");

        jLabelRg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelRg.setForeground(new java.awt.Color(45, 118, 232));
        jLabelRg.setText("RG");

        jLabelSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelSexo.setText("Sexo");

        jLabelDN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelDN.setForeground(new java.awt.Color(45, 118, 232));
        jLabelDN.setText("Data nascimento");

        jLabelEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(45, 118, 232));
        jLabelEmail.setText("E-mail");

        jLabelStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(45, 118, 232));
        jLabelStatus.setText("Status");

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jTextFieldNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextFieldCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCEPActionPerformed(evt);
            }
        });

        jTextFieldRG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGActionPerformed(evt);
            }
        });

        jComboBoxUf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jComboBoxUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUfActionPerformed(evt);
            }
        });

        jLabelCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCidade.setText("Cidade");

        jLabelBairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(45, 118, 232));
        jLabelBairro.setText("Bairro");

        jLabelCelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCelular.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCelular.setText("Celular");

        jLabelUF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelUF.setForeground(new java.awt.Color(45, 118, 232));
        jLabelUF.setText("UF");

        jLabelCEP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCEP.setText("CEP");

        jLabelLogradouro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLogradouro.setForeground(new java.awt.Color(45, 118, 232));
        jLabelLogradouro.setText("Logradouro");

        try {
            jFormattedTextFieldCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextFieldCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCelularActionPerformed(evt);
            }
        });

        jTextFieldLogradouro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLogradouroActionPerformed(evt);
            }
        });

        jTextFieldCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidadeActionPerformed(evt);
            }
        });

        jTextFieldBairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });

        jComboBoxSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFormattedTextFieldCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPF1ActionPerformed(evt);
            }
        });
        jFormattedTextFieldCPF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCPF1KeyReleased(evt);
            }
        });

        jComboBoxStatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldNumero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jLabelNumero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(45, 118, 232));
        jLabelNumero.setText("Número");

        jDateChooserNasc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelLogradouro)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBairro))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumero)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUF)
                                    .addComponent(jComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCEP)
                                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabelCpf)
                                        .addGap(125, 125, 125))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabelRg)
                                        .addGap(196, 196, 196))
                                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                        .addComponent(jTextFieldRG)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabelSexo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBoxSexo, 0, 82, Short.MAX_VALUE)))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jLabelStatus)
                                    .addComponent(jTextFieldCidade)
                                    .addComponent(jComboBoxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDN)
                                    .addComponent(jLabelCelular)
                                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jDateChooserNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58))))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelDN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelRg)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelCelular))
                .addGap(11, 11, 11)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBairro)
                            .addComponent(jLabelUF)
                            .addComponent(jLabelCEP)
                            .addComponent(jLabelStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Cadastrar", jPanelCadastro);

        jPanelACesso.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPesgunta1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabelPesgunta1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelPesgunta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/key_blue.png"))); // NOI18N
        jLabelPesgunta1.setText("  Acessar sistema  ");

        jLabelInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelInfo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelInfo.setText("Digite nos campos a baixo do acesso do funcionário:");

        jLabelPesgunta2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPesgunta2.setForeground(new java.awt.Color(45, 118, 232));
        jLabelPesgunta2.setText("Digite a senha");

        jLabelPesgunta3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPesgunta3.setForeground(new java.awt.Color(45, 118, 232));
        jLabelPesgunta3.setText("Confirme a senha");

        jTextFieldSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaActionPerformed(evt);
            }
        });

        jTextFieldId3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldId3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldId3ActionPerformed(evt);
            }
        });

        jTextFieldLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jLabelPesgunta4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelPesgunta4.setForeground(new java.awt.Color(45, 118, 232));
        jLabelPesgunta4.setText("Digite o login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPesgunta1)
                    .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelPesgunta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPesgunta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPesgunta3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelPesgunta1)
                .addGap(61, 61, 61)
                .addComponent(jLabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesgunta4)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesgunta2)
                    .addComponent(jTextFieldId3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesgunta3))
                .addGap(124, 124, 124))
        );

        jTabbedPane2.addTab("Controle de Acesso", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCadAluno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno.setText("Cadastro de Aluno");

        jLabelCadAluno1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno1.setText("Cadastro de Funcionário");

        jLabelCadAluno2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno2.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno2.setText("Avaliação Física");

        jLabelCadAluno3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno3.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno3.setText("Ficha Treino");

        jLabelCadAluno4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno4.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno4.setText("Relatórios");

        jLabelCadAluno5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno5.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno5.setText("Lançar Pagamentos");

        jLabelCadAluno6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno6.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno6.setText("Controle do Caixa");

        jLabelCadAluno7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno7.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno7.setText("Acessar");

        jLabelCadAluno8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno8.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno8.setText("Cadastrar");

        jLabelCadAluno9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno9.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno9.setText("Editar");

        jLabelCadAluno10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno10.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno10.setText("Excluir");

        jLabelCadAluno11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCadAluno11.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCadAluno11.setText("Receb/Pag");

        cadAlunoAcessojCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadAlunoAcessojCheckBox.setSelected(true);
        cadAlunoAcessojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAlunoAcessojCheckBoxActionPerformed(evt);
            }
        });

        cadAlunoCadastrarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadAlunoCadastrarjCheckBox.setSelected(true);
        cadAlunoCadastrarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAlunoCadastrarjCheckBoxActionPerformed(evt);
            }
        });

        cadAlunoEditarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadAlunoEditarjCheckBox.setSelected(true);
        cadAlunoEditarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAlunoEditarjCheckBoxActionPerformed(evt);
            }
        });

        cadAlunoExcluirjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadAlunoExcluirjCheckBox.setSelected(true);
        cadAlunoExcluirjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAlunoExcluirjCheckBoxActionPerformed(evt);
            }
        });

        cadAlunoRecebPagjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadAlunoRecebPagjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAlunoRecebPagjCheckBoxActionPerformed(evt);
            }
        });

        cadFuncRecebPagjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadFuncRecebPagjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFuncRecebPagjCheckBoxActionPerformed(evt);
            }
        });

        cadFuncExcluirjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadFuncExcluirjCheckBox.setSelected(true);
        cadFuncExcluirjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFuncExcluirjCheckBoxActionPerformed(evt);
            }
        });

        cadFuncEditarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadFuncEditarjCheckBox.setSelected(true);
        cadFuncEditarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFuncEditarjCheckBoxActionPerformed(evt);
            }
        });

        cadFuncCadastrarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadFuncCadastrarjCheckBox.setSelected(true);
        cadFuncCadastrarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFuncCadastrarjCheckBoxActionPerformed(evt);
            }
        });

        cadFunAcessojCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        cadFunAcessojCheckBox.setSelected(true);
        cadFunAcessojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFunAcessojCheckBoxActionPerformed(evt);
            }
        });

        avFisicaAcessojCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        avFisicaAcessojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avFisicaAcessojCheckBoxActionPerformed(evt);
            }
        });

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setEnabled(false);
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setEnabled(false);
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setEnabled(false);
        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setEnabled(false);
        jCheckBox37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox37ActionPerformed(evt);
            }
        });

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setEnabled(false);
        jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox38ActionPerformed(evt);
            }
        });

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setEnabled(false);
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setEnabled(false);
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setEnabled(false);
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        fichaTreinoAcessojCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        fichaTreinoAcessojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichaTreinoAcessojCheckBoxActionPerformed(evt);
            }
        });

        relatoriosAcessojCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        relatoriosAcessojCheckBox.setSelected(true);
        relatoriosAcessojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosAcessojCheckBoxActionPerformed(evt);
            }
        });

        relatorioCadastrarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        relatorioCadastrarjCheckBox.setEnabled(false);
        relatorioCadastrarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioCadastrarjCheckBoxActionPerformed(evt);
            }
        });

        relatorioEditarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        relatorioEditarjCheckBox.setEnabled(false);
        relatorioEditarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioEditarjCheckBoxActionPerformed(evt);
            }
        });

        relatorioExcluirjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        relatorioExcluirjCheckBox.setEnabled(false);
        relatorioExcluirjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioExcluirjCheckBoxActionPerformed(evt);
            }
        });

        relatorioRecebPagjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        relatorioRecebPagjCheckBox.setEnabled(false);
        relatorioRecebPagjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioRecebPagjCheckBoxActionPerformed(evt);
            }
        });

        lancarPagamentosAcessojCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        lancarPagamentosAcessojCheckBox.setSelected(true);
        lancarPagamentosAcessojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancarPagamentosAcessojCheckBoxActionPerformed(evt);
            }
        });

        LancarPagCadastrarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        LancarPagCadastrarjCheckBox.setSelected(true);
        LancarPagCadastrarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LancarPagCadastrarjCheckBoxActionPerformed(evt);
            }
        });

        LancarPagEditarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        LancarPagEditarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LancarPagEditarjCheckBoxActionPerformed(evt);
            }
        });

        LancarPagExcluirjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        LancarPagExcluirjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LancarPagExcluirjCheckBoxActionPerformed(evt);
            }
        });

        LancarPagRecebPagjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        LancarPagRecebPagjCheckBox.setSelected(true);
        LancarPagRecebPagjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LancarPagRecebPagjCheckBoxActionPerformed(evt);
            }
        });

        controleCaixaAcessojCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        controleCaixaAcessojCheckBox.setSelected(true);
        controleCaixaAcessojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleCaixaAcessojCheckBoxActionPerformed(evt);
            }
        });

        controleCaixaCadastrarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        controleCaixaCadastrarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleCaixaCadastrarjCheckBoxActionPerformed(evt);
            }
        });

        controleCaixaEditarjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        controleCaixaEditarjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleCaixaEditarjCheckBoxActionPerformed(evt);
            }
        });

        controleCaixaExcluirjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        controleCaixaExcluirjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleCaixaExcluirjCheckBoxActionPerformed(evt);
            }
        });

        controleCaixaRecebPagjCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        controleCaixaRecebPagjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleCaixaRecebPagjCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCadAluno7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCadAluno8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCadAluno9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCadAluno10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelCadAluno11)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelCadAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(avFisicaAcessojCheckBox)
                                        .addGap(43, 43, 43)
                                        .addComponent(jCheckBox16)
                                        .addGap(53, 53, 53)
                                        .addComponent(jCheckBox23)
                                        .addGap(42, 42, 42)
                                        .addComponent(jCheckBox30)
                                        .addGap(69, 69, 69)
                                        .addComponent(jCheckBox37)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelCadAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(fichaTreinoAcessojCheckBox)
                                        .addGap(43, 43, 43)
                                        .addComponent(jCheckBox17)
                                        .addGap(53, 53, 53)
                                        .addComponent(jCheckBox24)
                                        .addGap(42, 42, 42)
                                        .addComponent(jCheckBox31)
                                        .addGap(70, 70, 70)
                                        .addComponent(jCheckBox38)
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelCadAluno4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(relatoriosAcessojCheckBox)
                                        .addGap(43, 43, 43)
                                        .addComponent(relatorioCadastrarjCheckBox)
                                        .addGap(53, 53, 53)
                                        .addComponent(relatorioEditarjCheckBox)
                                        .addGap(42, 42, 42)
                                        .addComponent(relatorioExcluirjCheckBox)
                                        .addGap(69, 69, 69)
                                        .addComponent(relatorioRecebPagjCheckBox)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(cadAlunoAcessojCheckBox)
                                        .addGap(43, 43, 43)
                                        .addComponent(cadAlunoCadastrarjCheckBox)
                                        .addGap(53, 53, 53)
                                        .addComponent(cadAlunoEditarjCheckBox)
                                        .addGap(42, 42, 42)
                                        .addComponent(cadAlunoExcluirjCheckBox)
                                        .addGap(71, 71, 71)
                                        .addComponent(cadAlunoRecebPagjCheckBox)
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelCadAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(cadFunAcessojCheckBox)
                                        .addGap(43, 43, 43)
                                        .addComponent(cadFuncCadastrarjCheckBox)
                                        .addGap(53, 53, 53)
                                        .addComponent(cadFuncEditarjCheckBox)
                                        .addGap(42, 42, 42)
                                        .addComponent(cadFuncExcluirjCheckBox)
                                        .addGap(71, 71, 71)
                                        .addComponent(cadFuncRecebPagjCheckBox)
                                        .addGap(34, 34, 34)))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCadAluno5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(lancarPagamentosAcessojCheckBox)
                                .addGap(43, 43, 43)
                                .addComponent(LancarPagCadastrarjCheckBox)
                                .addGap(53, 53, 53)
                                .addComponent(LancarPagEditarjCheckBox)
                                .addGap(42, 42, 42)
                                .addComponent(LancarPagExcluirjCheckBox)
                                .addGap(73, 73, 73)
                                .addComponent(LancarPagRecebPagjCheckBox)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelCadAluno6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(controleCaixaAcessojCheckBox)
                                .addGap(43, 43, 43)
                                .addComponent(controleCaixaCadastrarjCheckBox)
                                .addGap(53, 53, 53)
                                .addComponent(controleCaixaEditarjCheckBox)
                                .addGap(42, 42, 42)
                                .addComponent(controleCaixaExcluirjCheckBox)
                                .addGap(71, 71, 71)
                                .addComponent(controleCaixaRecebPagjCheckBox)
                                .addGap(56, 56, 56)))))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadAluno7)
                    .addComponent(jLabelCadAluno8)
                    .addComponent(jLabelCadAluno9)
                    .addComponent(jLabelCadAluno10)
                    .addComponent(jLabelCadAluno11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadAluno)
                    .addComponent(cadAlunoCadastrarjCheckBox)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadAlunoAcessojCheckBox)
                            .addComponent(cadAlunoRecebPagjCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cadAlunoEditarjCheckBox)
                    .addComponent(cadAlunoExcluirjCheckBox))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadFuncCadastrarjCheckBox)
                            .addComponent(cadFuncEditarjCheckBox)
                            .addComponent(cadFuncExcluirjCheckBox)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadFunAcessojCheckBox)
                                    .addComponent(jLabelCadAluno1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadFuncRecebPagjCheckBox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox30)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(avFisicaAcessojCheckBox)
                                    .addComponent(jLabelCadAluno2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox37)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox17)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fichaTreinoAcessojCheckBox)
                                .addComponent(jLabelCadAluno3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jCheckBox38, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox31))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(relatorioCadastrarjCheckBox)
                            .addComponent(relatorioEditarjCheckBox)
                            .addComponent(relatorioExcluirjCheckBox)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(relatoriosAcessojCheckBox)
                                    .addComponent(jLabelCadAluno4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(relatorioRecebPagjCheckBox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LancarPagCadastrarjCheckBox)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lancarPagamentosAcessojCheckBox)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabelCadAluno5))
                            .addComponent(LancarPagRecebPagjCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LancarPagEditarjCheckBox)
                    .addComponent(LancarPagExcluirjCheckBox))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(controleCaixaCadastrarjCheckBox)
                            .addComponent(controleCaixaEditarjCheckBox)
                            .addComponent(controleCaixaExcluirjCheckBox)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(controleCaixaAcessojCheckBox)
                                    .addComponent(jLabelCadAluno6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(controleCaixaRecebPagjCheckBox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Permissão de Acesso", jPanel2);

        javax.swing.GroupLayout jPanelACessoLayout = new javax.swing.GroupLayout(jPanelACesso);
        jPanelACesso.setLayout(jPanelACessoLayout);
        jPanelACessoLayout.setHorizontalGroup(
            jPanelACessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
            .addGroup(jPanelACessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelACessoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelACessoLayout.setVerticalGroup(
            jPanelACessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(jPanelACessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelACessoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Acesso", jPanelACesso);

        jPaneAdicionais.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDados.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabelDados.setForeground(new java.awt.Color(45, 118, 232));
        jLabelDados.setText("Dados Adicionais");

        jLabelFuncao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFuncao.setForeground(new java.awt.Color(45, 118, 232));
        jLabelFuncao.setText("Função");

        jComboBoxFuncaoFuncionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxFuncaoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Instrutor", "Administrador" }));
        jComboBoxFuncaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuncaoFuncionarioActionPerformed(evt);
            }
        });

        jCheckBoxPROFAV.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxPROFAV.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCheckBoxPROFAV.setText("Professor/Avaliador");
        jCheckBoxPROFAV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxPROFAVMouseClicked(evt);
            }
        });
        jCheckBoxPROFAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPROFAVActionPerformed(evt);
            }
        });

        jLabelCRF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCRF.setForeground(new java.awt.Color(45, 118, 232));
        jLabelCRF.setText("CRF");

        jTextFieldCRf.setEditable(false);
        jTextFieldCRf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextFieldCRf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCRfActionPerformed(evt);
            }
        });

        jLabelDataAd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelDataAd.setForeground(new java.awt.Color(45, 118, 232));
        jLabelDataAd.setText("Data admissão");

        jLabelDataDe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelDataDe.setForeground(new java.awt.Color(45, 118, 232));
        jLabelDataDe.setText("Data demissão");

        jLabelSal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSal.setForeground(new java.awt.Color(45, 118, 232));
        jLabelSal.setText("Salário");

        jTextFieldSalario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        dataAdmjDateChooser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        dataDemjDateChooser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPaneAdicionaisLayout = new javax.swing.GroupLayout(jPaneAdicionais);
        jPaneAdicionais.setLayout(jPaneAdicionaisLayout);
        jPaneAdicionaisLayout.setHorizontalGroup(
            jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneAdicionaisLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelDados)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPaneAdicionaisLayout.createSequentialGroup()
                            .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPaneAdicionaisLayout.createSequentialGroup()
                                    .addComponent(jLabelFuncao)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneAdicionaisLayout.createSequentialGroup()
                                    .addComponent(jLabelCRF)
                                    .addGap(37, 37, 37)))
                            .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxFuncaoFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCRf))))
                    .addComponent(jLabelDataAd)
                    .addComponent(dataAdmjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPROFAV)
                    .addGroup(jPaneAdicionaisLayout.createSequentialGroup()
                        .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataDe)
                            .addComponent(dataDemjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSal)
                            .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPaneAdicionaisLayout.setVerticalGroup(
            jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneAdicionaisLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelDados)
                .addGap(45, 45, 45)
                .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncao)
                    .addComponent(jComboBoxFuncaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxPROFAV))
                .addGap(20, 20, 20)
                .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCRF)
                    .addComponent(jTextFieldCRf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataAd)
                    .addComponent(jLabelDataDe)
                    .addComponent(jLabelSal))
                .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneAdicionaisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(jPaneAdicionaisLayout.createSequentialGroup()
                        .addGroup(jPaneAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataDemjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataAdmjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Adicionais", jPaneAdicionais);

        jButtonSalvar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(716, 703));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jFormattedTextFieldCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCEPActionPerformed

    private void jTextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRGActionPerformed

    private void jComboBoxUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUfActionPerformed

    private void jFormattedTextFieldCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCelularActionPerformed

    private void jTextFieldLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLogradouroActionPerformed

    private void jTextFieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidadeActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jFormattedTextFieldCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPF1ActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        new FuncionariosJFrame().show();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        boolean cadastrar = Util.verificarCampos(jPanelCadastro);
        boolean controleDeAcesso = Util.verificarCampos(jPanel1);
        boolean permAcesso = Util.verificarCampos(jPanel2);
        
        try {
            if (cadastrar || controleDeAcesso || permAcesso) {
                if (Fachada.getFuncionarioLogado().isCadFuncCadastrar()) {
                    if (f.getId() == 0) {
                        f = getFuncionario();
                        projeto_gym.pro.Projeto_GYMPRO.fachada.cadastrarFuncionario(f);
                        if (jCheckBoxPROFAV.isSelected()) {
                            projeto_gym.pro.Projeto_GYMPRO.fachada.cadastrarInstrutor(i);
                        }
                        Mensagem.exibirMensagem("Funcionário cadastrado com sucesso!");
                    } else {
                        Fachada.getInstance().editarEndereco(f.getEndereco());
                        Fachada.getInstance().editarFuncionario(getFuncionario());
                        Mensagem.exibirMensagem("Funcionário editado com sucesso!");
                    }
                } else
                    Mensagem.exibirErro();
                dispose();
                return;
            }
        } catch (NullPointerException e) {
            if(jDateChooserNasc.getDate()==null){
                jDateChooserNasc.setBorder(new LineBorder(Color.RED));
            }
            if(dataAdmjDateChooser.getDate()==null){
                dataAdmjDateChooser.setBorder(new LineBorder(Color.RED));
            }
        }catch (NumberFormatException e) {}
        Mensagem.exibirMensagem("Dados incorretos! Alguns campos não foram inseridos\n"
                + "ou inseridos de forma incorreta!");
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSenhaActionPerformed

    private void cadAlunoAcessojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAlunoAcessojCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadAlunoAcessojCheckBoxActionPerformed

    private void cadAlunoCadastrarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAlunoCadastrarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadAlunoCadastrarjCheckBoxActionPerformed

    private void cadAlunoEditarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAlunoEditarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadAlunoEditarjCheckBoxActionPerformed

    private void cadAlunoExcluirjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAlunoExcluirjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadAlunoExcluirjCheckBoxActionPerformed

    private void cadAlunoRecebPagjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadAlunoRecebPagjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadAlunoRecebPagjCheckBoxActionPerformed

    private void cadFuncRecebPagjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFuncRecebPagjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadFuncRecebPagjCheckBoxActionPerformed

    private void cadFuncExcluirjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFuncExcluirjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadFuncExcluirjCheckBoxActionPerformed

    private void cadFuncEditarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFuncEditarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadFuncEditarjCheckBoxActionPerformed

    private void cadFuncCadastrarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFuncCadastrarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadFuncCadastrarjCheckBoxActionPerformed

    private void cadFunAcessojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFunAcessojCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadFunAcessojCheckBoxActionPerformed

    private void avFisicaAcessojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avFisicaAcessojCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avFisicaAcessojCheckBoxActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    private void jCheckBox37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox37ActionPerformed

    private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox38ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void fichaTreinoAcessojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichaTreinoAcessojCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fichaTreinoAcessojCheckBoxActionPerformed

    private void relatoriosAcessojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosAcessojCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatoriosAcessojCheckBoxActionPerformed

    private void relatorioCadastrarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioCadastrarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorioCadastrarjCheckBoxActionPerformed

    private void relatorioEditarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioEditarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorioEditarjCheckBoxActionPerformed

    private void relatorioExcluirjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioExcluirjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorioExcluirjCheckBoxActionPerformed

    private void relatorioRecebPagjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioRecebPagjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatorioRecebPagjCheckBoxActionPerformed

    private void lancarPagamentosAcessojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancarPagamentosAcessojCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lancarPagamentosAcessojCheckBoxActionPerformed

    private void LancarPagCadastrarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LancarPagCadastrarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LancarPagCadastrarjCheckBoxActionPerformed

    private void LancarPagEditarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LancarPagEditarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LancarPagEditarjCheckBoxActionPerformed

    private void LancarPagExcluirjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LancarPagExcluirjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LancarPagExcluirjCheckBoxActionPerformed

    private void LancarPagRecebPagjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LancarPagRecebPagjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LancarPagRecebPagjCheckBoxActionPerformed

    private void controleCaixaAcessojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleCaixaAcessojCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controleCaixaAcessojCheckBoxActionPerformed

    private void controleCaixaCadastrarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleCaixaCadastrarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controleCaixaCadastrarjCheckBoxActionPerformed

    private void controleCaixaEditarjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleCaixaEditarjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controleCaixaEditarjCheckBoxActionPerformed

    private void controleCaixaExcluirjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleCaixaExcluirjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controleCaixaExcluirjCheckBoxActionPerformed

    private void controleCaixaRecebPagjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleCaixaRecebPagjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controleCaixaRecebPagjCheckBoxActionPerformed

    private void jComboBoxFuncaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncaoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFuncaoFuncionarioActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jTextFieldCRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCRfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCRfActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldId3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldId3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldId3ActionPerformed

    private void jCheckBoxPROFAVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxPROFAVMouseClicked

    }//GEN-LAST:event_jCheckBoxPROFAVMouseClicked

    private void jCheckBoxPROFAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPROFAVActionPerformed
        if (jCheckBoxPROFAV.isSelected()) {
            jTextFieldCRf.setEditable(true);
            jComboBoxFuncaoFuncionario.setSelectedItem("Instrutor");
            jComboBoxFuncaoFuncionario.setEnabled(false);
        } else {
            jTextFieldCRf.setEditable(false);
            jComboBoxFuncaoFuncionario.setSelectedItem("Atendente");
            jComboBoxFuncaoFuncionario.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxPROFAVActionPerformed

    private void jFormattedTextFieldCPF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPF1KeyReleased
        if(Util.validarCPF(Util.prepararCPF(jFormattedTextFieldCPF1.getText()))){
            jFormattedTextFieldCPF1.setBorder(new LineBorder(Color.GREEN));
        }else
            jFormattedTextFieldCPF1.setBorder(new LineBorder(Color.RED));
    }//GEN-LAST:event_jFormattedTextFieldCPF1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox LancarPagCadastrarjCheckBox;
    private javax.swing.JCheckBox LancarPagEditarjCheckBox;
    private javax.swing.JCheckBox LancarPagExcluirjCheckBox;
    private javax.swing.JCheckBox LancarPagRecebPagjCheckBox;
    private javax.swing.JCheckBox avFisicaAcessojCheckBox;
    private javax.swing.JCheckBox cadAlunoAcessojCheckBox;
    private javax.swing.JCheckBox cadAlunoCadastrarjCheckBox;
    private javax.swing.JCheckBox cadAlunoEditarjCheckBox;
    private javax.swing.JCheckBox cadAlunoExcluirjCheckBox;
    private javax.swing.JCheckBox cadAlunoRecebPagjCheckBox;
    private javax.swing.JCheckBox cadFunAcessojCheckBox;
    private javax.swing.JCheckBox cadFuncCadastrarjCheckBox;
    private javax.swing.JCheckBox cadFuncEditarjCheckBox;
    private javax.swing.JCheckBox cadFuncExcluirjCheckBox;
    private javax.swing.JCheckBox cadFuncRecebPagjCheckBox;
    private javax.swing.JCheckBox controleCaixaAcessojCheckBox;
    private javax.swing.JCheckBox controleCaixaCadastrarjCheckBox;
    private javax.swing.JCheckBox controleCaixaEditarjCheckBox;
    private javax.swing.JCheckBox controleCaixaExcluirjCheckBox;
    private javax.swing.JCheckBox controleCaixaRecebPagjCheckBox;
    private com.toedter.calendar.JDateChooser dataAdmjDateChooser;
    private com.toedter.calendar.JDateChooser dataDemjDateChooser;
    private javax.swing.JCheckBox fichaTreinoAcessojCheckBox;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBoxPROFAV;
    private javax.swing.JComboBox<String> jComboBoxFuncaoFuncionario;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxUf;
    private com.toedter.calendar.JDateChooser jDateChooserNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelular;
    private javax.swing.JLabel jLabeFuncionario;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCRF;
    private javax.swing.JLabel jLabelCadAluno;
    private javax.swing.JLabel jLabelCadAluno1;
    private javax.swing.JLabel jLabelCadAluno10;
    private javax.swing.JLabel jLabelCadAluno11;
    private javax.swing.JLabel jLabelCadAluno2;
    private javax.swing.JLabel jLabelCadAluno3;
    private javax.swing.JLabel jLabelCadAluno4;
    private javax.swing.JLabel jLabelCadAluno5;
    private javax.swing.JLabel jLabelCadAluno6;
    private javax.swing.JLabel jLabelCadAluno7;
    private javax.swing.JLabel jLabelCadAluno8;
    private javax.swing.JLabel jLabelCadAluno9;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDN;
    private javax.swing.JLabel jLabelDados;
    private javax.swing.JLabel jLabelDataAd;
    private javax.swing.JLabel jLabelDataDe;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFuncao;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPesgunta1;
    private javax.swing.JLabel jLabelPesgunta2;
    private javax.swing.JLabel jLabelPesgunta3;
    private javax.swing.JLabel jLabelPesgunta4;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelSal;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPaneAdicionais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelACesso;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCRf;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldId3;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JCheckBox lancarPagamentosAcessojCheckBox;
    private javax.swing.JCheckBox relatorioCadastrarjCheckBox;
    private javax.swing.JCheckBox relatorioEditarjCheckBox;
    private javax.swing.JCheckBox relatorioExcluirjCheckBox;
    private javax.swing.JCheckBox relatorioRecebPagjCheckBox;
    private javax.swing.JCheckBox relatoriosAcessojCheckBox;
    // End of variables declaration//GEN-END:variables

    public Funcionario getFuncionario() {

        Date dataNasc = Util.converterCalendarToDate2(jDateChooserNasc.getCalendar());
        Date dataAdm = Util.converterCalendarToDate2(dataAdmjDateChooser.getCalendar());

        //isso ta certo?
        if (dataDemjDateChooser.getDateFormatString().equals("  /  /    ")) {
            Date dataDem = Util.converterCalendarToDate2(dataDemjDateChooser.getCalendar());
            f.setData_demissao(dataDem);
        }

        int num = Integer.parseInt(getjTextFieldNumero().getText());

        //CADASTRO:
        f.setNome(getjTextFieldNome().getText());
        f.setCpf(this.getjFormattedTextFieldCPF1().getText());
        f.setTelefone(this.getjFormattedTextFieldCelular().getText());
        f.setRg(getjTextFieldRG().getText());
        f.setEmail(getjTextFieldLogradouro1().getText());
        f.setData_nascimento(dataNasc);
        f.setSexo(getjComboBoxSexo().getSelectedItem().toString() + "");
        f.setStatus(getjComboBoxStatus().getSelectedItem().toString() + "");
        //ENDEREÇO:
        f.getEndereco().setBairro(getjTextFieldBairro().getText());
        f.getEndereco().setCidade(getjTextFieldCidade().getText());
        f.getEndereco().setLogradouro(getjTextFieldLogradouro().getText());
        f.getEndereco().setNum(num);
        f.getEndereco().setUf(getjComboBoxUf().getSelectedItem() + "");
        f.getEndereco().setCep(this.getjFormattedTextFieldCEP().getText());
        //ACESSO:
        // CONTROLE DE ACESSO:
        f.setLogin(getjTextFieldId4().getText());
        f.setSenha(getjTextFieldId2().getText());
        // PERMISSÃO DE ACESSO:
        f.setCadAlunoAcessar(getCadAlunoAcessojCheckBox().isSelected());
        f.setCadAlunoCadastrar(getCadAlunoCadastrarjCheckBox().isSelected());
        f.setCadAlunoEditar(getCadFuncEditarjCheckBox().isSelected());
        f.setCadAlunoExcluir(getCadFuncExcluirjCheckBox().isSelected());
        f.setCadAlunoRecebPag(getCadAlunoRecebPagjCheckBox().isSelected());
        f.setCadFuncAcessar(getCadFunAcessojCheckBox().isSelected());
        f.setCadFuncCadastrar(getCadFuncCadastrarjCheckBox().isSelected());
        f.setCadFuncEditar(getCadFuncEditarjCheckBox().isSelected());
        f.setCadFuncExcluir(getCadFuncExcluirjCheckBox().isSelected());
        f.setCadFuncRecebPag(getCadFuncRecebPagjCheckBox().isSelected());
        f.setAvFisicaAcessar(getAvFisicaAcessojCheckBox().isSelected());
        f.setFichaTreinoAcessar(getFichaTreinoAcessojCheckBox().isSelected());
        f.setRelatorioAcessar(getRelatoriosAcessojCheckBox().isSelected());
        f.setRelatorioCadastrar(getRelatorioCadastrarjCheckBox().isSelected());
        f.setRelatorioEditar(getRelatorioEditarjCheckBox().isSelected());
        f.setRelatorioExcluir(getRelatorioExcluirjCheckBox().isSelected());
        f.setRelatorioRecebPag(getRelatorioRecebPagjCheckBox().isSelected());
        f.setLancarPagAcessar(getLancarPagamentosAcessojCheckBox().isSelected());
        f.setLancarPagCadastrar(getLancarPagCadastrarjCheckBox().isSelected());
        f.setLancarPagEditar(getLancarPagEditarjCheckBox().isSelected());
        f.setLancarPagExcluir(getLancarPagExcluirjCheckBox().isSelected());
        f.setLancarPagRecebPag(getLancarPagamentosAcessojCheckBox().isSelected());
        f.setControleCaixaAcessar(getControleCaixaAcessojCheckBox().isSelected());
        f.setControleCaixaCadastrar(getControleCaixaCadastrarjCheckBox().isSelected());
        f.setControleCaixaEditar(getControleCaixaEditarjCheckBox().isSelected());
        f.setControleCaixaExcluir(getControleCaixaExcluirjCheckBox().isSelected());
        f.setControleCaixaRecebPag(getControleCaixaRecebPagjCheckBox().isSelected());
        //DADOS ADICIONAIS:
        f.setFuncao(getjComboBoxFuncaoFuncionario().getSelectedItem().toString() + "");
        f.setSalario(Float.parseFloat(jTextFieldSalario.getText()));
        f.setData_admissao(dataAdm);

        if (jCheckBoxPROFAV.isSelected()) {
            i.setCref(Integer.parseInt(jTextFieldCRf.getText()));
            i.setFuncionario(f);
        }

        return f;
    }

    public void setFuncionario(Funcionario f) {

        //CADASTRO:
        getjTextFieldNome().setText(f.getNome());
        getjFormattedTextFieldCPF1().setText(f.getCpf());
        this.getjFormattedTextFieldCelular().setText(f.getTelefone());
        getjTextFieldRG().setText(f.getRg());
        getjTextFieldLogradouro1().setText(f.getEmail());
        getjComboBoxSexo().setSelectedItem(f.getSexo());
        getjComboBoxStatus().setSelectedItem(f.getStatus());
        //ENDEREÇO:
        getjTextFieldBairro().setText(f.getEndereco().getBairro());
        getjTextFieldCidade().setText(f.getEndereco().getCidade());
        getjTextFieldLogradouro().setText(f.getEndereco().getLogradouro());
        getjTextFieldNumero().setText(f.getEndereco().getNum() + "");
        getjComboBoxUf().setSelectedItem(f.getEndereco().getUf());
        this.getjFormattedTextFieldCEP().setText(f.getEndereco().getCep());
        //ACESSO:
        // CONTROLE DE ACESSO:
        getjTextFieldId4().setText(f.getLogin());
        getjTextFieldId2().setText(f.getSenha());
        // PERMISSÃO DE ACESSO:
        getCadAlunoAcessojCheckBox().setSelected(f.isCadAlunoAcessar());
        getCadAlunoCadastrarjCheckBox().setSelected(f.isCadAlunoCadastrar());
        getCadFuncEditarjCheckBox().setSelected(f.isCadAlunoEditar());
        getCadFuncExcluirjCheckBox().setSelected(f.isCadAlunoExcluir());
        getCadAlunoRecebPagjCheckBox().setSelected(f.isCadAlunoRecebPag());
        getCadFunAcessojCheckBox().setSelected(f.isCadFuncAcessar());
        getCadFuncCadastrarjCheckBox().setSelected(f.isCadFuncCadastrar());
        getCadFuncEditarjCheckBox().setSelected(f.isCadFuncEditar());
        getCadFuncExcluirjCheckBox().setSelected(f.isCadFuncExcluir());
        getCadFuncRecebPagjCheckBox().setSelected(f.isCadFuncRecebPag());
        getAvFisicaAcessojCheckBox().setSelected(f.isAvFisicaAcessar());
        getFichaTreinoAcessojCheckBox().setSelected(f.isFichaTreinoAcessar());
        getRelatoriosAcessojCheckBox().setSelected(f.isRelatorioAcessar());
        getRelatorioCadastrarjCheckBox().setSelected(f.isRelatorioCadastrar());
        getRelatorioEditarjCheckBox().setSelected(f.isRelatorioEditar());
        getRelatorioExcluirjCheckBox().setSelected(f.isRelatorioExcluir());
        getRelatorioRecebPagjCheckBox().setSelected(f.isRelatorioRecebPag());
        getLancarPagamentosAcessojCheckBox().setSelected(f.isLancarPagAcessar());
        getLancarPagCadastrarjCheckBox().setSelected(f.isLancarPagCadastrar());
        getLancarPagEditarjCheckBox().setSelected(f.isLancarPagEditar());
        getLancarPagExcluirjCheckBox().setSelected(f.isLancarPagExcluir());
        getLancarPagamentosAcessojCheckBox().setSelected(f.isLancarPagRecebPag());
        getControleCaixaAcessojCheckBox().setSelected(f.isControleCaixaAcessar());
        getControleCaixaCadastrarjCheckBox().setSelected(f.isControleCaixaCadastrar());
        getControleCaixaEditarjCheckBox().setSelected(f.isControleCaixaEditar());
        getControleCaixaExcluirjCheckBox().setSelected(f.isControleCaixaExcluir());
        getControleCaixaRecebPagjCheckBox().setSelected(f.isControleCaixaRecebPag());
        //DADOS ADICIONAIS:
        getjComboBoxFuncaoFuncionario().setSelectedItem(f.getFuncao());
        jTextFieldSalario.setText(f.getSalario() + "");
        dataAdmjDateChooser.setDate(f.getData_admissao());
        jDateChooserNasc.setDate(f.getData_nascimento());
        dataDemjDateChooser.setDate(f.getData_demissao());
        i = Fachada.getInstance().getByFuncionario_IdInstrutor(f.getId());

        if (i != null) {
            jTextFieldCRf.setText(i.getCref() + "");
            jComboBoxFuncaoFuncionario.setSelectedItem("Instrutor");
            jComboBoxFuncaoFuncionario.enable();
            jCheckBoxPROFAV.setSelected(true);
        }
        jTextFieldId.setText(f.getId() + "");

        this.f = f;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    public JFormattedTextField getjFormattedTextFieldCEP() {
        return jFormattedTextFieldCEP;
    }

    public JFormattedTextField getjFormattedTextFieldCPF1() {
        return jFormattedTextFieldCPF1;
    }

    public JFormattedTextField getjFormattedTextFieldCelular() {
        return jFormattedTextFieldCelular;
    }

    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }

    public JTextField getjTextFieldCRf() {
        return jTextFieldCRf;
    }

    public JTextField getjTextFieldCidade() {
        return jTextFieldCidade;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public JTextField getjTextFieldId2() {
        return jTextFieldSenha;
    }

    public JTextField getjTextFieldId3() {
        return jTextFieldId3;
    }

    public JTextField getjTextFieldId4() {
        return jTextFieldLogin;
    }

    public JTextField getjTextFieldLogradouro() {
        return jTextFieldLogradouro;
    }

    public JTextField getjTextFieldLogradouro1() {
        return jTextFieldEmail;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public JTextField getjTextFieldNumero() {
        return jTextFieldNumero;
    }

    public JTextField getjTextFieldRG() {
        return jTextFieldRG;
    }

    public JComboBox<String> getjComboBoxFuncaoFuncionario() {
        return jComboBoxFuncaoFuncionario;
    }

    public JComboBox<String> getjComboBoxSexo() {
        return jComboBoxSexo;
    }

    public JComboBox<String> getjComboBoxStatus() {
        return jComboBoxStatus;
    }

    public JComboBox<String> getjComboBoxUf() {
        return jComboBoxUf;
    }

    public JCheckBox getAvFisicaAcessojCheckBox() {
        return avFisicaAcessojCheckBox;
    }

    public JCheckBox getCadAlunoAcessojCheckBox() {
        return cadAlunoAcessojCheckBox;
    }

    public JCheckBox getCadFunAcessojCheckBox() {
        return cadFunAcessojCheckBox;
    }

    public JCheckBox getControleCaixaAcessojCheckBox() {
        return controleCaixaAcessojCheckBox;
    }

    public JCheckBox getFichaTreinoAcessojCheckBox() {
        return fichaTreinoAcessojCheckBox;
    }

    public JCheckBox getLancarPagamentosAcessojCheckBox() {
        return lancarPagamentosAcessojCheckBox;
    }

    public JCheckBox getRelatoriosAcessojCheckBox() {
        return relatoriosAcessojCheckBox;
    }

    public JCheckBox getLancarPagCadastrarjCheckBox() {
        return LancarPagCadastrarjCheckBox;
    }

    public JCheckBox getLancarPagEditarjCheckBox() {
        return LancarPagEditarjCheckBox;
    }

    public JCheckBox getLancarPagExcluirjCheckBox() {
        return LancarPagExcluirjCheckBox;
    }

    public JCheckBox getLancarPagRecebPagjCheckBox() {
        return LancarPagRecebPagjCheckBox;
    }

    public JCheckBox getCadAlunoCadastrarjCheckBox() {
        return cadAlunoCadastrarjCheckBox;
    }

    public JCheckBox getCadAlunoEditarjCheckBox() {
        return cadAlunoEditarjCheckBox;
    }

    public JCheckBox getCadAlunoExcluirjCheckBox() {
        return cadAlunoExcluirjCheckBox;
    }

    public JCheckBox getCadAlunoRecebPagjCheckBox() {
        return cadAlunoRecebPagjCheckBox;
    }

    public JCheckBox getCadFuncCadastrarjCheckBox() {
        return cadFuncCadastrarjCheckBox;
    }

    public JCheckBox getCadFuncEditarjCheckBox() {
        return cadFuncEditarjCheckBox;
    }

    public JCheckBox getCadFuncExcluirjCheckBox() {
        return cadFuncExcluirjCheckBox;
    }

    public JCheckBox getCadFuncRecebPagjCheckBox() {
        return cadFuncRecebPagjCheckBox;
    }

    public JCheckBox getControleCaixaCadastrarjCheckBox() {
        return controleCaixaCadastrarjCheckBox;
    }

    public JCheckBox getControleCaixaEditarjCheckBox() {
        return controleCaixaEditarjCheckBox;
    }

    public JCheckBox getControleCaixaExcluirjCheckBox() {
        return controleCaixaExcluirjCheckBox;
    }

    public JCheckBox getControleCaixaRecebPagjCheckBox() {
        return controleCaixaRecebPagjCheckBox;
    }

    public JCheckBox getjCheckBoxPROFAV() {
        return jCheckBoxPROFAV;
    }

    public JCheckBox getRelatorioCadastrarjCheckBox() {
        return relatorioCadastrarjCheckBox;
    }

    public JCheckBox getRelatorioEditarjCheckBox() {
        return relatorioEditarjCheckBox;
    }

    public JCheckBox getRelatorioExcluirjCheckBox() {
        return relatorioExcluirjCheckBox;
    }

    public JCheckBox getRelatorioRecebPagjCheckBox() {
        return relatorioRecebPagjCheckBox;
    }

}
