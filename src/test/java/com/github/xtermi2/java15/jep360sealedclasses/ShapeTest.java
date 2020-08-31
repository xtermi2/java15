package com.github.xtermi2.java15.jep360sealedclasses;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeTest {

    @Test
    void instanceOfCasting() {
        Shape circle = new Shape.Circle(2d);

        if (circle instanceof Shape.Circle c) {
            assertThat(c.getRadius())
                    .isEqualTo(2d);
        }
    }

    @Test
    void switch_sealed_classes() {
        final Shape circle = new Shape.Circle(2d);
        final Shape square = new Shape.Square(1d);

//        String info = switch (circle) {
//            case Shape.Circle c -> "Circle with radius=" + c.getRadius();
//            case Shape.Square s -> "Square with edgeLength=" + s.getEdgeLength();
//        };
//        assertThat(info)
//                .isEqualTo("Circle with radius=2.0");
    }
}