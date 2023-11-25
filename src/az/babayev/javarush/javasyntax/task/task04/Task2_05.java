package az.babayev.javarush.javasyntax.task.task04;

/*
Написать код, чтобы правильно считалось количество созданных котов (count)
и на экран выдавалось правильное их количество.
 */
public class Task2_05 {
    public static void main(String[] args) {
       Cat cat=new Cat();
       Cat cat2=new Cat();
       Cat cat3=new Cat();


    }

    public static class Cat {
        public static int count = 0;

        Cat() {
            System.out.println(++count);
        }
    }
}
