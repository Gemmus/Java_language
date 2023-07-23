// Method overriding:
// Declaring a method in sub-class, which is already present in parent class.
// Done so that a child class can give its own implementation.

public class Main {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.speak();
		
		Cat cat = new Cat();
		cat.speak();
	}
}
