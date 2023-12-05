package az.babayev.javarush.javasyntax.lection13;

public class Solution {
    public static void main(String[] args) {
        User ivan = new User("Ivan", "qwerty");
//        User ivan2 = new User("Ivan", "qwerty");
        User petr = new User("Petr", "qwerty");
        User admin = new Admin();
        User buyer = new Customer("Customer", "ytrewq");
        User[] users = {ivan, petr, admin, buyer};
        for (User user : users) {
            System.out.println(user);
        }

//        if(ivan1.equals(ivan2)){
//            System.out.println("equals");
//        }else{
//            System.out.println("not equals");
//        }


    }
}
