package az.babayev.javarush.javasyntax.task.task11;

/*
У нас есть класс Programmer, в котором есть очень важное поле — salary.
Наша задача следующая: нужно добавить возможность получить и
изменить значение этого поля, используя геттер и сеттер.
Но есть нюанс: зарплату можно только повышать.
Поэтому тебе нужно добавить проверку в сеттер: если значение аргумента
 больше текущего значения, то поле salary изменяем, иначе — игнорируем.
 */
public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < this.salary) {
            return;
        }
        this.salary = salary;
    }

    public static void main(String[] args) {
        Programmer programmer=new Programmer();
        programmer.setSalary(1200);
        System.out.println(programmer.getSalary());

    }

}
