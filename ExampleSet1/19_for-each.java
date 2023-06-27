// For-each:
// Traversing technique to iterate through the elements in an array/collection.
// Less steps, more readable.
// Less flexible.

import java.util.ArrayList; 

public class Main {
	
	public static void main(String[] args) {

		//String[] animals = {"cat", "dog", "parrot", "mouse"};
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("parrot");
		animals.add("mouse");
		
		for(String animal : animals) System.out.println(animal);
		
	}
}
