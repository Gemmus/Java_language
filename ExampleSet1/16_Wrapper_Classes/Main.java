// Wrapper class:
// Provides a way to use primitive data types as reference data types.
// Reference data types contain useful methods.
// Can be used with collections (ex.ArrayList).

// Primitive   |   Wrapper
//----------------------------------
// boolean     |   Boolean
// char        |   Character
// int         |   Integer
// double      |   Double

// Autoboxing: the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
// Unboxing: the reverse of autoboxing. Automatic conversion of wrapper class to primitive.

public class Main {
	
	public static void main(String[] args) {

		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Lola";		
		
		if(a == true) System.out.println("'a' is true."); //unboxing feature, still can be treated as they were primitives
	}
}
