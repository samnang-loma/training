package parallelArray;

public class ParallelArray {
    public static void main(String[] args) {
        // Parallel arrays
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        int[] studentAges = {20, 22, 19};
        char[] studentGrades = {'A', 'B', 'A'};

        // Accessing and printing data
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Student: " + studentNames[i] + ", Age: " + studentAges[i] + ", Grade: " + studentGrades[i]);
        }
    }
}
