package az.babayev.javarush.javasyntax.task.task11.computer;

/*
Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь.
В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.
 */
public class Computer {

    public Computer() {
        new SystemUnit();
        new Monitor();
        new Keyboard();
        new Mouse();
    }
}
