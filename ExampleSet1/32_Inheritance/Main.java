public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car();

		Bicycle bicycle = new Bicycle();
		bicycle.stop();
		System.out.println(bicycle.speed);
		
		System.out.println(bicycle.pedals);
		System.out.println(car.doors);
	}
}
