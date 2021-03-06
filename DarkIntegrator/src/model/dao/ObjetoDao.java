package model.dao;

import java.text.ParseException;
import java.util.List;

import model.Objeto;
import model.Objeto.Status;

public interface ObjetoDao {

    void adicionarObjeto(Objeto objeto);
    List<Objeto> getObjetoList() throws ParseException;
    void removerObjeto(String objetoId);
    boolean verificaCodigo(String codigo);
    void setStatus(String objetoId, Status status);
    Objeto findObjetoByPK(String objetoId);

}
