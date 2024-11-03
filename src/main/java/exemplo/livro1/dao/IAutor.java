package exemplo.livro1.dao;

import java.sql.SQLException;
import exemplo.livro1.model.Autor;

public interface IAutor {
    public void inserir(Autor autor) throws SQLException;
}