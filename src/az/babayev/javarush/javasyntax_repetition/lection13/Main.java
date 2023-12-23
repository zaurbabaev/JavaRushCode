package az.babayev.javarush.javasyntax_repetition.lection13;

import az.babayev.javarush.javasyntax_repetition.lection12.models.Car;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="Zaur";
        person.surname="Babayev";
        CreditCard creditCard = new CreditCard(35l, 2022, 3, person);
        System.out.println(creditCard.paymentSystem);

        CardValidator cardValidator = new CardValidator();
        System.out.println(cardValidator.validate(creditCard));


        
    }
}
