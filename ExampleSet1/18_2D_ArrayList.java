// 2D ArrayList:
// A dynamic list of lists.
// You can change the size of these lists during runtime.

import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<ArrayList<String>> JapaneseFoods= new ArrayList();		
		
		ArrayList<String> savoury = new ArrayList<String>();
		savoury.add("katsu curry");
		savoury.add("ramen");
		savoury.add("miso soup");
		savoury.add("okonomiyaki");
		//System.out.println(savoury);
		
		ArrayList<String> sweet = new ArrayList<String>();
		sweet.add("mochi");
		sweet.add("daifuku");
		sweet.add("dango");
		sweet.add("amanatto");
		//System.out.println(sweet);

		ArrayList<String> drink = new ArrayList<String>();
		drink.add("matcha");
		drink.add("sakura tea");
		//System.out.println(drink);
		
		JapaneseFoods.add(savoury);
		JapaneseFoods.add(sweet);
		JapaneseFoods.add(drink);
		System.out.println(JapaneseFoods);
		System.out.println(JapaneseFoods.get(0).get(3));
		
	}
}
