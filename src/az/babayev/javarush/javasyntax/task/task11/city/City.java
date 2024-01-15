package az.babayev.javarush.javasyntax.task.task11.city;

/*
У класса City есть два поля - название города и текущая температура воздуха.
Также в классе Solution есть метод showWeather: он выводит в консоли информацию
о погоде в городе, который передан в качестве аргумента метода.
Реализуй метод showWeather, который должен выводить в консоли
информацию в таком формате: В городе "название города"
сегодня температура воздуха "температура в городе"
В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

Пример вывода:
В городе Дубай сегодня температура воздуха 40
 */
public class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


}
