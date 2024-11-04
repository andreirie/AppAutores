package exemplo.curso1.dao;

import java.sql.*;
import exemplo.curso1.model.*;

public class ProfessorDAO implements IProfessor, IConst {
    private String sql;

    public void inserir(Professor professor) throws SQLException {
        sql = "INSERT INTO professor (nome,idade) VALUES (?,?)";

        try (Connection conexao = Conexao.getConexao(Conexao.stringDeConexao, Conexao.usuario, Conexao.senha);
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, professor.getNome());
            pstmt.setInt(2, professor.getIdade());
            pstmt.executeUpdate();
        }
    }
}
