package az.babayev.javarush.javasyntax.lection4;

public class Variable {

    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.run();
    }

    public int count = 0;

    public void run() {
        count = 15; // instance variable
        int count = 5; // local variable
        count++;    // local variable-ni artırırıq
        System.out.println(count); // local variableni çapa veririk.
        // instance-üzərində əməliyyat aparmaq istəsək o zaman bu dətişənin qabağına
        // "this." yazmalıyıq.
    }

}
