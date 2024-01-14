package az.babayev.javarush.javasyntax.lection10;

public class StringBuilderEx2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.deleteCharAt(2);
        System.out.println(stringBuilder);
        long x = 0x1101010110L;
        System.out.println(x);
        char c = '\101';
        System.out.println(c);
        String filePath = "D:\\Movies\\Futurama.mp4";
        int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        System.out.println(fileName); //9

        char c1=' ';
    }
}
