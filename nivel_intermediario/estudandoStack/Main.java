package nivel_intermediario.estudandoStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array - São estáticos e tem referência de memória
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas - São dinâmicas e o tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack - O último elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Kakashi Hatake");
        ninjaStack.push("Hashirama Senju");
        System.out.println("Minha Stack atual = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack com pop = " + ninjaStack);
        System.out.println("Minha Stack com o próximo elemento do topo = " + ninjaStack.peek());
        System.out.println("Tamanho da Stack = " + ninjaStack.size() + " elementos.");

    }
}
