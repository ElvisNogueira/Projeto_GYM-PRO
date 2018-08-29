/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import projeto_gym.pro.Util;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import fachada.Fachada;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import model.ControleFinanceiro;
import model.FichaExercicio;
import model.ModeloTabela;

/**
 *
 * @author Insinuante
 */
public class VisualizarFichaTreino extends javax.swing.JFrame {
    
    ArrayList<FichaExercicio> seg;
    ArrayList<FichaExercicio> ter;
    ArrayList<FichaExercicio> qua;
    ArrayList<FichaExercicio> qui;
    ArrayList<FichaExercicio> sex;
    ArrayList<FichaExercicio> sab;
    ArrayList<FichaExercicio> dom;
    /**
     * Creates new form NewJFrameLogin
     */
    public VisualizarFichaTreino() {
        initComponents();
        carregarTabelar();
    }

    public VisualizarFichaTreino(ArrayList<FichaExercicio> seg, ArrayList<FichaExercicio> ter, 
        ArrayList<FichaExercicio> qua, ArrayList<FichaExercicio> qui, ArrayList<FichaExercicio> sex, 
        ArrayList<FichaExercicio> sab, ArrayList<FichaExercicio> dom) {
        initComponents();
        this.seg = seg;
        this.ter = ter;
        this.qua = qua;
        this.qui = qui;
        this.sex = sex;
        this.sab = sab;
        this.dom = dom;
        carregarTabelar();
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        cabjLabe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treinoDiajTable = new javax.swing.JTable();
        gerarPDFjButton = new javax.swing.JButton();
        jComboBoxdia = new javax.swing.JComboBox<>();
        jLabelSexo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fluxo do caixa");
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBlue.setBackground(new java.awt.Color(45, 118, 232));

        cabjLabe.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        cabjLabe.setForeground(new java.awt.Color(255, 255, 255));
        cabjLabe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list_white.png"))); // NOI18N
        cabjLabe.setText(" Fluxo do caixa");

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(cabjLabe)
                .addContainerGap(888, Short.MAX_VALUE))
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBlueLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cabjLabe)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        treinoDiajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Descrição", "Hístorico", "Valor"
            }
        ));
        jScrollPane1.setViewportView(treinoDiajTable);

        gerarPDFjButton.setBackground(new java.awt.Color(45, 118, 232));
        gerarPDFjButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gerarPDFjButton.setForeground(new java.awt.Color(255, 255, 255));
        gerarPDFjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Download_25px.png"))); // NOI18N
        gerarPDFjButton.setText(" Gerar Relatório ");
        gerarPDFjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarPDFjButtonActionPerformed(evt);
            }
        });

        jComboBoxdia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" }));
        jComboBoxdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxdiaActionPerformed(evt);
            }
        });

        jLabelSexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelSexo.setText("Dia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxdia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                            .addComponent(gerarPDFjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(100, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxdia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(gerarPDFjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1286, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gerarPDFjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarPDFjButtonActionPerformed
        gerarPDF(Fachada.getInstance().getAllControleFinanceiro());
    }//GEN-LAST:event_gerarPDFjButtonActionPerformed

    private void jComboBoxdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxdiaActionPerformed
        carregarTabelar();
    }//GEN-LAST:event_jComboBoxdiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cabjLabe;
    private javax.swing.JButton gerarPDFjButton;
    private javax.swing.JComboBox<String> jComboBoxdia;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable treinoDiajTable;
    // End of variables declaration//GEN-END:variables
    
    private void carregarTabelar(){
        String[] colunas = new String[]{"Exercício","Série","Rep.","Obs"};
        ArrayList<Object[]> dados = new ArrayList<>();
        
        if((jComboBoxdia.getSelectedItem()+"").equals("Segunda")){
            for(FichaExercicio f: seg)
                dados.add(new Object[]{f.getExercicio().getNome(),f.getSerie(),f.getRepeticoes(),f.getObs()});
        }else if((jComboBoxdia.getSelectedItem()+"").equals("Terça")){
            for(FichaExercicio f: ter)
                dados.add(new Object[]{f.getExercicio().getNome(),f.getSerie(),f.getRepeticoes(),f.getObs()});
        }else if((jComboBoxdia.getSelectedItem()+"").equals("Quarta")){
            for(FichaExercicio f: qua)
                dados.add(new Object[]{f.getExercicio().getNome(),f.getSerie(),f.getRepeticoes(),f.getObs()});
        }else if((jComboBoxdia.getSelectedItem()+"").equals("Quinta")){
            for(FichaExercicio f: qui)
                dados.add(new Object[]{f.getExercicio().getNome(),f.getSerie(),f.getRepeticoes(),f.getObs()});
        }else if((jComboBoxdia.getSelectedItem()+"").equals("Sexta")){
            for(FichaExercicio f: sex)
                dados.add(new Object[]{f.getExercicio().getNome(),f.getSerie(),f.getRepeticoes(),f.getObs()});
        }else if((jComboBoxdia.getSelectedItem()+"").equals("Sábado")){
            for(FichaExercicio f: sab)
                dados.add(new Object[]{f.getExercicio().getNome(),f.getSerie(),f.getRepeticoes(),f.getObs()});
        }else if((jComboBoxdia.getSelectedItem()+"").equals("Domingo")){ 
            for(FichaExercicio f: dom)
                dados.add(new Object[]{f.getExercicio().getNome(),f.getSerie(),f.getRepeticoes(),f.getObs()});
        }
        
        
        ModeloTabela modeloTabela =  new ModeloTabela(dados, colunas);   
        treinoDiajTable.setModel(modeloTabela);      
        treinoDiajTable.getColumnModel().getColumn(0).setPreferredWidth(450);
        treinoDiajTable.getColumnModel().getColumn(0).setResizable(false);
        treinoDiajTable.getColumnModel().getColumn(1).setPreferredWidth(54);
        treinoDiajTable.getColumnModel().getColumn(1).setResizable(false);
        treinoDiajTable.getColumnModel().getColumn(2).setPreferredWidth(55);
        treinoDiajTable.getColumnModel().getColumn(2).setResizable(false);
        treinoDiajTable.getColumnModel().getColumn(3).setPreferredWidth(508);
        treinoDiajTable.getColumnModel().getColumn(3).setResizable(false);
        treinoDiajTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    public void gerarPDF(ArrayList<ControleFinanceiro> financeiro){
        Document doc = new Document();
        String end = "";
        try {
            end = AlunosFichaExercicioJFrame.salvarcomo(this);
            PdfWriter.getInstance(doc, new FileOutputStream(end+"/Relatorio do Fluxo do caixa.pdf"));
            
            Font fontCab = new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD,BaseColor.BLACK);
            Font fontTexto = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.NORMAL,BaseColor.BLACK);
            PdfPTable table = new PdfPTable(5);
            
            table.addCell(new Paragraph("Id", fontTexto));
            table.addCell(new Paragraph("Data", fontTexto));
            table.addCell(new Paragraph("Hístorico", fontTexto));
            table.addCell(new Paragraph("Descrição", fontTexto));
            table.addCell(new Paragraph("Valor", fontTexto));
            
            ArrayList<ControleFinanceiro> financeiroLista = new ArrayList<>();
            
            for(ControleFinanceiro c : financeiro){
                financeiroLista.add(c);
            }
            
            for(ControleFinanceiro c : financeiroLista){
                table.addCell(new Paragraph(""+c.getId(), fontTexto));
                table.addCell(new Paragraph(""+c.getData(), fontTexto));                
                table.addCell(new Paragraph(""+c.getDescricao(), fontTexto));  
                table.addCell(new Paragraph(""+c.getConta().getDescricao(), fontTexto));              
                table.addCell(new Paragraph(""+c.getValor(), fontTexto));
            }
                     
            doc.open();            
            doc.add(new Paragraph(Util.getDatasRel(new java.util.Date()),fontTexto));
            doc.add(new Paragraph("GYM - Relatorio do Fluxo do caixa\n\n",fontCab));
            doc.add(table);
            
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            doc.close();
        }
        
        try {
            Desktop.getDesktop().open(new File(end+"/Relatorio do Fluxo do caixa.pdf"));
        } catch (IOException ex) {
            Logger.getLogger(RelatoriListaFunJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}