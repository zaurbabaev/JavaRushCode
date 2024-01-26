package az.babayev.javarush.javasyntax.task.task15.lion_food;

/*
Запусти программу и посмотри, что происходит.
В методе eat добавь блок finally, чтобы лев ложился спать, даже если ему
 не удалось перекусить.

Ожидаемый вывод в случае, когда food != null:
ищет еду
нашел мясо
все съел
лег спать

Ожидаемый вывод когда food == null:
ищет еду
ничего не нашел
лег спать голодным
 */
public class LionAndFood {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }

}
