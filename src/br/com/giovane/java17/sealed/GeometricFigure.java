package br.com.giovane.java17.sealed;

// interfaces can be sealed
sealed interface SealedInterface permits Circle, Square, Rectangle, Triangle { }

// classes can be sealed
public sealed abstract class GeometricFigure permits Circle, Rectangle, Square, Triangle {
    protected String color;
    public abstract void calculateArea();
}

// classes that extends and implements the sealed classes and interfaces
non-sealed class Square extends GeometricFigure implements SealedInterface {
    @Override
    public void calculateArea() { }
}

non-sealed class Circle extends GeometricFigure implements SealedInterface {
    @Override
    public void calculateArea() { }
}

final class Triangle extends GeometricFigure implements SealedInterface {
    @Override
    public void calculateArea() { }
}

final class Rectangle extends GeometricFigure implements SealedInterface {
    @Override
    public void calculateArea() { }
}

//class Table extends GeometricFigure{ }


// 3 modifiers

// final = no other class can extend.
// sealed = The class is sealed and has to declare permits saying which classes are allowed.
// non-sealed = is non-sealed, and other classes can extend.

