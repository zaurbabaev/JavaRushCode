package az.babayev.javarush.javasyntax.lection8;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int i1 = 0; i1 < chessBoard[i].length; i1++) {
                if ((i + i1) % 2 == 0) {
                    chessBoard[i][i1] = "W" + chessBoard(i1, i);
                } else {
                    chessBoard[i][i1] = "B" + chessBoard(i1, i);
                }
            }
        }

        for (String[] strings : chessBoard) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }
    public static String chessBoard(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if (a > 7 || b > 7) {
            return null;
        } else {
            return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
        }
    }
}
