package az.babayev.javarush.javasyntax_repetition.lection6;

/*
F(0)=0
F(1)=1;
F(n)=F(n-1)+F(n-2) (n>1)
 */
public class FibonacciExample {
    public static void main(String[] args) {
        int[] array = new int[100];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
