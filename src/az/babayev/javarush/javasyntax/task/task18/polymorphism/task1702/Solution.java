package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1702;

/*
Классы Triangle, Rectangle и Circle — геометрические фигуры, поэтому они
и унаследованы от класса Shape.
Переопредели в них метод printInfo(), чтобы в консоли выводилось
название конкретной фигуры:
Для Triangle — "Треугольник";
Rectangle — "Прямоугольник";
Circle — "Круг".

Метод main() в тестировании участия не принима
 */
public class Solution {
    public static void main(String[] args) {
        var shape = new Shape();
        var circle = new Circle();
        var rectangle = new Rectangle();
        var triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }

}
