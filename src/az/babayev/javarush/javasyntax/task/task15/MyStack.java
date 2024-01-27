package az.babayev.javarush.javasyntax.task.task15;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
В классе MyStack нужно реализовать свою версию структуры хранения данных стек на
базе списка.
Все элементы хранятся в приватном списке storage. Твоя задача реализовать все
объявленные методы класса MyStack.
Где метод push(String) добавляет элемент в начало списка storage. Метод pop()
возвращает первый элемент списка storage, а потом удаляет его из этого списка.
Метод peek() возвращает первый элемент списка storage.
Метод empty() проверяет, не пустой ли список storage.
Метод search(String) ищет элемент в списке storage и возвращает его индекс.
Если элемента нет в списке — возвращает -1.
 */
public class MyStack {
    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }
    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        int i = storage.lastIndexOf(s);
        if (i >= 0) {
            return i;
        }
        return -1;

    }

    @Override
    public String toString() {
        return "MyStack{" +
                "storage=" + storage +
                '}';
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("Hello");
        myStack.push("Java");
        myStack.push("Rush");
        myStack.push("Amigo");
        System.out.println(myStack);
        String pop = myStack.pop();
        System.out.println(myStack);
        System.out.println(pop);

        String peek = myStack.peek();
        System.out.println(myStack);
        System.out.println(peek);

        int search = myStack.search("Java");
        System.out.println(search);
        System.out.println(myStack);

        boolean empty = myStack.empty();
        System.out.println(empty);
    }

}
