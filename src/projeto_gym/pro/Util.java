/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_gym.pro;

import fachada.Fachada;
import java.awt.Component;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import javafx.scene.paint.Color;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import model.Aluno;
import model.Conta;
import model.FichaExercicio;
import model.Pagamento;
import model.Parcelas;
import view.AlunosLancarFaturaJFrame;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class Util {
    
    
    public static Date getDate(String d){
        d = d.replaceAll("/", "");
        int ano = (Integer.parseInt(d.substring(4, 8))) - 1900;
        int mes = (Integer.parseInt(d.substring(2, 4))) - 1;
        int dia = (Integer.parseInt(d.substring(0, 2)));
        
        Date data = new Date(ano, mes, dia);
        return data;
    }
    
    public static String getDateString(Date date){
        if(date == null)
            return "esta data está vazia";
        String data = date.toString();
        data = data.replaceAll("-", "");
        String ano = data.substring(0, 4);
        String mes = data.substring(4, 6);
        String dia = data.substring(6, 8);
       
        data = dia+mes+ano;
        return data;
    }
    
    public static String getDatasRel(java.util.Date date){
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatar.format(date);
        return dataFormatada;
    }
    
    public static Date converterCalendarToDate(Calendar cal){
        
        Date d = new Date(cal.getInstance().get(GregorianCalendar.YEAR)-1900, cal.getInstance().get(GregorianCalendar.
                MONTH),cal.get(GregorianCalendar.DAY_OF_MONTH));
        int dia = cal.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = cal.getInstance().get(GregorianCalendar.MONTH);
        int ano = cal.getInstance().get(GregorianCalendar.YEAR);
        String c = "";
        if(cal.get(GregorianCalendar.MONTH)>9)
            c =(cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"
                +(cal.get(GregorianCalendar.MONTH))+"/"+(cal.get(GregorianCalendar.YEAR)-1900));
        else
            c =(cal.get(GregorianCalendar.DAY_OF_MONTH)+"/0"
                +(cal.get(GregorianCalendar.MONTH))+"/"+(cal.get(GregorianCalendar.YEAR)-1900));
        if(dia<10)
            c = "0"+c;       
        return getDate(c);  
    }
    
    public static Date converterCalendarToDate2(Calendar cal){
//        int dia = cal.get(GregorianCalendar.DAY_OF_MONTH);
//        int mes = cal.getInstance().get(GregorianCalendar.MONTH)+1;
//        int ano = cal.getInstance().get(GregorianCalendar.YEAR);
        int dia = cal.getTime().getDay();
        int mes = cal.getTime().getMonth()+1;
        int ano = cal.getTime().getYear()+1900;
        String c = "";
        if(mes>9)
            c =(dia+"/"+mes+"/"+ano);
        else
            c =(dia+"/0"+mes+"/"+ano);
        if(dia<10)
            c = "0"+c;
        System.out.println(c);
        return getDate(c);
    }
    
    public static Float imc(float peso, float altura){
        float a = altura/100;
        return peso/(a*a);
    }
    
    public static Float rcq(float cintura, float quadril){
        return cintura/quadril;
    }
    
    public static void criarMensalidade(Aluno a){
        int numPrcelas=0;
        int dia = a.getVencimento_mens();
        int mes = Calendar.getInstance().get(GregorianCalendar.MONTH);
        int ano = Calendar.getInstance().get(GregorianCalendar.YEAR);
        Date d = new Date(ano,mes,dia);
        Parcelas p = new Parcelas();
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        if(!(a.getPlano().equals("Diário") || a.getPlano().equals("Semanal") || a.getPlano().equals("Quinzenal"))){
            cal.add(Calendar.MONTH, 2);
        }
        
        if(a.getPlano().equals("Diário"))
            numPrcelas=1;
        else if(a.getPlano().equals("Semanal")){
            numPrcelas=1;
            cal.add(Calendar.DAY_OF_MONTH, 7);
        }else if(a.getPlano().equals("Quinzenal")){
            numPrcelas=1;
            cal.add(Calendar.DAY_OF_MONTH, 15);
        }else if(a.getPlano().equals("Mensal"))
            numPrcelas=1;
        else if(a.getPlano().equals("Trimestral"))
            numPrcelas=3;
        else if(a.getPlano().equals("Semestral"))
             numPrcelas=6;   
        else
            numPrcelas=12;
        
        for(int i=0;i<numPrcelas;i++){
            p.setData_de_Vencimento(converterCalendarToDate(cal));
            if((a.getPlano().equals("Semanal") || a.getPlano().equals("Quinzenal"))){
                a.setVencimento_mens(cal.get(cal.DAY_OF_MONTH));
            }
            Fachada.getInstance().editarAluno(a);
            p.setAlunos(a);
            
            p.setValor(a.getValorPlano()/numPrcelas);      
            Conta con = Fachada.getInstance().getByNomeConta("Mensalidade");
            p.setConta(con);
            if((a.getPlano().equals("Semanal") || a.getPlano().equals("Quinzenal")))
                p.setStatus("Em aberto");
            else
                p.setStatus("Pago");
            
            Fachada.getInstance().cadastrarParcelas(p);
            if(!(a.getPlano().equals("Diário") || a.getPlano().equals("Semanal") || a.getPlano().equals("Quinzenal"))){
                cal.add(Calendar.MONTH, 1);
                Pagamento pag = new Pagamento();
                pag.setAluno(a);
                pag.setDataVenc(p.getData_de_Vencimento()); 
                
                pag.setFuncionario(Fachada.getFuncionarioLogado());
                pag.setServico(p.getConta().getDescricao());
                pag.setValor(p.getValor());
                
                AlunosLancarFaturaJFrame tela = new AlunosLancarFaturaJFrame(pag, a);
                tela.set();
                tela.lancarAuto();
                System.out.println("projeto_gym.pro.Util.criarMensalidade()");
            }
        }
         
    }
    
    public static void atualizarMensalidades(){
        int dia = Calendar.getInstance().get(GregorianCalendar.DAY_OF_MONTH);
        ArrayList<Aluno> alunos = Fachada.getInstance().getAllAluno();
        for(Aluno a : alunos){
            if((a.getVencimento_mens()<=dia && (a.getStatus().equals("Ativo") && !a.getPlano().equals("Vitalício")))
                    || a.getPlano().equals("Diário")){
                criarMensalidade(a);
            }
        }     
    }
    
    public static void bloquearCampos(JPanel p){
         
         for (int i=0; i < p.getComponentCount(); i++) { //For para todos os componentes do Panel 
                 Component c = p.getComponent(i);   
                 if (c instanceof JTextField) {  //Verificação da instanacia do componente 
                      JTextField field = (JTextField) c;   
                      field.setEditable(false);  
                  }else if(c instanceof JFormattedTextField) {   
                      JFormattedTextField field = (JFormattedTextField) c;   
                      field.setEditable(false);  
                  }else if(c instanceof JComboBox){
                      JComboBox combo = (JComboBox) c;   
                      combo.setEnabled(false);
                  }else if(c instanceof JScrollPane) {
                      for (int j=0; j < ((JScrollPane) c).getComponentCount(); j++) {
                          Component a = p.getComponent(i);
                          if (a instanceof JTextArea) {  //Verificação da instanacia do componente
                              JTextArea field = (JTextArea) a;
                              field.setEditable(false);
                          }
                      }
                      
                  }
                 
         } 
    }
    
    public static boolean verificarCampos(JPanel p){
        boolean retorno = true;
        
        for (int i=0; i < p.getComponentCount(); i++) { //For para todos os componentes do Panel 
            Component c = p.getComponent(i); 
            if (c instanceof JTextField) {  //Verificação da instanacia do componente 
                JTextField field = (JTextField) c;
                System.out.println(field.getText());
                if(field.getText().isEmpty() || field.getText().isEmpty() || field.getText().equals("   .   .   -  ")
                   || field.getText().equals("(  )     -    ") || field.getText().equals("      -   ")){
                    field.setBorder(new LineBorder(java.awt.Color.RED));
                    retorno = false;
                }else
                    field.setBorder(new LineBorder(java.awt.Color.black));
            }
                 
        } 
        return retorno;
    }
    
    public static int getIndiceByID(ArrayList<FichaExercicio> exercicios, FichaExercicio busca){
        for(int i=0;i<exercicios.size();i++){
            if(exercicios.get(i).getId()== busca.getId()){
               return i;
            }
        }
        return -1;
    }
    
    public static String prepararCPF(String cpf){
        if(cpf.isEmpty())
            return "CPF em Branco";
        
        cpf = cpf.replace("-", "");
        cpf = cpf.replace(".", "");
        return cpf;
    }
    
    public static boolean validarCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);
          
        char dig10, dig11;
        int sm, i, r, num, peso;
          
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0         
        // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(CPF.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
          
        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);
          
        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }
    
    public static void lookAndFeel(){
        try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Metal".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
        } catch (UnsupportedLookAndFeelException e) {} catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {} catch (IllegalAccessException e) {}
    }
         
}
