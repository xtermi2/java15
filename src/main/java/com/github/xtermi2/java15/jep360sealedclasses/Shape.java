package com.github.xtermi2.java15.jep360sealedclasses;

public abstract sealed class Shape permits Rectangle, Shape.Circle, Shape.Square {

    abstract double calculateArea();

    public double calculateCircumference() {
//        return switch (this) {
//            case Rectangle r -> (2 * r.getA()) + (2 * getB());
//            case Shape.Circle c -> 2 * Math.PI * c.getRadius();
//            case Shape.Square s -> 4 * s.getEdgeLength();
//        };
        return -1d;
    }

    public static final class Circle extends Shape {

        final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return radius * radius * Math.PI;
        }

        public double getRadius() {
            return radius;
        }
    }

    public static final class Square extends Shape {
        final double edgeLength;

        public Square(double edgeLength) {
            this.edgeLength = edgeLength;
        }

        @Override
        double calculateArea() {
            return edgeLength * edgeLength;
        }

        public double getEdgeLength() {
            return edgeLength;
        }
    }
}
