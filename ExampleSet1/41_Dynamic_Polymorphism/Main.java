// Dynamic polymorphism:
// - dynamic: after compilation (during runtime)

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("Dog, enter: 1 or Cat, enter: 2.");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			animal.speak();
		}
	}
}
