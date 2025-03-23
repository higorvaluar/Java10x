package nivel_intermediario.estudandoLinkedList_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Classes, que implementam a interface List, que por sua vez implementa a interface Collection
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        // Os Queues são uma interface também que eles implementam o Collection
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto");
        System.out.println(linkedList); // LinkedList tem a implementação toString() por padrão

        String[] array = new String[3];
        array[0] = "Sasuke";
        System.out.println(array); // Array não tem a implementação toString()

    }
}