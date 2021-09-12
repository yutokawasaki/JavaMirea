package practice3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(Double width, Double length, String color, Boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getArea() {
        return width * length;
    }

    public Double getPerimeter() {
        return width * 2 + length * 2;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
