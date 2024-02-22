package az.babayev.javarush.javacore.lection5.downcasting;

public class Cat {
    public Cat parent;

    public Cat getMyParent() {
        return this.parent;
    }

    public void setMyParent(Cat cat) {
        this.parent = cat;
    }
}
