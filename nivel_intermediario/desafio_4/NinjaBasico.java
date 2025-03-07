package nivel_intermediario.desafio_4;

public class NinjaBasico implements Ninja {
    private String nome;
    private int idade;
    private String nomeHabilidade;

    public NinjaBasico(String nome, int idade, String nomeHabilidade) {
            this.nome = nome;
            this.idade = idade;
            this.nomeHabilidade = nomeHabilidade;
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

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public void habilidade() {
        System.out.println("Meu nome é " + nome + "minha habilidade básica é " + nomeHabilidade);
    }
    public void executarHabilidade() {
        System.out.println(nome + " está executando a habilidade: " + nomeHabilidade);
    }
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", idade: " + idade + ", Habilidade: " + nomeHabilidade);
    }
}
