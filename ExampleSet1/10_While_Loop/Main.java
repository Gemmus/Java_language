import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";		
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name + "!");
		
		// do loop:
		name = ""; 
		
		do {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello " + name + "!");
	}
}
