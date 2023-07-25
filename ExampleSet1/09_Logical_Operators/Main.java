import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature: ");
		double temp = scanner.nextDouble();
		
		System.out.println("Is it sunny (y/n)? ");
		String sun = scanner.next();
		
		boolean sunny;
		if(sun.equals("y") || sun.equals("Y")) sunny = true;
		else sunny = false;
		
		if((temp >= 25) && (sunny)) System.out.println("It's warm and sunny outside.");
		else if((temp >= 25) || (sunny)) System.out.println("It's warm or sunny outside.");
		else if((!sunny) && (temp < 10)) System.out.println("It's not a nice weather.");
		
	}
}
