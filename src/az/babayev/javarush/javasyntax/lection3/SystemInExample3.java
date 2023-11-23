package az.babayev.javarush.javasyntax.lection3;

import java.io.*;

public class SystemInExample3 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);


    }

}
