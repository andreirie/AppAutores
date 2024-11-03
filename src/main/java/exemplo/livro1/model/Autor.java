package exemplo.livro1.model;

public class Autor {
    private int autorID;
    private String nome;
    private int idade;

    public Autor() {

    }
    public Autor(int autorID, String nome, int idade) {
        this.autorID = autorID;
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Autor(int idade) {
        this.idade = idade;
    }

    public int getAutorID() {
        return autorID;
    }

    public void setAutorID(int autorID) {
        this.autorID = autorID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "ID=" + autorID +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

