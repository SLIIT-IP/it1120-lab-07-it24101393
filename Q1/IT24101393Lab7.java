import java.util.Scanner;

public class IT24101393Lab7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to store marks
        double[] marks = new double[4];
        double totalMarks = 0.0;

        // Input marks for four subjects
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        // Calculate average
        double average = totalMarks / 4;

        // Determine grade based on average
        String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Display results
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade: " + grade);

        // Close scanner
        scanner.close();
    }
}
