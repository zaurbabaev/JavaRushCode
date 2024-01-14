package az.babayev.javarush.javasyntax.lection10;

import java.util.Scanner;

public class StringEx4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("This is jpeg");
        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
            System.out.println("This is html");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("This is Word document");
        } else {
            System.out.println("Unknown format");
        }
    }
}
