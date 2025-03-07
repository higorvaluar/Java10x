package nivel_intermediario.desafio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Uchiha Sasuke = new Uchiha();
        System.out.println("Digite o nome do Uchiha:");
        Sasuke.nome = scanner.nextLine();
        System.out.println("Digite a idade do Uchiha:");
        Sasuke.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Qual é a habilidade especial dele(a)?");
        Sasuke.habilidadeEspecial = scanner.nextLine();
        System.out.println("Qual será sua missão?");
        Sasuke.missao = scanner.nextLine();
        System.out.println("O qual difícil é essa missão?");
        Sasuke.nivelDificuldade = scanner.nextLine();
        System.out.println("Como está o andar da missão?");
        Sasuke.statusMissao = scanner.nextLine();
        Sasuke.mostrarInformacoes();

        scanner.close();
    }
}
