// ArrayList:
// Resizable array.
// Elements can be added and removed after compilation phase.
// Store reference data types.

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<String> food = new ArrayList<String>();
		
		food.add("katsu curry");
		food.add("ramen");
		food.add("miso soup");
		food.add("okonomiyaki");
		
		food.set(0, "mochi");
		food.remove(3);
		food.clear();
		
		for(int i = 0; i < food.size(); i++) System.out.println(food.get(i));
		
	}
}
