package nivel_facil.Desafio1;

public class Ninja1 {
    public static void main(String[] args) {

        String nomeNinja = "Uzumaki Naruto";
        int idade = 16;
        String missao = "Escoltar um grande comerciante";
        String rankMissao = "B";
        String statusMissao;

        if (nomeNinja == "Uzumaki Naruto" && idade >= 15) {
            statusMissao = "Concluída";
            System.out.println("O ninja " + nomeNinja + " concluiu a missão de rank " + rankMissao + " - " + missao + ", com sucesso!");
            System.out.println("Situação da missão: " + statusMissao);
        } else {
            statusMissao = "Não Concluída";
            System.out.println("Ninjas menores de 15 anos só podem concluir missões de rank C ou D!");
            System.out.println("Situação da missão: " + statusMissao);
        }

    }
}
