package az.babayev.javarush.javacore.task.task3.task1317;

public class Today implements Weather {
    private String type;

    Today(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Today it will be %s", this.getWeatherType());
    }

    @Override
    public String getWeatherType() {
        return type;
    }
}
