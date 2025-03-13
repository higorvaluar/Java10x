package nivel_intermediario.segunda_parte;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 1.8;

    public Ninja() {
    }

    // Todo ninja vai fazer obrigatoriamente
    final void tacarKunai() {
        System.out.println("Eu sou um método da classe mãe");
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de métodos, você não precisa redeclarar o construtor, só os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodo geral! Todos os ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobrescrevendo o método da Interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + ", e essa é minha estratégia de combate");
    }

    // Método padrão - Inteligencia de Combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " e essa é minha inteligencia de combate");
    }

    // Sobrecarga de método - Inteligencia de Combate
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println(nome + " seu QI é de " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println(nome + " seu QI é de " + qi + " e você é um ninja promissor");
        } else {
            System.out.println(nome + " seu QI é de " + qi + " e você precisa ser mais estrategista");
        }
    }

    // Método sem @Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe Ninja");
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + ", eu sou de " + aldeia + " e tenho " + idade + " anos. ";
    }
}
