package exemplo.curso1.dao;

import java.sql.*;
import exemplo.curso1.model.*;

public class EstudanteDAO implements IEstudante, IConst {
    private String sql;

    public void inserir(Estudante estudante) throws SQLException {
        sql = "INSERT INTO estudante (nome,idade) VALUES (?,?)";

        try (Connection conexao = Conexao.getConexao(Conexao.stringDeConexao, Conexao.usuario, Conexao.senha);
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, estudante.getNome());
            pstmt.setInt(2,estudante.getIdade());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(int id) throws SQLException {
        sql = "DELETE FROM estudante WHERE estudante_id = ?";

        try (Connection conexao = Conexao.getConexao(Conexao.stringDeConexao, Conexao.usuario, Conexao.senha);
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
