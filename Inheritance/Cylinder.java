package Inheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height = 1;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(radius, height)");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

    public double getVolume(){
        return getArea() * height;
    }
}
