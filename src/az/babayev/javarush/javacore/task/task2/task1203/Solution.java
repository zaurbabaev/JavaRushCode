package az.babayev.javarush.javacore.task.task2.task1203;

/*
Переопредели метод getChild в классах Cat(кот) и Dog(собака),
чтобы кот порождал кота, а собака — собаку.
 */
public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        System.out.println(pet1.getChild());

        Pet pet2 = new Dog();
        System.out.println(pet2.getChild());
    }

}
