package az.babayev.javarush.javasyntax.lection7;

import java.util.Arrays;

public class ArraysDemo7 {

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Cat[] cats = new Cat[3];
            cats[0]=new Cat("Tomas");
            cats[1]=new Cat("Tom");
            cats[2]=new Cat("Tom2");

            for (int i = 0; i < cats.length; i++) {
                System.out.println(cats[i]);
            }
        }
    }
}
