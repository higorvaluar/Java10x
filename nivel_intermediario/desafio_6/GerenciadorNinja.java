package nivel_intermediario.desafio_6;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Classe responsável por gerenciar a LinkedList dos Ninjas.
 * Permite adicionar, remover, ordenar, buscar e acessar ninjas.
 */

public class GerenciadorNinja {
    private LinkedList<Ninja> ninjas;

    public GerenciadorNinja() {
        ninjas = new LinkedList<>();
    }

    // Adicionar ao final da lista
    public void adicionarNoFinal(Ninja ninja) {
        ninjas.add(ninja);
    }

    // Remover o primeiro da lista
    public Ninja removerOPrimeiro() {
        if (ninjas.isEmpty()) {
            System.err.println("A lista está vazia!");
            return null;
        }
        return ninjas.removeFirst();
    }

    // Adicionar no início da lista
    public void adicionarNoInicio(Ninja ninja) {
        ninjas.addFirst(ninja);
    }

    // Exibir a lista de ninjas
    public void exibirLista() {
        if (ninjas.isEmpty()) {
            System.err.println("A lista está vazia!");
            return;
        }
        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }
    }

    // Ordenar a lista por nome
    public void ordenarPorNome() {
        Collections.sort(ninjas, Comparator.comparing(Ninja::getNome));
    }

    // Ordenar a lista por idade
    public void ordenarPorIdade() {
        Collections.sort(ninjas, Comparator.comparingInt(Ninja::getIdade));
    }

    // Ordernar a lista por vila
    public void ordenarPorVila(){
        Collections.sort(ninjas, Comparator.comparing(Ninja::getVila));
    }

    // Buscar pelo nome
    public Ninja buscarPorNome(String nome) {
        // Como vai usar buscar binária, a lista precisa estar ordenada para funfar
        ordenarPorNome();

        Ninja ninjaTemp = new Ninja(nome, 0, "");

        // Busca binária em ação
        int indice = Collections.binarySearch(ninjas, ninjaTemp, Comparator.comparing(Ninja::getNome));

        if (indice >= 0) {
            return ninjas.get(indice); // Retorna o ninja encontrado
        } else {
            return null; // Não encontrado
        }
    }

    // Acessar ninja em uma posição específica
    public Ninja acessarNinja(int posicao) {
        if (posicao >= 0 && posicao < ninjas.size()) {
            return ninjas.get(posicao);
        } else {
            System.err.println("Posição inválida!");
            return null;
        }
    }
}
