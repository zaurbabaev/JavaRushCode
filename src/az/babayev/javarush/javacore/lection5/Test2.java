package az.babayev.javarush.javacore.lection5;

public class Test2 {
    public int a=getSum();
    public int b=getSum()-a;
    public int c=getSum()-a-b;


    public int getSum() {
        return a + b + c;
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        int sum = t.getSum();
        System.out.println(sum);
    }
}
