package az.babayev.javarush.javasyntax.lection16.url;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionExample2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com");
        URLConnection connection = url.openConnection();
        try (
                OutputStream outputStream = connection.getOutputStream();
                PrintStream sender = new PrintStream(outputStream);
        ) {
            sender.println("Hello");
        } catch (IOException exception) {
            System.out.println("Something went wrong : " + exception);
        }

        try (
                InputStream inputStream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        ) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        }

    }
}
