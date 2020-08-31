package com.github.xtermi2.java15.jep384records;

/**
 * like a data class in kotlin:
 * - immutable
 * - not extendable
 * - has build in toString, equals and hashCode
 */
public record Point(int x, int y) {}

record Point3D(int x, int y, int z) {
    Point3D(int x, int y) {
        this(x, y, 0);
    }
}
