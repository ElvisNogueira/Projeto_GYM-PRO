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
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Aluno;
import model.Conta;
import model.FichaExercicio;
import model.Parcelas;
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
        int dia = cal.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = cal.getInstance().get(GregorianCalendar.MONTH)+1;
        int ano = cal.getInstance().get(GregorianCalendar.YEAR);
        String c = "";
        if(mes>9)
            c =(dia+"/"+mes+"/"+ano);
        else
            c =(dia+"/0"+mes+"/"+ano);
        if(dia<10)
            c = "0"+c;
        
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
        int numPrcelas;
        int dia = a.getVencimento_mens();
        int mes = Calendar.getInstance().get(GregorianCalendar.MONTH);
        int ano = Calendar.getInstance().get(GregorianCalendar.YEAR);
        Date d = new Date(ano,mes,dia);
        Parcelas p = new Parcelas();
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.MONTH, 2);

        if(a.getPlano().equals("Mensal"))
            numPrcelas=1;
        else if(a.getPlano().equals("Trimestral"))
            numPrcelas=3;
        else if(a.getPlano().equals("Semestral"))
             numPrcelas=6;   
        else
            numPrcelas=12;
        
        for(int i=0;i<numPrcelas;i++){
           p.setData_de_Vencimento(converterCalendarToDate(cal));
           p.setAlunos(a);
           p.setStatus("Em aberto");
           p.setValor(a.getValorPlano()/numPrcelas);      
           Conta con = Fachada.getInstance().getByNomeConta("Mensalidade");
           p.setConta(con);
           
           Fachada.getInstance().cadastrarParcelas(p);
           cal.add(Calendar.MONTH, 1);
        }
         
    }
    
    public static void atualizarMensalidades(){
        int dia = Calendar.getInstance().get(GregorianCalendar.DAY_OF_MONTH);
        ArrayList<Aluno> alunos = Fachada.getInstance().getAllAluno();
        for(Aluno a : alunos){
            if((a.getVencimento_mens()==dia) && (a.getStatus().equals("Ativo"))){
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
    
    
    public static int getIndiceByID(ArrayList<FichaExercicio> exercicios, FichaExercicio busca){
        for(int i=0;i<exercicios.size();i++){
            if(exercicios.get(i).getId()== busca.getId()){
               return i;
            }
        }
        return -1;
    }
         
}
