import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";		
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		
		for(int i = 0; i < 5; i++) System.out.println("Happy Birthday " + name + "!");
		
	}
}
