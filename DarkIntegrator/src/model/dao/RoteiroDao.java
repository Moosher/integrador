package model.dao;

import java.util.Date;
import java.util.List;

import model.Objeto;
import model.Roteiro;

public interface RoteiroDao {

    void adicionarRoteiro( Roteiro roteiro );

    void removerRoteiro( String roteiroId );

    void atualizarRoteiro( Roteiro roteiro );

    void gerarRoteiros( Date data );

    List<Roteiro> getRoteiroList();

    List<Roteiro> getRoteiroList(Date data);

    List<Objeto> getObjetoRoteiroList( String id );

    Roteiro findRoteiroByPK(String roteiroId);

}
