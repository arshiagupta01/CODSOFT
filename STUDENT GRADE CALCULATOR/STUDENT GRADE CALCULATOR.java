import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to calculate total marks
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate average percentage
    public static double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    // Method to determine grade
    public static String calculateGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int[] marks = new int[subjects];

        // Taking input
        for (int i = 0; i < subjects; i++) {
            while (true) {
                System.out.print("Enter marks for Subject " + (i + 1) + " (0-100): ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                } else {
                    System.out.println("Invalid Input! Marks must be between 0 and 100.");
                }
            }
        }

        int totalMarks = calculateTotal(marks);
        double averagePercentage = calculateAverage(totalMarks, subjects);
        String grade = calculateGrade(averagePercentage);

        // Display Result
        System.out.println("\n========== RESULT ==========");
        System.out.println("Total Marks      : " + totalMarks);
        System.out.println("Average Percent  : " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade Obtained   : " + grade);
        System.out.println("============================");

        sc.close();
    }
}