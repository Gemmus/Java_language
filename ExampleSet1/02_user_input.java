import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		
		System.out.println("How old are you, " + name + "?");
		int age = scanner.nextInt(); 
		scanner.nextLine(); // When the age is put in, a \n is added automatically which causes the skip the scan of the next question. This line it to prevents that.
		System.out.println("What is your favorite food, " + name + "?");
		String food = scanner.nextLine();
		System.out.println(name + " is " + age + " years old and loves " + food + ".");
	
	}
}
