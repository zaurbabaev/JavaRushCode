package az.babayev.javarush.javasyntax.task.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Твоя задача — обратиться к публичному API в интернете и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете,
получать данные и выводить их на экран.

Подсказки:

Используй метод openStream() класса URL.
Если не знаешь, какой API использовать, можешь запросить у нас на сервере
список проектов-игр:
https://javarush.com/api/1.0/rest/projects
 */
public class GetInformation {
    public static void main(String[] args) throws IOException {
        var url = new URL("https://javarush.com/api/1.0/rest/projects");
        var inputStream = url.openStream();
        var reader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(reader.readLine());
    }
}
class GetInformation2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com/api/1.0/rest/projects");
        InputStream inputStream = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        byte[] bytes = inputStream.readAllBytes();
        String str = new String(bytes);
        System.out.println(str);
    }
}
