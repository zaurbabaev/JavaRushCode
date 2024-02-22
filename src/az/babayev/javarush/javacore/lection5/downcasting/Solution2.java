package az.babayev.javarush.javacore.lection5.downcasting;

public class Solution2 {
    public static void main(String[] args) {
        Tiger parent = new Tiger();
        Cat me = new Tiger();
        me.setMyParent(parent);
        Cat myParent = me.getMyParent();
        System.out.println(myParent.getClass().getSimpleName());
    }
}
