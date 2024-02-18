package az.babayev.javarush.javacore.task.task3.task1302;

public class AlcoholicBeer implements Drink {
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    @Override
    public String toString() {
        if (isAlcoholic()) {
            return "Напиток алкогольный";
        } else {
            return "Напиток безалкогольный";
        }
    }
}