package az.babayev.javarush.javacore.lection5.downcasting;

public class Tiger extends Cat {

    @Override
    public Tiger getMyParent() {
        return (Tiger) this.parent;
    }
}
