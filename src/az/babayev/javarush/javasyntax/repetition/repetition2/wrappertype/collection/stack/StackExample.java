package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        int peek = stack.peek();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
