public class Main {
	
	public static void main(String[] args) {
		
		double x = 3.14;
		double y = 5.38;
		
		double a = Math.max(x, y); 
		System.out.println("Max: " + a);
		
		double b = Math.min(x, y);
		System.out.println("Min: " + b);
		
		double c = Math.abs(x);
		System.out.println("Absolute of x: " + c);
		
		double d = Math.sqrt(x);
		System.out.println("Squareroot of x: " + d);
		
		double e = Math.round(y);
		System.out.println("Rounded y: " + e);
		
		double f = Math.ceil(x);
		System.out.println("Ceiling: " + f);
		
		double g = Math.floor(y);
		System.out.println("Floor of: " + g);
	}
}
