package az.babayev.javarush.javacore.lection5.narrowing_widening;

public class Example {
//    public static void print(int n) {
//        System.out.println("int " + n);
//    }

    public static void print(short n) {
        System.out.println("short " + n);
    }

//    public static void print(Integer n) {
//        System.out.println("Integer " + n);
//    }

    public static void print(String n) {
        System.out.println("String " + n);
    }

//    public static void print(byte n) {
//        System.out.println("byte " + n);
//    }


    public static void main(String[] args) {

        print((byte) 1);
        print((byte) 23);
        print("Hello");
        print((byte)23);
        print((byte)45);
        print((String) null);


    }
}
