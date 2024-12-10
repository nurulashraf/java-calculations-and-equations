import java.util.Scanner;

public class SolveEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	// Get user input for the equations
        System.out.println("Enter values for x, y, and z: \n");

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.print("z: ");
        int z = scanner.nextInt();
		
	// Solve the equations
        int result1 = x + y * z;
        int result2 = (z * x) + y - 6;
		
	// Output the results
        System.out.println("\nResult of x + y(z): " + result1);
        System.out.println("Result of (z*x) + y - 6: " + result2);
    }
}
