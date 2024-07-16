package abstr;

public class Square extends GeometricShape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side*side;
    }

    @Override
    double perimeter() {
        return 4*side;
    }
}
