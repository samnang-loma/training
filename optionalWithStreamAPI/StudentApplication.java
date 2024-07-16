package optionalWithStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StudentApplication {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("sok", 89.8),
                new Student("jane", 55.5),
                new Student("john", 78.2),
                new Student("sarah", 85.7),
                new Student("tom", 92.0)
                );

//      Filter students who passed (grade >= 60)
        List<Student> passStudent = students.stream().filter(student -> student.getGrade() >= 60).collect(Collectors.toList());

//      average grade of passed students
        OptionalDouble averageGrade = passStudent.stream()
                .mapToDouble(Student::getGrade)
                .average();
        averageGrade.ifPresent(avg -> System.out.println("Average Grade of Passed Students: " + avg));

        List<String> passedStudentNames = passStudent.stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Names of Passed Students in Alphabetical Order: " + passedStudentNames);

    }
}
