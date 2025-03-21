package nivel_intermediario.estudandoQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue (Fila)
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Kakashi Hatake");
        ninjasQueue.add("Shikamaru Nara");

        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas da fila depois do poll: " + ninjasQueue);

        // Quem é o primeiro da fila
        System.out.println("Ninja no HEAD: " + ninjasQueue.peek());

        // Adicionar a fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Nova fila de ninjas: " + ninjasQueue);

        /*
        Não tem como tirar o último da fila (deletar o tail)
         */

        // Esvaziar a fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Verificar se a fila está vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila ainda está com gente.");
        }
    }
}