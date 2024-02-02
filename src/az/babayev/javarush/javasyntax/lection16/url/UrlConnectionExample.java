package az.babayev.javarush.javasyntax.lection16.url;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com");
        URLConnection connection = url.openConnection();

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(1);

        InputStream inputStream = connection.getInputStream();
        int data = inputStream.read();
    }
}
