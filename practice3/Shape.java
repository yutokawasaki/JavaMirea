package practice3;

import java.lang.*;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape() {
        color = "white";
        filled = false;
    };

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract Double getArea();

    public abstract Double getPerimeter();

    @Override
    public String toString() {
        return "Shape {" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
