package az.babayev.javarush.javacore.task.task4.task14171;

public class USD extends Money{
    public USD(double аmount) {
        super(аmount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
