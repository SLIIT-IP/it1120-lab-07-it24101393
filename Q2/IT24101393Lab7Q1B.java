import java.util.Scanner;

public class IT24101393Lab7Q1B{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for three students
        for (int student = 1; student <= 3; student++) {
            System.out.print("Enter marks for 4 subjects for Student " + student + " (separated by spaces): ");
            String input = scanner.nextLine();
            String[] marksInput = input.split(" ");

            // Array to store marks
            double[] marks = new double[4];
            double totalMarks = 0.0;

            // Convert input to double and calculate total marks
            for (int i = 0; i < 4; i++) {
                marks[i] = Double.parseDouble(marksInput[i]);
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

            // Display results for the student
            System.out.printf("Student %d - Average Marks: %.2f, Grade: %s%n", student, average, grade);
        }

        // Close scanner
        scanner.close();
    }
}
