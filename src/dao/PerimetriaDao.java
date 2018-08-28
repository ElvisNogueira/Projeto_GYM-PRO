/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Perimetria;
import sql.SQLUtil;
import view.Mensagem;

/**
 *
 * @author Elvis
 */
public class PerimetriaDao {

    private PreparedStatement statement;

    public void cadastrar(Perimetria p) {
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.INSERIR_PERIMETRIA);

            statement.setFloat(1, p.getAltura());
            statement.setFloat(2, p.getCintura());
            statement.setFloat(3, p.getPeso());
            statement.setFloat(4, p.getCoxa_esquerda());
            statement.setFloat(5, p.getOmbro());
            statement.setFloat(6, p.getBraco_esquerdo());
            statement.setFloat(7, p.getCoxa_direita());
            statement.setFloat(8, p.getAbdomem());
            statement.setFloat(9, p.getTorax());
            statement.setFloat(10, p.getQuadril());
            statement.setFloat(11, p.getPanturrilha_direita());
            statement.setFloat(12, p.getBraco_direito());
            statement.setFloat(13, p.getAnte_braco_direita());
            statement.setFloat(14, p.getAnte_braco_esquerdo());

            statement.execute();

        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao salvar Perimetria!\n" + ex.getMessage());
        }

    }

    public void editar(Perimetria p) {
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.UPDATE_PERIMETRIA);

            statement.setFloat(1, p.getAltura());
            statement.setFloat(2, p.getCintura());
            statement.setFloat(3, p.getPeso());
            statement.setFloat(4, p.getCoxa_esquerda());
            statement.setFloat(5, p.getOmbro());
            statement.setFloat(6, p.getBraco_esquerdo());
            statement.setFloat(7, p.getCoxa_direita());
            statement.setFloat(8, p.getAbdomem());
            statement.setFloat(9, p.getTorax());
            statement.setFloat(10, p.getQuadril());
            statement.setFloat(11, p.getPanturrilha_direita());
            statement.setFloat(12, p.getBraco_direito());
            statement.setFloat(13, p.getAnte_braco_direita());
            statement.setFloat(14, p.getAnte_braco_esquerdo());
            statement.setInt(15, p.getId());

            statement.execute();

        } catch (Exception ex) {
            Mensagem.exibirMensagem("Erro ao editar Perimetria!\n" + ex.getMessage());
        }
    }

    public void excluir(Perimetria p) {
        try {
            statement = SQLUtil.prepareStatement(SQLUtil.DELETE_PERIMETRIA);
            statement.setInt(1, p.getId());
            statement.execute();
        } catch (Exception ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Perimetria getById(int id) {
        ResultSet result;

        try {
            statement = SQLUtil.prepareStatement(SQLUtil.SELECT_BY_ID_PERIMETRIA);
            statement.setInt(1, id);
            result = statement.executeQuery();
            result.next();
            
            return get(result);
        } catch (Exception ex) {
            Logger.getLogger(PerimetriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ArrayList<Perimetria> getAll(int id) {
        return null;
    }

    private Perimetria get(ResultSet result) {
        Perimetria p = new Perimetria();

        try {
            p.setId(result.getInt(1));
            p.setAltura(result.getFloat(2));
            p.setCintura(result.getFloat(3));
            p.setPeso(result.getFloat(4));
            p.setCoxa_esquerda(result.getFloat(5));
            p.setOmbro(result.getFloat(6));
            p.setBraco_esquerdo(result.getFloat(7));
            p.setCoxa_direita(result.getFloat(8));
            p.setAbdomem(result.getFloat(9));
            p.setTorax(result.getFloat(10));
            p.setQuadril(result.getFloat(11));
            p.setPanturrilha_direita(result.getFloat(12));
            p.setBraco_direito(result.getFloat(13));
            p.setAnte_braco_direita(result.getFloat(14));
            p.setAnte_braco_esquerdo(result.getFloat(15));
        } catch (SQLException ex) {
            Logger.getLogger(PerimetriaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
}
