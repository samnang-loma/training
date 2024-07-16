package ControlStructuresAndLoops;

import java.util.Scanner;

public class ControlStatementExample {

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "123";
    private static final int MAX_ATTEMPTS = 3;
    private static final int SCORE_MIN = 0;
    private static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (authenticate(scanner)) {
            processStudentScores(scanner);
        }

    }

    private static boolean authenticate(Scanner scanner) {
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (isAuthenticated(username, password)) {
                System.out.println("Login Successfully...");
                return true;
            } else {
                System.out.println("Incorrect username or password!");
                attempts++;
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Maximum attempts reached. Bye Bye!!");
            }
        }

        return false;
    }

    private static boolean isAuthenticated(String username, String password) {
        return username.equalsIgnoreCase(CORRECT_USERNAME) && password.equalsIgnoreCase(CORRECT_PASSWORD);
    }

    private static void processStudentScores(Scanner scanner) {
        int studentCount = 0;
        int passCount = 0;
        int failCount = 0;

        while (true) {
            System.out.println("Student " + (studentCount + 1) + ":");

            double cppScore = getScore(scanner, "C++");
            double javaScore = getScore(scanner, "Java");
            double csharpScore = getScore(scanner, "C#");

            double totalScore = cppScore + javaScore + csharpScore;
            double averageScore = totalScore / 3;

            System.out.printf("Total score: %.2f%n", totalScore);
            System.out.printf("Average: %.2f%n", averageScore);

            if (averageScore > 50) {
                passCount++;
            } else {
                failCount++;
            }

            studentCount++;

            if (!isAnotherStudent(scanner)) {
                break;
            }
        }

        printSummary(studentCount, passCount, failCount);
    }

    private static double getScore(Scanner scanner, String subject) {
        double score;
        while (true) {
            System.out.printf("Enter the score for %s (%d-%d): ", subject, SCORE_MIN, SCORE_MAX);
            score = scanner.nextDouble();
            if (score >= SCORE_MIN && score <= SCORE_MAX) {
                break;
            } else {
                System.out.println("Invalid score! Please enter a score between 0 and 100.");
            }
        }
        return score;
    }

    private static boolean isAnotherStudent(Scanner scanner) {
        scanner.nextLine();
        while (true) {
            System.out.print("One more student? (Y/N): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Invalid input! Please enter 'Y' or 'N'.");
            }
        }
    }

    private static void printSummary(int studentCount, int passCount, int failCount) {
        System.out.println("Total students: " + studentCount);
        System.out.println("Total passed: " + passCount);
        System.out.println("Total failed: " + failCount);
    }
}
