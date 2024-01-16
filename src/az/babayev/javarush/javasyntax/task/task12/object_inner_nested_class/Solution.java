package az.babayev.javarush.javasyntax.task.task12.object_inner_nested_class;

/*
В классе Outer есть внутренний (Inner) и вложенный (Nested) классы.
 В методе main класса Solution создай по одному объекту каждого из них.
 */
public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();

    }

}
