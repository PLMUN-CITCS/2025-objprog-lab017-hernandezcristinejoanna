import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        // Create a Scanner object once and use it throughout the program
        Scanner scanner = new Scanner(System.in);

        // Get the student's score
        double score = getStudentScore(scanner);

        // Calculate the grade
        String grade = calculateGrade(score);

        // Display the result
        System.out.println("Your grade is: " + grade);

        // Close the scanner after all input is done
        scanner.close();
    }

    // Method to get the student's score
    public static double getStudentScore(Scanner scanner) {
        double score;

        // Prompt user for input and validate
        while (true) {
            try {
                System.out.print("Enter your score: ");
                score = Double.parseDouble(scanner.nextLine());

                // Check if score is within a valid range
                if (score >= 0 && score <= 100) {
                    break;
                } else {
                    System.out.println("Invalid score! Please enter a number between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        return score;
    }

    // Method to calculate the grade based on the score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
