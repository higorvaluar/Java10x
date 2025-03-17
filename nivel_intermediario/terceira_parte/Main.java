package nivel_intermediario.terceira_parte;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar um gato", RankDeMissoes.E);
        missao1.exibirDetalhes();

        System.out.println("-------------------------------------");

        Missoes missao2 = new Missoes("Matar o Madara Uchiha", RankDeMissoes.SS);
        missao2.exibirDetalhes();

    }
}
