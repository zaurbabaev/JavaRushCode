package az.babayev.javarush.javasyntax.lection11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CurrencyProcessor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        while (true) {
            String line = reader.readLine();
            if (!line.equalsIgnoreCase("end")) {
                result.append(line).append(" ");
            } else {
                break;
            }
        }

        String resultCurrenties = result.toString();
        StringTokenizer tokenizer = new StringTokenizer(resultCurrenties, ", ");
        int count = tokenizer.countTokens();
        String[] currencyData = new String[count];
        int index = 0;
        while (tokenizer.hasMoreTokens()) {
            currencyData[index++] = tokenizer.nextToken();
        }
        System.out.println(Arrays.toString(currencyData));
    }

}
