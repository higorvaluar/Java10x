package nivel_intermediario.segunda_parte;

public class Uchiha extends Ninja implements SharinganInteface {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // Esse método vem direto da Interface!
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o Sharingan!");
    }

    // Sobreescrever o método da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu já completei " + numeroDeMissoesConcluidas + " missões.");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " e essa é minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println(nome + " seu QI é de " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println(nome + " seu QI é de " + qi + " e você é um ninja promissor");
        } else {
            System.out.println(nome + " seu QI é de " + qi + " e você precisa ser mais estrategista");
        }
    }

    @Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe Uchiha");
    }
}