package nivel_intermediario.desafio_6;

import java.util.Scanner;

/**
 * Demonstração do Desafio 6
 */

public class Main {
    public static void main(String[] args) {
        GerenciadorNinja gerenciador = new GerenciadorNinja();

        // Adicionar os 7 ninjas
        gerenciador.adicionarNoFinal(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        gerenciador.adicionarNoFinal(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        gerenciador.adicionarNoFinal(new Ninja("Sakura Haruno", 17, "Konoha"));
        gerenciador.adicionarNoFinal(new Ninja("Kakashi Hatake", 27, "Konoha"));
        gerenciador.adicionarNoFinal(new Ninja("Orochimaru", 50, "Otogakure"));
        gerenciador.adicionarNoFinal(new Ninja("Minato Namikaze", 32, "Konoha"));

        // Exibindo os ninjas na lista
        System.out.println("****************\nLista de Ninjas:\n****************");
        gerenciador.exibirLista();

        // Menu de Ordenação (Desafio Extra)
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nEscolha o critério de ordenação:");
            System.out.println("1 - Ordenar por nome");
            System.out.println("2 - Ordenar por idade");
            System.out.println("3 - Ordenar por vila");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("");
                System.err.println("Opção não existe, tente novamente...");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("Ordenando...");
                System.out.println("");
            }

        } while (opcao < 1 || opcao > 3);

        // Ordenando a lista com base na escolha do usuário (Desafio Extra)
        switch (opcao) {
            case 1:
                gerenciador.ordenarPorNome();
                break;
            case 2:
                gerenciador.ordenarPorIdade();
                break;
            case 3:
                gerenciador.ordenarPorVila();
                break;
            default:
                System.out.println("Opção Inválida!");
                return;
        }

        // Exibindo a lista ordenada (Desafio Extra)
        System.out.println("\nLista de ninjas ordenada:");
        gerenciador.exibirLista();

        // Buscando um ninja pelo nome (Desafio Extra)
        scanner.nextLine();
        System.out.println("\nDigite o nome do ninja que deseja buscar:");
        String nomeBusca = scanner.nextLine();
        Ninja ninjaEncontrado = gerenciador.buscarPorNome(nomeBusca);
        if (ninjaEncontrado != null) {
            System.out.println("Ninja encontrado: " + ninjaEncontrado);
        } else {
            System.err.println("O ninja " + nomeBusca + " não existe!");
        }

        // Remover o primeiro ninja
        Ninja removendoOPrimeiro = gerenciador.removerOPrimeiro();
        System.out.println("\nNinja removido: " + removendoOPrimeiro);

        // Adicionando um novo ninja no início
        gerenciador.adicionarNoInicio(new Ninja("Kushina Uzumaki", 32, "Konoha"));

        // Exibindo a lista após as alterações
        System.out.println("****************************\nLista de Ninjas após mudanças:\n****************************");
        gerenciador.exibirLista();

        // Acessando um ninja numa posição específica
        int posicao = 0;
        Ninja ninjaNaPosicao = gerenciador.acessarNinja(posicao);
        if (ninjaNaPosicao != null) {
            System.out.println("\nNinja na posição " + posicao + ": " + ninjaNaPosicao);
        } else {
            System.out.println("\nPosição não existe!");
        }
    }
}
