package az.babayev.javarush.javasyntax.task.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;

/*
Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете,
отправляя туда данные, получать ответные данные и выводить их на экран.

Подсказки:

Используй метод openConnection() класса URL.
Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
Если не знаешь, какой API использовать, бери http://httpbin.org/post.
 */
public class GetInformation3 {
    public static void main(String[] args) throws IOException {
        var url = new URL("http://httpbin.org/post");
        var urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);
        var outputStream = urlConnection.getOutputStream();
        var printStream = new PrintStream(outputStream);
        printStream.println("Hello");

        var inputStream = urlConnection.getInputStream();
        var bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
