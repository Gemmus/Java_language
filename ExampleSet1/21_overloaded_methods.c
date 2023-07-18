public class Main {
	
	public static void main(String[] args) {

		int a = 23, b = 35, c = 16, d = 57;
		int e = add(a, c);
		System.out.println(a + "+" + c + "=" + e);
		int f = add(a, b, c, d);
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + f);
		int g = add(b, d, a);
		System.out.println(b + "+" + d + "+" + a + "=" + g);
		
		double h = 4.56, i = 7.12, j = 19.45;
		double k = add(h, i, j);
		System.out.println(h + "+" + i + "+" + j + "=" + k);
	}
	
	static int add(int a, int b) {
		System.out.println("This is overload method #1:");
		return a + b;	
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overload method #2:");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overload method #3:");
		return a + b + c + d;	
	}
	
	static double add(double a, double b) {
		System.out.println("This is overload method #4:");
		return a + b;	
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is overload method #5:");
		return a + b + c;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overload method #6:");
		return a + b + c + d;	
	}
}
