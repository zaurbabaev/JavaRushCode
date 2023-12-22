package az.babayev.javarush.javasyntax_repetition.lection13;

public class CardValidator {
    public boolean validate(CreditCard card) {
        if (card.number == 0) {
            return false;
        }
        return true;

    }
}
