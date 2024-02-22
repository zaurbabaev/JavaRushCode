package az.babayev.javarush.javacore.lection5.downcasting;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getClass().getSimpleName());

        Cat me = new Cat();
        me.setMyParent(cat);
        Cat myParent = me.getMyParent();
        System.out.println(myParent.getClass().getSimpleName());


        System.out.println("-".repeat(30));

        Tiger parent = new Tiger();
        System.out.println(parent.getClass().getSimpleName());

        Tiger meTiger = new Tiger();
        meTiger.setMyParent(parent);
        System.out.println(meTiger.getClass().getSimpleName());
        Tiger tigerMyParent = meTiger.getMyParent();
        System.out.println(tigerMyParent.getClass().getSimpleName());


    }
}
