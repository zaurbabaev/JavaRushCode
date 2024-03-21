package az.babayev.javarush.javasyntax.repetition;

public class ForExamole3 {
    public static void main(String[] args) {
        int j = 2;
        for (int i = 2; i < 32; i = i * 2)
        {
            while(i < j)
            {
                j = j * 2;
            }
            i = j - i;
        }
    }
}
