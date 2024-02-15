package az.babayev.javarush.javacore.lection1.polymorphism;

import az.babayev.javarush.javacore.lection1.abstraction.AbstractPhone;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone abstractPhone) {
        abstractPhone.call(number);
    }
}
