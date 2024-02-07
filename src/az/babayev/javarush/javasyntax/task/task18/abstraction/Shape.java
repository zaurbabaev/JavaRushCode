package az.babayev.javarush.javasyntax.task.task18.abstraction;

/*
Класс Shape обозначает геометрическую фигуру. В будущем от него можно будет
унаследовать какую-то конкретную фигуру.
У этой фигуры можно будет посчитать периметр и площадь. У разных фигур они
считаются по разным формулам.
И так как ни периметр, ни площадь невозможно высчитать у абстрактной фигуры,
класс Shape стоит сделать абстрактным.

Также сделай задел на будущее и создай в нем абстрактные методы getPerimeter() и
getArea(). Методы будут возвращать значение типа double.
 */
public abstract class Shape {

    public abstract double getPerimeter();

    public abstract double getArea();
}
