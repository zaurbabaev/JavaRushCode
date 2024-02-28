package az.babayev.javarush.javacore.task.task5.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {

    }

    static {

        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;


    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line.equals("helicopter")) {
            result = new Helicopter();
        } else if (line.equals("plane")) {
            int passengersCount = Integer.parseInt(reader.readLine());
            result = new Plane(passengersCount);
        }
        reader.close();
    }

}
