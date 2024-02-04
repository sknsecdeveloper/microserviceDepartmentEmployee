package org.example.com.solid.openClose;

public class Circle implements Shape {

    int r;

    public double area() {
        return Math.PI*r*r;
    }
}
