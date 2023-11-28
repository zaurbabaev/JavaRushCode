package az.babayev.javarush.javasyntax.task.task6;

public class StaticClassExample
{
    private static int catCount = 0;

    public static void main(String[] args)
    {
        Cat bella = new Cat("Bella");
        Cat tiger = new Cat("Tiger");

        System.out.println("Cat count: " + catCount);

    }

    public static class Cat {
        private String name;

        private Cat(String name)
        {
            this.name = name;
            StaticClassExample.catCount++;
        }
    }

}
