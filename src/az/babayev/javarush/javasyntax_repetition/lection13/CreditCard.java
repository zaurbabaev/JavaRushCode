package az.babayev.javarush.javasyntax_repetition.lection13;

import java.util.Objects;

public class CreditCard {
    public long number;
    public int year;
    public int month;

    public String paymentSystem;

    public Person holder;

    public CreditCard(long number, int year, int month, String paymentSystem, Person holder) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        if (number != that.number) return false;
        if (year != that.year) return false;
        if (month != that.month) return false;
        if (!Objects.equals(paymentSystem, that.paymentSystem))
            return false;
        return Objects.equals(holder, that.holder);
    }

    @Override
    public int hashCode() {
        int result = (int) (number ^ (number >>> 32));
        result = 31 * result + year;
        result = 31 * result + month;
        result = 31 * result + (paymentSystem != null ? paymentSystem.hashCode() : 0);
        result = 31 * result + (holder != null ? holder.hashCode() : 0);
        return result;
    }
}


