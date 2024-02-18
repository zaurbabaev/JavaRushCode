package az.babayev.javarush.javacore.task.task3.task1311;

public abstract class Translator {
    abstract String getLanguage();

    public String translate() {
        return "Я переводчик с " + getLanguage();
    }
}
