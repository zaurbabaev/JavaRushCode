package az.babayev.javarush.javasyntax.task.task11;

/*
Постройка здания планировалась под ресторан и успешно завершилась,
но спустя некоторое время собственники решили переделать его под барбершоп.
Нам нужно сделать так, что бы здание было универсальным,
и его назначение можно было менять, не создавая нового.
Для этого создай метод initialize, который будет устанавливать значение полю type
(определять тип здания), а конструктор убери.
 */
public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
        System.out.println(type);
    }


    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
        building.initialize("Ресторан");
    }
}
