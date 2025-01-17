package abstr;

public class Triangle extends GeometricShape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}
