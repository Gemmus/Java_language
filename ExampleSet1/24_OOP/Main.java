public class Main {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		System.out.println("Name: " + cat1.name + ", color: " + cat1.color + ".");
		cat1.hungry();
		cat1.sleep();
	}
}
