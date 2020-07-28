package Lessons;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Ширина и высота - " +
                width + " и " + height);
    }
}

class Triangle extends TwoDShape {
    String style;

    Triangle(String s, double w, double h) {
        super(w,h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("закрашенный",
                4.0, 4.0);
        Triangle t2 = new Triangle("контурный",
                8.0, 12.0);
        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());
        System.out.println();
        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());
    }
}
