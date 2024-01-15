package az.babayev.javarush.javasyntax.task.task11;
/*
В классе Coordinate есть 2 геттера и 2 сеттера, но значения переменным
сеттеры не устанавливают.
Разберись, почему так происходит и исправь. Метод main не участвует в проверке.
 */
public class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
