package az.babayev.javarush.javacore.task.task4.task14171;

public abstract class Money {

    private double amount;

    public abstract String getCurrencyName();

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
