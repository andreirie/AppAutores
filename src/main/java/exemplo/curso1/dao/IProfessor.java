package exemplo.curso1.dao;

import java.sql.SQLException;
import exemplo.curso1.model.Professor;

public interface IProfessor {
    public void inserir(Professor professor) throws SQLException;
    public void excluir(int id) throws SQLException;
}
