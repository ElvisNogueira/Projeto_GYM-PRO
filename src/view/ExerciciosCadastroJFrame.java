/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import projeto_gym.pro.Projeto_GYMPRO;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import model.Exercicio;
import projeto_gym.pro.Util;

/**
 *
 * @author Insinuante
 */
public class ExerciciosCadastroJFrame extends javax.swing.JFrame {
    private Exercicio e;
    /**
     * Creates new form AlunosJFrame
     */
    public ExerciciosCadastroJFrame() {
        Util.lookAndFeel();
        e=new Exercicio();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        jLabeAlunos = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabelNomeExer = new javax.swing.JLabel();
        jTextFieldNomeExer = new javax.swing.JTextField();
        jLabelProcurar1 = new javax.swing.JLabel();
        jComboBoxTipoExerc = new javax.swing.JComboBox<>();
        jTextFieldId = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de exercícios físicos");

        jPanelBack.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        jLabeAlunos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabeAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jLabeAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bench-press_White.png"))); // NOI18N
        jLabeAlunos.setText(" Exercícios Físicos");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabeAlunos)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBlueLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabeAlunos)
                .addGap(28, 28, 28))
        );

        jButtonCancelar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Excluir avaliação fisica");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Editar avaliação fisica");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelNomeExer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNomeExer.setForeground(new java.awt.Color(45, 118, 232));
        jLabelNomeExer.setText("Nome");

        jTextFieldNomeExer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeExerActionPerformed(evt);
            }
        });

        jLabelProcurar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelProcurar1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelProcurar1.setText("Tipo do exercício");

        jComboBoxTipoExerc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxTipoExerc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abdome", "Aeróbico", "Antebraço", "Bíceps", "Costas", "Glúteo", "Ombro", "Peito", "Perna", "Tríceps" }));
        jComboBoxTipoExerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoExercActionPerformed(evt);
            }
        });

        jTextFieldId.setEditable(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabelId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(45, 118, 232));
        jLabelId.setText("Id");

        javax.swing.GroupLayout jPanelBackLayout = new javax.swing.GroupLayout(jPanelBack);
        jPanelBack.setLayout(jPanelBackLayout);
        jPanelBackLayout.setHorizontalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBackLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBackLayout.createSequentialGroup()
                        .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxTipoExerc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabelProcurar1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeExer, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeExer))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBackLayout.setVerticalGroup(
            jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackLayout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelNomeExer))
                .addGap(20, 20, 20)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeExer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelProcurar1)
                .addGap(21, 21, 21)
                .addComponent(jComboBoxTipoExerc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(716, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Exercicio e = getExercicio();
        if(e.getNome().isEmpty()){
            jTextFieldNomeExer.setBorder(new LineBorder(Color.RED));
            Mensagem.exibirMensagem("O campo nome do exercício está em branco!");
        }else{
            if(e.getId()==0)
                projeto_gym.pro.Projeto_GYMPRO.fachada.cadastrarExercicio(e);
            else
                fachada.Fachada.getInstance().editarExercicio(e);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNomeExerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeExerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeExerActionPerformed

    private void jComboBoxTipoExercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoExercActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoExercActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipoExerc;
    private javax.swing.JLabel jLabeAlunos;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNomeExer;
    private javax.swing.JLabel jLabelProcurar1;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeExer;
    // End of variables declaration//GEN-END:variables

    public Exercicio getExercicio(){
        e.setNome(jTextFieldNomeExer.getText());
        e.setTipo(jComboBoxTipoExerc.getSelectedItem()+"");
        if(!jTextFieldId.getText().isEmpty()){
            e.setId(Integer.parseInt(jTextFieldId.getText()));
        }
        return e;
    }
    
    public void setExercicio(Exercicio e){
        jTextFieldId.setText(e.getId()+"");
        jTextFieldNomeExer.setText(e.getNome());
        jComboBoxTipoExerc.setSelectedItem(e.getTipo());
    }
    
    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public JTextField getjTextFieldNomeExer() {
        return jTextFieldNomeExer;
    }

    public JComboBox<String> getjComboBoxTipoExerc() {
        return jComboBoxTipoExerc;
    }
    
    
    

}
