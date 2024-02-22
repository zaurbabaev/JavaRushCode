package az.babayev.javarush.javacore.lection5;

public class Test {
    public int a = 5;
    public int b = a + 1;
    public int c = a * b;

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.c);
        int sum = test.getSum();
        System.out.println(sum);
    }

    public int getSum() {
        return a + b + c;
    }
}
