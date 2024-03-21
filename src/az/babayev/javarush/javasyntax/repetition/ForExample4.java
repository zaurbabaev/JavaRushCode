package az.babayev.javarush.javasyntax.repetition;

public class ForExample4 {
    public static void main(String[] args) {
        for(int i = 1; i < 3; i++)
        {
            switch (i)
            {
                default:
                    System.out.printf("i = %d \n", i++);
                    break;
            }
        }
    }
}
