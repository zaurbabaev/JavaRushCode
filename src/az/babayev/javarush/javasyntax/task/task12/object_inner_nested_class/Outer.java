package az.babayev.javarush.javasyntax.task.task12.object_inner_nested_class;

public class Outer {
    class Inner
    {
        Inner(){
            System.out.println("Создание объекта внутреннего класса");
        }
    }

    static class Nested{
        Nested(){
            System.out.println("Создание объекта вложенного  класса");
        }
    }
}
