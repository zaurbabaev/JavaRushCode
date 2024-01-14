package az.babayev.javarush.javasyntax.task.task11;

/*
Давай построим бизнес-центр, который состоит из двух зданий,
один из которых только начинаем строить, а второй — на этапе планирования, поэтому о нем мало что известно.
Тебе нужно будет создать два конструктора: один с параметрами,
второй — без. Они оба должны инициализировать поля floorsCount и developer.
 */
public class Skyscraper3 {
    private int floorsCount;
    private String developer;

    public Skyscraper3() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Skyscraper3(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }


    public static void main(String[] args) {
        var skyscraper = new Skyscraper3();
        var skyscraperUnknown = new Skyscraper3(50, "Неизвестно");
    }
}
