public class Main {
	
	public static void main(String[] args) {

		Hotel hotel = new Hotel();
		
		Pet cat1 = new Pet("Mirri");
		Pet cat2 = new Pet("Tapsa");
		
		hotel.checkin(cat1);
		hotel.checkout(cat2);
	}
}
