package practice3;

public class TestShape {
    public static void main(String[] args) {
        Circle krug1 = new Circle();
        krug1.setColor("Красный");
        krug1.setFilled(true);
        krug1.setRadius(13.37);
        System.out.println(krug1.toString());
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10.0);
        rectangle.setLength(13.0);
        rectangle.setColor("Зеленый");
        rectangle.setFilled(false);
        System.out.println(rectangle.toString());
        Square square = new Square();
        square.setSide(15.0);
        square.setColor("Синий");
        square.setFilled(true);
        System.out.println(square.toString());
    }
}
