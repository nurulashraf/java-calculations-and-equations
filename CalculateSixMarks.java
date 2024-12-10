import java.util.Scanner;

public class CalculateSixMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for 6 marks
        System.out.println("Enter 6 marks: \n");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        int mark4 = scanner.nextInt();
        int mark5 = scanner.nextInt();
        int mark6 = scanner.nextInt();

        // Calculate total marks
        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;

        // Calculate average marks
        double averageMarks = (double) totalMarks / 6;

        // Output results
        System.out.println("\nTotal marks: " + totalMarks);
        System.out.println("Average marks: " + averageMarks);
    }
}