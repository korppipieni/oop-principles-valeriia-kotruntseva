package geometry;

public class Rectangle extends Shape{

    private double x1, y1;
    private double x2, y2;

    public Rectangle(String color, double x1, double y1, double x2, double y2){
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Рисуем прямоугольник: от(%.1f, %.1f) до(%.1f, %.1f), цвет=%s",
                x1, y1, x2, y2, color));
    }

}
