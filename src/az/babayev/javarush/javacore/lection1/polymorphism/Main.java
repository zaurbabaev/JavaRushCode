package az.babayev.javarush.javacore.lection1.polymorphism;

import az.babayev.javarush.javacore.lection1.abstraction.AbstractPhone;
import az.babayev.javarush.javacore.lection1.inheritance.Phone;
import az.babayev.javarush.javacore.lection1.inheritance.ThomasEdisonPhone;
import az.babayev.javarush.javacore.lection1.inheritance.VideoPhone;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);

        User user = new User("Andrey");

        user.callAnotherUser(224460, firstPhone);
        System.out.println("-".repeat(30));

        user.callAnotherUser(224460, phone);
        System.out.println("-".repeat(30));

        user.callAnotherUser(224460, videoPhone);
        System.out.println("-".repeat(30));

    }
}
