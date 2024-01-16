package az.babayev.javarush.javasyntax.task.task12;

/*
Сделай все переменные класса Planet не статическими.
После этого внеси необходимые правки в метод main.
 */
public class Planet {
    public String name;

    public long age;

    public int speed;

    public int area;

    public void printInformation() {
        System.out.println("Имя планеты: " + name + ".");
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Орбитальная скорость: " + speed + " км/ч.");
        System.out.println("Общая площадь: " + area + " кв. км.");
    }

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
