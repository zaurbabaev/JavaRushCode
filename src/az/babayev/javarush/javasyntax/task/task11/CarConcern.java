package az.babayev.javarush.javasyntax.task.task11;

/*
Почувствуй себя автоконструктором и найди решение,
как сделать так, чтобы завод снова заработал. Для этого тебе нужно добавить инициализацию
полей в конструкторах соответствующими параметрами.
Если параметр отсутствует, то нужно инициализировать поле значением по умолчанию.
Для поля year это текущий год (4321), для поля color — Оранжевый
 */
public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    @Override
    public String toString() {
        return "CarConcern{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this(model, year, "Оранжевый");
    }

    public CarConcern(String model) {
        this(model, 4321);
    }

    public static void main(String[] args) {
        CarConcern carConcern = new CarConcern("car");
        System.out.println(carConcern);

    }
}