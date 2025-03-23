package nivel_intermediario.desafio_6;

/**
 * A classe mãe Ninja com os atributos nome, idade e vila.
 */

public class Ninja {
    private String nome;
    private int idade;
    private String vila;
    Ninja proximo;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "\n---------------------\nNome = " + nome + "\nIdade = " + idade + "\nVila = " + vila;
    }
}
