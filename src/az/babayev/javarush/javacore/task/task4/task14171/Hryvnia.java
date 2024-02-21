package az.babayev.javarush.javacore.task.task4.task14171;

public class Hryvnia extends Money{
    public Hryvnia(double аmount) {
        super(аmount);
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
