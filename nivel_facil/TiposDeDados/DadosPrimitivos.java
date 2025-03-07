package nivel_facil.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados primitivos - int, double, float, char, boolean, short.
         * Objetivo da aula: Criar um ninja - Sasuke -
         *
         */

        int idade = 17; // Valor máximo: 2.147.483.647
        double altura = 1.70;
        char inicial = 'S';
        boolean vivoOuMorto = true;
        Long saldoBancario = 1414L; // Valor máximo: 9.223.372.036.854.775.807

        System.out.println("Minha idade é "+ idade); // Comando para mostrar para o usuário
        System.out.println("O saldo bancário é: R$" + saldoBancario);
        System.out.println("Eu tenho " + altura + " metros de altura");
        System.out.println(vivoOuMorto);
    }
}
