package Inheritance;

public class TestCylinder {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println("The radius is " + c1.getRadius() + "\n" +
                            "The height is " + c1.getHeight() + "\n" +
                            "The volume is " + c1.getVolume());

        Cylinder c2 = new Cylinder(2);
        System.out.println("The radius is " + c2.getRadius() + "\n" +
                "The height is " + c2.getHeight() + "\n" +
                "The volume is " + c2.getVolume());
    }
}
