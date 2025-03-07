package nivel_intermediario.primeira_parte;

// Ao tornar abstrata a classe Hokages, ela vira estéril e não poderá ter classes filhas
public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    // Método abstrato, não pode ter corpo.
    public abstract void sabedoriaHokage();

    // Construtor DEFAULT, sem argumentos
    public Hokages() {
    }

    // Construtor com apenas o nome
    public Hokages(String nome) {
        this.nome = nome;
    }

    // Construtor com apenas a idade
    public Hokages(int idade) {
        this.idade = idade;
    }

    // Construtor com nome e idade
    public Hokages(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor com todos os argumentos (opcional, se necessário)
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}