// toString():
// - special method that all objects inherit that returns a string that "textually represents" an object
// - can be used both implicitly and explicitly

public class Main {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		//Explicitly: 
		System.out.println(cat.toString());
		
		System.out.println();
		
		//Implicitly:
		System.out.println(cat);
	}
}
