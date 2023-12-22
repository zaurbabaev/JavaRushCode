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

        String cardNumber = Long.toString(number);
        if (cardNumber.startsWith("4")) {
            this.paymentSystem = "Visa";
        } else if (cardNumber.startsWith("5")) {
            this.paymentSystem = "MasterCard";
        } else if (cardNumber.startsWith("36")) {
            this.paymentSystem = "DinersClub";
        } else if (cardNumber.startsWith("35")) {
            this.paymentSystem = "JCB";
        } else {
            this.paymentSystem = "Unknown";
        }
    }
}



