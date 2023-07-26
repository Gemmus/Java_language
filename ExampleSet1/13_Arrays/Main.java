public class Main {
	
	public static void main(String[] args) {

		String[] cats = {"Fluffy", "Mirri", "Snowball"};
		
		for(int i = 0; i < cats.length; i++) System.out.println(cats[i]);
		
		cats[2] = "Jingles";
		System.out.println(cats[2]);

	}
}
