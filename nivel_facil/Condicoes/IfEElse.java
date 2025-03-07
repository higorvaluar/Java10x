package nivel_facil.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
         * If e Else - Condições
         * Else IF
         * Objetivo da aula: Passar o ninja de nível de acordo com o número de missões
         */

        // Ninja Sarada
        String nome = "Uchiha Sarada";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numMissoes = 13;

        /*
         * if (condição) { resultado }
         * else if (condição) { resultado }
         * else { resultado }
         */

        if (numMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
