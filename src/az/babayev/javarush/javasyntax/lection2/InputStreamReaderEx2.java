package az.babayev.javarush.javasyntax.lection2;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        while (true){
            int read = streamReader.read();
            System.out.println(read);
        }
    }
}
