package nivel_facil.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
         * Scanner = É um jeito de trazer o usuário para dentro da aplicação.
         * Objetivo da aula: O usuário vai criar um ninja e vamos validar os dados.
         */


        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva o nome do ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeNinja);

        // Receber a idade do ninja
        System.out.println("Agora a idade do ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é de " + idadeNinja + " anos");

        // Tratamento de dados
        if(idadeNinja >= 18){
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é muito novo, precisa treinar mais!");
        }

        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}
