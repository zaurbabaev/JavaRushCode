package az.babayev.javarush.javasyntax.lection5;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W" + chessBoardCoord(j, i);
                } else {
                    chessBoard[i][j] = "B" + chessBoardCoord(j, i);
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

    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7) || (b > 7)) {
            return null;
        } else {
            return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
        }
    }
}
