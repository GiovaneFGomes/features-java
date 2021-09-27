package br.com.giovane.java17.sealed;

public sealed abstract class GeometricFigure permits Square, Circle, Triangle, Rectangle {

    protected String color;
    public abstract void calculateArea();

}

final class Square extends GeometricFigure {
    @Override
    public void calculateArea() { }
}


final class Circle extends GeometricFigure {
    @Override
    public void calculateArea() { }
}


final class Triangle extends GeometricFigure {
    @Override
    public void calculateArea() { }
}


final class Rectangle extends GeometricFigure {
    @Override
    public void calculateArea() { }
}


// class Table extends GeometricFigure{}