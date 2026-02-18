package geometry;

public class Circle extends Shape{
    private double x;
    private double y;
    private double radius;

    public Circle(String color, double x, double y, double radius){
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Рисуем круг: центр(%.1f, %.1f), радиус=%.1f, цвет=%s",
                x, y, radius, color));

    }
}
