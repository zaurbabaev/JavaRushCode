package az.babayev.javarush.javasyntax.task.task13;

/*
В классе PaymentOfBills есть поле balance, которое описывает баланс средств на
банковском счете.
При объявлении проинициализируй его значением Integer.MAX_VALUE.
Реализуй метод processPayment(String), который принимает чек и производит списание
средств со счета соответственно чеку.
Метод main не принимает участие в проверке.
 */
public class PaymentOfBills {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";
        System.out.println("Tекущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Tекущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        balance -= Integer.parseInt(bill);
    }

}
