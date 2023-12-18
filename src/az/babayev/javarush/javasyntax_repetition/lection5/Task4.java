package az.babayev.javarush.javasyntax_repetition.lection5;

/*
 1-200 aralığında olan tam ədədlərdən həm 3-ə həmdə 7-yə qalıqsız bölünənləri
 */
public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
