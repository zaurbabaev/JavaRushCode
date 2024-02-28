package az.babayev.javarush.javacore.task.task5.task1528;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    public static class Hryvnia extends Money {
        private double amount = 123d;

        @Override
        Hryvnia getMoney() {
            return this;
        }

        @Override
        public Double getAmount() {
            return amount;
        }
    }
}
