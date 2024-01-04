package az.babayev.javarush.javasyntax.lection4;

public class ForExample {
    public static void main(String[] args) {
//        for(int i = 0; true; i++) {
//            if(i % 1000000 == 0) System.out.println(i);
//        }
//        System.out.println("Loop ended");  unreachable statement


        for (int i = 0; i > -1; i++) {
            if (i % 1000000 == 0) System.out.println(i);
        }
        System.out.println("Loop ended");
    }
}