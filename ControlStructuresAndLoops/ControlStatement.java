package ControlStructuresAndLoops;

import java.util.Scanner;

public class ControlStatement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      authentication login
        final String correctUsername = "admin";
        final String correctPassword = "123";
//      user can only attempt to login 3 times, otherwise, it terminated
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equalsIgnoreCase(correctUsername)) {
                if (password.equalsIgnoreCase(correctPassword)) {
                    System.out.println("Log in Succesfully...");

                    double cppScore = 0;
                    double javaScore = 0;
                    double csharpScore = 0;
                    int studentCount = 0;
                    int passCount = 0;
                    int failCount = 0;
                    double totalScore = 0;
                    double avg = 0;
                    while (true) {
                        System.out.println("Student " + (studentCount + 1) + ":");
                        do {
                            System.out.print("Enter the score for C++ (0-100): ");
                            cppScore = scanner.nextInt();
                            if (cppScore < 0 || cppScore > 100) {
                                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                            }
                        } while (cppScore < 0 || cppScore > 100);

                        while (true) {
                            System.out.print("Enter the score for Java (0-100): ");
                            javaScore = scanner.nextInt();
                            if (javaScore >= 0 && javaScore <= 100) {
                                break;
                            } else {
                                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                            }
                        }

                        for (int i = 0; i < 1;) {
                            System.out.print("Enter the score for C# (0-100): ");
                            csharpScore = scanner.nextInt();
                            if (csharpScore >= 0 && csharpScore <= 100) {
                                break;
                            } else {
                                System.out.println("Invalid score! Please enter a score between 0 and 100.");
                            }
                        }

                        totalScore = cppScore + javaScore + csharpScore;
                        avg = totalScore / 3;

                        System.out.printf("Total score: %.2f\n", totalScore);
                        System.out.printf("Average: %.2f\n", avg);

                        if (avg > 50) {
                            passCount++;
                        } else {
                            failCount++;
                        }

                        studentCount++;
                        scanner.nextLine();

                        String answer;
                        while (true) {
                            System.out.print("One more student? (Y/N): ");
                            answer = scanner.nextLine();
                            if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
                                break;
                            } else {
                                System.out.println("Invalid input! Please enter 'Y' or 'N'.");
                            }
                        }

                        if (answer.equalsIgnoreCase("N")) {
                            break;
                        }
                    }

                    System.out.println("Total students: " + studentCount);
                    System.out.println("Total passed: " + passCount);
                    System.out.println("Total failed: " + failCount);

                    break;
                } else {
                    System.out.println("Incorrect password!");
                }
            }else {
                if (password.equals(correctPassword)) {
                    System.out.println("Incorrect username!");
                } else {
                    System.out.println("Incorrect username and password!");
                }
            }
            attempts++;
            if (attempts == 3) {
                System.out.println("Maximum attempts reached. Bye Bye!!");
            }
        }

    }
}