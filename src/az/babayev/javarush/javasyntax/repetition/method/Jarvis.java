package az.babayev.javarush.javasyntax.repetition.method;

public class Jarvis {


    public void sayHi(String... guest) {
        for (String s : guest) {
            System.out.format("Hi %s how are you? \n", s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Tonny Stark");
        jarvis.sayHi("Tonny Stark","Capitan America");
    }
}
