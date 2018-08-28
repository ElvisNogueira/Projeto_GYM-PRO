/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Anamnese;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class AnamneseDao {
    private PreparedStatement statement;
    
    public void cadastrar(Anamnese a){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_ANAMNESE);           

            statement.setBoolean(1, a.isTabagismo());
            statement.setBoolean(2, a.isRestricaoArticular());
            statement.setBoolean(3, a.isCardiopatias());
            statement.setBoolean(4, a.isMedicamentos());
            statement.setBoolean(5, a.isHipertensao());
            statement.setBoolean(6, a.isOutros());
            statement.setBoolean(7, a.isDiabetes());
            statement.setBoolean(8, a.isProbPulmonares());
            statement.setBoolean(9, a.isAtivFisica());
            statement.setString(10, a.getNivel());
            statement.setString(11, a.getTabagismoObs());
            statement.setString(12, a.getRestricaoArticularObs());
            statement.setString(13, a.getCardiopatiasObs());
            statement.setString(14, a.getMedicamentosObs());
            statement.setString(15, a.getHipertensaoObs());
            statement.setString(16, a.getOutrosObs());
            statement.setString(17, a.getDiabetesObs());
            statement.setString(18, a.getProbPulmonaresObs());
            statement.setString(19, a.getAtivFisicaObs());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao salvar Anamnese!\n"+ex.getMessage());
        }
    }
    
    public void editar(Anamnese a){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.UPDATE_ANAMNESE);           

            statement.setBoolean(1, a.isTabagismo());
            statement.setBoolean(2, a.isRestricaoArticular());
            statement.setBoolean(3, a.isCardiopatias());
            statement.setBoolean(4, a.isMedicamentos());
            statement.setBoolean(5, a.isHipertensao());
            statement.setBoolean(6, a.isOutros());
            statement.setBoolean(7, a.isDiabetes());
            statement.setBoolean(8, a.isProbPulmonares());
            statement.setBoolean(9, a.isAtivFisica());
            statement.setString(10, a.getNivel());
            statement.setString(11, a.getTabagismoObs());
            statement.setString(12, a.getRestricaoArticularObs());
            statement.setString(13, a.getCardiopatiasObs());
            statement.setString(14, a.getMedicamentosObs());
            statement.setString(15, a.getHipertensaoObs());
            statement.setString(16, a.getOutrosObs());
            statement.setString(17, a.getDiabetesObs());
            statement.setString(18, a.getProbPulmonaresObs());
            statement.setString(19, a.getAtivFisicaObs());
            
            statement.setInt(20, a.getId());
            
            statement.execute();
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar Anamnese!\n"+ex.getMessage());
        }
    }
    
    public void excluir(Anamnese a){
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_ANAMNESE);
            statement.setInt(1, a.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Anamnese getById(int id){
        ResultSet result;
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_ANMNESE);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(AnamneseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private Anamnese get(ResultSet result){
        Anamnese a = new Anamnese();
        try {
            a.setId(result.getInt(1));
            a.setTabagismo(result.getBoolean(2));
            a.setRestricaoArticular(result.getBoolean(3));
            a.setCardiopatias(result.getBoolean(4));
            a.setMedicamentos(result.getBoolean(5));
            a.setHipertensao(result.getBoolean(6));
            a.setOutros(result.getBoolean(7));
            a.setDiabetes(result.getBoolean(8));
            a.setProbPulmonares(result.getBoolean(9));
            a.setAtivFisica(result.getBoolean(10));
            a.setNivel(result.getString(11));
            a.setTabagismoObs(result.getString(12));
            a.setRestricaoArticularObs(result.getString(13));
            a.setCardiopatiasObs(result.getString(14));
            a.setMedicamentosObs(result.getString(15));
            a.setHipertensaoObs(result.getString(16));
            a.setOutrosObs(result.getString(17));
            a.setDiabetesObs(result.getString(18));
            a.setProbPulmonaresObs(result.getString(19));
            a.setAtivFisicaObs(result.getString(20));
        } catch (SQLException ex) {
            Logger.getLogger(AnamneseDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
}
