package az.babayev.javarush.javasyntax.lection5;

import java.util.Arrays;
import java.util.function.Consumer;

public class TwoDimArrayEx {
    public static void main(String[] args) {
        int[][] twoDimArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
