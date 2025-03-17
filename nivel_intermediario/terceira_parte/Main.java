package nivel_intermediario.terceira_parte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Arrays são estáticos, não alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Sakura Haruno";
        System.out.println("Printando array = " + ninjasArray[0]);

        // Listas não são estáticas, elas podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();

        // Adicionar na lista
        ninjasList.add("Sarada Uchiha"); // Index 0
        ninjasList.add("Tobirama Senju"); // Index 1
        ninjasList.add("Hashirama Senju"); // Index 2
        ninjasList.add("Kakashi Hatake"); // Index 3

        System.out.println("Printando List = " + ninjasList);

        // Remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Printando List = " + ninjasList);

        // Trocar elementos
        ninjasList.set(1, "Minato Namikaze");
        System.out.println("Printando List = " + ninjasList);

        // Ver tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size() + " elementos.");
    }
}
