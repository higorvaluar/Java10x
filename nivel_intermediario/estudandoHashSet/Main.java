package nivel_intermediario.estudandoHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Tsunade Senju");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");

        System.out.println("ninjas = " + ninjas);

        // Iniciando o HashSet
        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.addAll(ninjas); // Passando a ArrayList de Ninjas para o HashSet
        ninjaSet.remove(0); // Não é possível remover através do index, pois Set não tem ordenação, e não retorna erro.
        ninjaSet.remove("Sakura Haruno"); // Mas é possível remover passando o valor do elemento.

        System.out.println("ninjaSet = " + ninjaSet); // Ignora as duplicações

        // Iniciando o TreeSet
        Set<String> ninjaTree = new TreeSet<>();
        ninjaTree.addAll(ninjas); // Passando a ArrayList de Ninjas para TreeSet

        System.out.println("treeSet = " + ninjaTree); // Organiza tudo em ordem alfabética (ou numérica), e ignora as duplicações.

        // Iniciando o LinkedHashSet
        Set<String> ninjaLS = new LinkedHashSet<>();
        ninjaLS.addAll(ninjas); // Passando a ArrayList de Ninja para LinkedHashSet

        System.out.println("ninjaLS = " + ninjaLS); // Organiza tudo na ordem de implementação, e ignora as duplicações.
    }
}
