package az.babayev.javarush.javasyntax.lection7;

import java.net.SocketImpl;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] list = new String[5];
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);

        int listLength=list.length;
        System.out.println(listLength);
        list[1]="Mama";
        String string = list[1];
        System.out.println(string);
        System.out.println();

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }




    }
}
