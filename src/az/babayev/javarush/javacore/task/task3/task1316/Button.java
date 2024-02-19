package az.babayev.javarush.javacore.task.task3.task1316;

public interface Button extends SimpleObject {

    String NAME = "Submit";

    void onPress();

    String onPress(Object o);


}
