package az.babayev.javarush.javasyntax.task.task11;

/*
Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных
способа вывода информации:
Объявляет о результате постройки.
Объявляет о результате и указывает количество этажей.
Объявляет о результате и указывает застройщика.
Пример вывода:
Небоскреб построен.
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment

Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.
 */
public class Skyscraper2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscraper2() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscraper2(int floorsCount) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floorsCount);
    }

    public Skyscraper2(String buildDeveloper) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + buildDeveloper);
    }

    public static void main(String[] args) {

        var skyscraper = new Skyscraper2();
        var skyscraperTower = new Skyscraper2(50);
        var skyscraperSkyline = new Skyscraper2("JavaRushDevelopment");
    }
}
