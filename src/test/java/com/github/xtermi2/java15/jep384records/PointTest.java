package com.github.xtermi2.java15.jep384records;

import org.junit.jupiter.api.Test;

import java.lang.reflect.RecordComponent;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    private Point underTest = new Point(1, 2);

    @Test
    void record_toString() {
        assertThat(underTest.toString())
                .isEqualTo("Point[x=1, y=2]");
    }

    @Test
    void record_equals() {
        assertThat(underTest)
                .isEqualTo(new Point(1, 2));
    }

    @Test
    void Point2_constructor() {
        Point3D point = new Point3D(1, 2);
        assertThat(point.toString())
                .as("toString")
                .isEqualTo("Point3D[x=1, y=2, z=0]");
        assertThat(point)
                .as("equals")
                .isEqualTo(new Point3D(1, 2, 0));
    }

    @Test
    void reflection() {
        assertThat(underTest.getClass().isRecord())
                .isTrue();

        assertThat(Arrays.stream(underTest.getClass().getRecordComponents())
                .map(RecordComponent::getName))
                .containsExactlyInAnyOrder("x", "y");
    }
}