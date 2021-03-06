package model.dao;

import java.io.IOException;
import java.util.Map;

import model.Usuario;

public interface UsuarioDao {

    void adicionarUsuario(String nome, String senha);
    void removerUsuario(String usuarioId);
    public Map<String, String> getUsuarios();
    void carregarArquivo() throws IOException;
    boolean validacao(String login, String senha);
    Usuario findUsuarioByPK(String usuarioId);
}
