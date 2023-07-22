public class Pizza {
	
	String topping1;
	String topping2;
	String topping3;
	String topping4;
	
	Pizza(String topping1) {
		this.topping1 = topping1;
		System.out.println("Pizza with: " + this.topping1 + " is ready.");
	}
	
	Pizza(String topping1, String topping2) {
		this.topping1 = topping1;
		this.topping2 = topping2;
		System.out.println("Pizza with: " + this.topping1 + ", " + this.topping2 + " is ready.");
	}

	Pizza(String topping1, String topping2, String topping3) {
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.topping3 = topping3;
		System.out.println("Pizza with: " + this.topping1 + ", " + this.topping2 + ", " + this.topping3 + " is ready.");
	}
	
	Pizza(String topping1, String topping2, String topping3, String topping4) {
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.topping3 = topping3;
		this.topping4 = topping4;
		System.out.println("Pizza with: " + this.topping1 + ", " + this.topping2 + ", " + this.topping3 + ", " + this.topping4 + " is ready.");
	}
}