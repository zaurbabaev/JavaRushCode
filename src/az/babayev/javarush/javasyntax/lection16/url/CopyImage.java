package az.babayev.javarush.javasyntax.lection16.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyImage {
    public static void main(String[] args) throws IOException {
        String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
        URL url = new URL(image);
        InputStream inputStream = url.openStream();
        Path path = Path.of("C:\\tempFolder\\Google_image.png");
        Files.copy(inputStream, path);
    }
}
