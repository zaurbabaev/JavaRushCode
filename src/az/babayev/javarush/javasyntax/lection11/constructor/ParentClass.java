package az.babayev.javarush.javasyntax.lection11.constructor;

public class ParentClass {
    public String a = Main.print("ParentClass.a");
    public String b = Main.print("ParentClass.b");

    public ParentClass() {
        Main.print("ParentClass.constructor");
    }
}
