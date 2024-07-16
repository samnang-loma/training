package Inheritance;

public class Student extends Person{
    private int numcourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        numcourses = 0;
    }
}
