package az.babayev.javarush.javasyntax.task.task11.materics;
/*
Как известно, на планете Земля есть 6 материков.
Создай для каждого материка собственный класс.
В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.
 */
public class Earth {
    public static void main(String[] args) {
        Eurasia eurasia = new Eurasia(55_000_000);
        Africa africa = new Africa(30_000_000);
        NorthAmerica northAmerica = new NorthAmerica(24_000_000);
        SouthAmerica southAmerica = new SouthAmerica(18_000_000);
        Antarctica antarctica = new Antarctica(14_000_000);
        Australia australia = new Australia(8_000_000);

    }

}
