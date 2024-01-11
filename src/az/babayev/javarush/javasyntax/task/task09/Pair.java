package az.babayev.javarush.javasyntax.task.task09;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        x = x ^ y;
        y = y ^ x;
        x = x ^ y;
    }
}

class Solution {
    public static void main(String[] args) {
        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
