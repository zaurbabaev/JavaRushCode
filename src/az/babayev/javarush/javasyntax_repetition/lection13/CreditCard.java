package az.babayev.javarush.javasyntax_repetition.lection13;

public class CreditCard {
    public long number;
    public int year;
    public int month;

    public String paymentSystem;

    public Person holder;

    public CreditCard(long number, int year, int month, String paymentSystem,
                      Person holder) {
        this.number = number;
        this.year = year;
        this.month = month;
        this.paymentSystem = paymentSystem;
        this.holder = holder;
    }

    public CreditCard(long number, int year, int month, Person holder) {
        this.number = number;
        this.year = year;
        this.month = month;
        this.holder = holder;

        switch (Math.toIntExact(number)) {
            case 1 -> this.paymentSystem = "Visa";
            case 5 -> this.paymentSystem = "MasterCard";
            case 3 -> this.paymentSystem = "DinersClub";
            case 35 -> this.paymentSystem = "JCB";
            default -> this.paymentSystem = "Unknown";

        }
    }
}


