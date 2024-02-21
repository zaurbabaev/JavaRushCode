package az.babayev.javarush.javacore.task.task4.task1414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (true) {
            key = reader.readLine();
            Movie movie = MovieFactory.getMovie(key);
            if (!(key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller"))) {
                break;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }


    public static class MovieFactory {

        static Movie getMovie(String key) {
            return switch (key) {
                case "soapOpera" -> new SoapOpera();
                case "cartoon" -> new Cartoon();
                case "thriller" -> new Thriller();
                default -> null;
            };
        }
    }

    static abstract class Movie {

    }

    static class SoapOpera extends Movie {

    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
