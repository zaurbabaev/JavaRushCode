package az.babayev.javarush.javasyntax.repetition;

public class FlagExample {
    public static void main(String[] args) {
        // flaq əlavə etmək
        int a = 0b00001010;
        System.out.println(Integer.toBinaryString(a));
        // a-nın 5ci bitinə 1 əlavə edirik sayım sağdan 1-dən başlayır
        int b = a | 0b00010000;
        System.out.println(Integer.toBinaryString(b));
        // 4 burada indeksdir a-nin 4cü indeksinə 1 əlavə edirik (yəni 5-ci bitinə)
        // sayım sağdan 0dan başlayır
        int c = a | (1 << 4);
        System.out.println(Integer.toBinaryString(c));

        // flaqı atmaq

        int d = a & 0b11110010; // a dəyişəninin 4cü bitini 0 edirik
        System.out.println(Integer.toBinaryString(d));

        int d1 = a & ~(1 << 3); // eynilə d dəyişəni kimidir sadəcə 4cü bit 3cü indeks kimi qeyd edilir
        System.out.println(Integer.toBinaryString(d1));

        //  flaqın yoxlanılması

        if ((0b00011010 & 0b00010000) == 0b00010000) {
            System.out.println(true);
        }

        System.out.println((b & (1 << 4)) == (1 << 4));

    }
}
