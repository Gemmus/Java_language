public class Main {
	
	public static void main(String[] args) {

		String name = "Klementine"; 
		
		boolean result = name.equals("Klementine"); 
		System.out.println(result);
		
		int len = name.length();
		System.out.println(len);
		
		char letter = name.charAt(6);
		System.out.println(letter);
		
		int index = name.indexOf("e");
		System.out.println(index);
		
		boolean empty = name.isEmpty(); 
		System.out.println(empty);
		
		String upper = name.toUpperCase();
		System.out.println(upper);
		
		String lower = name.toLowerCase();
		System.out.println(lower);
		
		String removeSpace = name.trim(); // removes all empty spaces added before and after
		System.out.println(removeSpace);
		
		String replace = name.replace('K', 'C');
		System.out.println(replace);
	}
}
