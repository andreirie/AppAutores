package exemplo.livro1.dao;

import java.sql.*;
import exemplo.livro1.model.*;

public class AutorDAO implements IAutor, IConst {
    private String sql;

    public void inserir(Autor autor) throws SQLException {
        sql = "INSERT INTO autor (nome) VALUES (?)";

        try (Connection conexao = Conexao.getConexao(Conexao.stringDeConexao, Conexao.usuario, Conexao.senha);
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, autor.getNome());
            pstmt.executeUpdate();
        }
    }
}

