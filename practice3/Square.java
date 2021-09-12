package practice3;

public class Square extends Rectangle {
    public Square() {
        setWidth(0.0);
        setLength(0.0);
    }

    public Square(Double side) {
        setWidth(side);
        setLength(side);
    }

    public Square(Double side, String color, Boolean filled) {
        setWidth(side);
        setLength(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(Double side) {
        setWidth(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square {" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
