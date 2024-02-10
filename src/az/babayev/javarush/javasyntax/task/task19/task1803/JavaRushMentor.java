package az.babayev.javarush.javasyntax.task.task19.task1803;

public class JavaRushMentor {
    private String name;

    public JavaRushMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "JavaRushMentor - " + name;
    }
}
