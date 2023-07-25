import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		
		if (age >= 65) System.out.println("You are an adult and pensioner.");
		else if(age >= 18) System.out.println("You are an adult.");
		else if(age >= 0) System.out.println("You are an underage.");
		else System.out.println("You are not born yet or invalid input.");
		
	}
}
