package az.babayev.javarush.javasyntax_repetition.lection8;

public class ChessBoard {
    public static String chessBoard(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if (a > 7 || b > 7) {
            return null;
        } else {
            return Character.toString(letters.charAt(a)) + Character.toString(numbers.charAt(b));
        }

    }

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W" + chessBoard(i, j);
                } else {
                    chessBoard[i][j] = "B" + chessBoard(i, j);
                }
            }
        }
        for (String[] strings : chessBoard) {
            for (String string : strings) {
                System.out.print(string + "\t");
            }
            System.out.println();
        }
    }
}
