import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();

			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
		
			int z = x / y;
			System.out.println("The result is: " + z);
		}
		
		catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero.");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Invalid input, please enter number.");
		}
		
		catch(Exception e) {
			System.out.println("Something went wrong.");
		}
		
		finally {
			System.out.println("This will always be executed.");
			// Used to close scanner or close files.
			scanner.close();
		}
	}
}
