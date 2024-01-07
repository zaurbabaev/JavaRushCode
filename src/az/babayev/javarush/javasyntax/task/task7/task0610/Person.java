package az.babayev.javarush.javasyntax.task.task7.task0610;

/*
Перед тобой программа, которая выводит информацию о человеке в консоли.
К сожалению, она не компилируется.
Измени минимальное необходимое количество модификаторов доступа в классе Person,
чтобы код скомпилировался.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    protected String getFullName() {
        return firstName + " " + lastName;
    }
}
