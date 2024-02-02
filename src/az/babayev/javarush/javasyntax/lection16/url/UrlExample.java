package az.babayev.javarush.javasyntax.lection16.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com");
        byte[] bytes;
        try (InputStream inputStream = url.openStream()) {
            bytes = inputStream.readAllBytes();
        }
        String str = new String(bytes);
        System.out.println(str);
    }
}
