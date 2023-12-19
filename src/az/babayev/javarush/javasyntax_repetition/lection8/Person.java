package az.babayev.javarush.javasyntax_repetition.lection8;

public class Person {
    String name;
    int age;
    String address;
    String phone;

    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.printf("Name: %s %n", name);
    }

    public void displayAge() {
        System.out.printf("Age: %d %n", age);
    }

    public void displayAddress() {
        System.out.printf("Address: %s %n", address);
    }

    public void displayPhone() {
        System.out.printf("Phone: %s %n", phone);
    }
}
