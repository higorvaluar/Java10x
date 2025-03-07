package nivel_facil.Desafio1;

public class Ninja3 {
    public static void main(String[] args) {

        String nomeNinja = "Hyuuga Neji";
        int idade = 18;
        String missao = "Proteger o Naruto";
        String rankMissao = "SSS";
        String statusMissao;

        if(idade == 18 && nomeNinja == "Hyuuga Neji") {
            statusMissao = "Concluída";
            System.out.println("O ninja " + nomeNinja + " morreu para paus com sucesso!");
            System.out.println("Situação da missão: " + statusMissao);
        } else {
            System.out.println("Algo está errado, isso é um evento canônico!");
        }
    }
}
