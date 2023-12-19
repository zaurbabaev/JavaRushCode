package az.babayev.javarush.javasyntax_repetition.lection8;

public class PersonMain {
    public static void main(String[] args) {
        Person kate=new Person("Kate",32,"Baker Street","+1233456");
        kate.displayName();
        kate.displayAge();
        kate.displayAddress();
        kate.displayPhone();
    }
}
