// Overloaded Constructors:
// - multiple constructors within a class with the same name
// - but have different parameters
// - name + parameters = signature

public class Main {
	
	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("mozzarella");
		Pizza pizza2 = new Pizza("mushroom", "salame piccante");
		Pizza pizza3 = new Pizza("tuna", "capers", "red onions");
		Pizza pizza4 = new Pizza("prosciutto cotto ham", "artichoke", "mushroom", "black olive");
	}
}
