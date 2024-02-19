package az.babayev.javarush.javacore.task.task3.task1320;

public class User implements DBObject {
    long id;
    String name;

    @Override
    public String toString() {
        return String.format("The user's name is %s, id = %d", name, id);
    }

    @Override
    public DBObject initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }
}
