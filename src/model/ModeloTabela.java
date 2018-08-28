/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Elvis
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabela(ArrayList linhas, String[] colunas){
        this.linhas = linhas;
        this.colunas = colunas;
     
    }
    public void atualizarTabela(ArrayList linhas, String[] colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        fireTableDataChanged();
    }
    public void atualizarTabela(ArrayList linhas){
        this.linhas = linhas;
        //this.colunas = colunas;
        fireTableDataChanged();
    }
    public ArrayList getLinhas() {
        return linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] linhas = (Object[])getLinhas().get(rowIndex);
        return linhas[columnIndex];
    }
    
    
}
