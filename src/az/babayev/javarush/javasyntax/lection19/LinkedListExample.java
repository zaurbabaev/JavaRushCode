package az.babayev.javarush.javasyntax.lection19;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");
        linkedList.add("six");
        linkedList.add("seven");
        System.out.println("add " + linkedList);
        System.out.println("-".repeat(30));

        linkedList.add("123");
        System.out.println("add 123 " + linkedList);
        System.out.println("-".repeat(30));

        linkedList.offer("456");
        System.out.println("offer 456 " + linkedList);
        System.out.println("-".repeat(30));

        System.out.println(linkedList.remove());
        System.out.println("remove " + linkedList);
        System.out.println("-".repeat(30));

        System.out.println(linkedList.poll());
        System.out.println("pool " + linkedList);
        System.out.println("-".repeat(30));

        linkedList.element();
        System.out.println("element " + linkedList);
        System.out.println("-".repeat(30));

        linkedList.peek();
        System.out.println("peek " + linkedList);
    }
}
