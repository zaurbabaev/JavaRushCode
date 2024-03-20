package az.babayev.javarush.javasyntax.repetition.constructor;

public class ParentClass {
    public String a = Main.print("ParentClass.a");
    public String b = Main.print("ParentClass.b");

    public ParentClass() {
        Main.print("ParentClass.constructor");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalize");
        } finally {
            super.finalize();

        }
    }
}
