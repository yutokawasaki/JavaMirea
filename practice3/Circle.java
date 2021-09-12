package practice3;

import java.lang.*;

public class Circle extends Shape {

    protected Double radius;

    final double Pi = 3.1415926536;

    public Circle() {
        radius = 0.0;
    };

    public Circle(Double radius) {

    }

    public Circle(Double radius, String color, Boolean filled) {

    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return radius * radius * Pi;
    };

    public Double getPerimeter() {
        return null;
    };

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                ", Pi=" + Pi +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
