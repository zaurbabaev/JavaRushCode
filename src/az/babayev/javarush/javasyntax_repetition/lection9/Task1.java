package az.babayev.javarush.javasyntax_repetition.lection9;

public class Task1 {
    public int count = 0;
    public int sum = 0;

    public void add(int data) {
        int sum = data * 2;
        this.sum = sum + data;
        System.out.println(sum);
        count++;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.sum = 12;
        task1.add(task1.sum);
        System.out.println(task1.count);
        System.out.println(task1.sum);
    }
}
