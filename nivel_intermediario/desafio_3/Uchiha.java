package nivel_intermediario.desafio_3;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Me chamo " + nome + " e minha habilidade especial é " + habilidadeEspecial);
    }
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos" + "\nMissão: " + missao + "\nNível de dificuldade: " + nivelDificuldade + "\nStatus: " + statusMissao + "\nHabilidade Especial: " + habilidadeEspecial);
    }
}
