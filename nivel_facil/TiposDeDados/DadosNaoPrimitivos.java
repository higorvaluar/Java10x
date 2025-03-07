package nivel_facil.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for compilado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
         * Dados não primitivos: String, Array, Class, Enum
         * Objetivo da aula: Criar um ninja, e atribuir métodos a ele
         */

        String nome = "Uchiha Sasuke";
        String nomeCaixaAlta = nome.toUpperCase(); // toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Nome em caixa alta: " + nomeCaixaAlta);
        System.out.println("Nome normal: " + nome);

        String aldeia = "Konohagakure no Sato";
        String aldeiaCaixaBaixa = aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em caixa baixa
        System.out.println("Nome da aldeia em caixa baixa: " + aldeiaCaixaBaixa);
    }
}
