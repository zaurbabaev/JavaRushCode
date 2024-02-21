package az.babayev.javarush.javacore.task.task4.task14171;

public class Ruble extends Money{
    public Ruble(double аmount) {
        super(аmount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
