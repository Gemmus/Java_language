//   Primitive:   		    		|     Reference:
//    8 bytes					        |      unlimited
//    stores data				      |      stores address
//    can only hold 1 value		|      could hold more than 1 value
//    less memory			      	|      more memory
//    fast						        |      slower

public class Main {
	
	public static void main(String[] args) {
		
		// Byte: -128 to 127, primitive.
		byte b = -128;
		// Short: 2 bytes, -32768 to 32767, primitive.
		short u = -56;
		// Integer: 4 bytes, -2 billion to 2 billion, primitive.
		int x = 123;
		// Long: 8 bytes, -9 quintillion to 9 quintillion, primitive.
		long y = 1256584654565865898L;
		
		// Float: 4 bytes, fractional number up to 6-7 digits, primitive.
		float v = 3.141592f;
		// Double: fractional number up to 15 digits, primitive.
		double w = 3.141592653589793;
		
		// Boolean: 1 bit, true or false, primitive.
		boolean z = true; 
		
		// Char: single character/letter/ASCII value, primitive.
		char symbol = '@';
		// String: a sequence of characters, reference.
		String name = "Nikta";
		
		System.out.println("Hello " + name + "!");
	}	
}
