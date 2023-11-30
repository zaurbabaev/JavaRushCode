package az.babayev.javarush.javasyntax.lection8;

public class DimensionArrayExample {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][4];
        twoDimArray[0][0] = 3;
        twoDimArray[0][1] = 5;
        twoDimArray[0][2] = 8;
        twoDimArray[0][3] = 36;
        twoDimArray[1][0] = 13;
        twoDimArray[1][1] = 33;
        twoDimArray[1][2] = 21;
        twoDimArray[1][3] = 9;
        twoDimArray[2][0] = 76;
        twoDimArray[2][1] = 2;
        twoDimArray[2][2] = 0;
        twoDimArray[2][3] = 7;

        // massivi yaradan kimi initialization etmək

        int[][] twoDimArray2 = new int[][]{
                {3, 5, 8, 36},
                {13, 33, 21, 9},
                {76, 2, 0, 7},
        };

        int[][] twoDimArray3 = {
                {3, 5, 8, 36},
                {13, 33, 21, 9},
                {76, 2, 0, 7},
        };

        for (int i = 0; i < twoDimArray3.length; i++) {
            for (int i1 = 0; i1 < twoDimArray3[i].length; i1++) {
                System.out.print("[" + i + "]" + "[" + i1 + "]-> " + twoDimArray3[i][i1] + ", ");
            }
            System.out.println();
        }

        int length0 = twoDimArray3[0].length;
        int length1 = twoDimArray3[1].length;
        int length2 = twoDimArray3[2].length;
        System.out.println(length0);
        System.out.println(length1);
        System.out.println(length2);

    }
}
