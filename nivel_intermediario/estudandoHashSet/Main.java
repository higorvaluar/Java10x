package nivel_intermediario.estudandoHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");

        System.out.println("ninjas = " + ninjas);

        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.addAll(ninjas); // Passando a ArrayList de Ninjas para o Set
        ninjaSet.remove(0); // Não é possível remover através do index, pois Set não tem ordenação, e não retorna erro.
        ninjaSet.remove("Sakura Haruno"); // Mas é possível remover passando o valor do elemento.


        System.out.println("ninjaSet = " + ninjaSet); // Ignora as duplicações

    }
}
