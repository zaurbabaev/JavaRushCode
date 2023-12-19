package az.babayev.javarush.javasyntax_repetition.lection9;

public class StringExample {
    public static void main(String[] args) {
        String str1="JavaRush";
        String str2="JavaRush";
        String str3=new String("JavaRush").intern();
        String str4=new String("JavaRush").intern();
        System.out.println("1==2? "+(str1==str2));
        System.out.println("2==3? "+(str2==str3));
        System.out.println("3==4? "+(str3==str4));
    }
}
