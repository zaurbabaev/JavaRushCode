package az.babayev.javarush.javasyntax.lection11.constructor;

public class ChildClass extends ParentClass{
    public String c = Main.print("ChildClass.c");
    public String d = Main.print("ChildClass.d");

    public ChildClass() {
        Main.print("ChildClass.constructor");
    }

}
