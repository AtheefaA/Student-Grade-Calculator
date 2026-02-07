// Student Grade Calculator Program in Java
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");

        // Prompt user for the number of grades
        System.out.print("Enter the number of grades to be entered: ");
        int numGrades = scanner.nextInt();

        // Create an array to store grades
        double[] grades = new double[numGrades];
        double sum = 0;

        // Input grades from the user
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        // Calculate the average
        double average = sum / numGrades;

        // Display the average grade
        System.out.printf("The average grade is: %.2f\n", average);

        scanner.close();
    }
}
