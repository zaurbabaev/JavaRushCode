package az.babayev.javarush.javacore.task.task3.task1306;

public class User implements DBObject {
    public long id;
    public String name;

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("The user's name is %s, id = %d", name, id);
    }
}
