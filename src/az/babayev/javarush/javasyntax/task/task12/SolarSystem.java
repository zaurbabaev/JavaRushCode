package az.babayev.javarush.javasyntax.task.task12;

/*
Программа выводит на экран основные факты о Солнечной системе.
Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem,
но результат работы программы при этом не изменился.

Ожидаемый вывод:
Человечество живет в Солнечной системе.
Ее возраст около 4568200000 лет.
В Солнечной системе 8 известных планет.
Как и большинство звездных систем, состоит из 1 звезды.
Звезды по имени Солнце.
Расстояние к центру галактики составляет 27170 световых лет.
Каждый обитатель Солнечной системы должен знать эту информацию!
 */
public class SolarSystem {
    public static long age = 4_568_200_000L;
    public static int planetsCount = 8;
    public static int starsCount = 1;
    public static String starName = "Солнце";
    public static int galacticCenterDistance = 27170;

    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.printf("Ее возраст около %d лет.%n", SolarSystem.age);
        System.out.printf("В Солнечной системе %d известных планет.%n", SolarSystem.planetsCount);
        System.out.printf("Как и большинство звездных систем, состоит из %d звезды.\n", SolarSystem.starsCount);
        System.out.printf("Звезды по имени %s.%n", SolarSystem.starName);
        System.out.printf("Расстояние к центру галактики составляет %d световых лет.%n", SolarSystem.galacticCenterDistance);
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
    }
}
