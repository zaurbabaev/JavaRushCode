package az.babayev.javarush.javasyntax_repetition.lection5;

/*
İlk 20 sadə ədədi konsola çap et.
 */
public class Task5 {
    public static void main(String[] args) {
        int counter = 0;
        int number = 20;
        int myNumber = 2;
        while (counter < number) {
            boolean isPrime = true;
            for (int i = 2; i <= myNumber / 2; i++) {
                if (myNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
                System.out.println("sadə ədəd " + myNumber);
            }
            myNumber++;
        }
    }
}
