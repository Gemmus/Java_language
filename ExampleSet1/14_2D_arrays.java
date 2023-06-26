public class Main {
	
	public static void main(String[] args) {

		String[][] petHotel = {{"Fluffy", "cat", "black"}, 
				       {"Barker", "dog", "spotted"},
				       {"Snowball", "cat", "white"}};
		
		// or:
		/*
		String[][] petHotel = new String[3][3]
		petHotel[0][0] = "Fluffy";
		petHotel[0][1] = "cat";
		petHotel[0][2] = "black";
		petHotel[1][0] = "Barker";
		petHotel[1][1] = "dog";
		petHotel[1][2] = "spotted";
		petHotel[2][0] = "Snowball";
		petHotel[2][1] = "cat";
		petHotel[2][2] = "white";
		 */

		for(int i = 0; i < petHotel.length; i++) {
			System.out.println();
			for(int j = 0; j < petHotel[i].length; j++) {
				System.out.print(petHotel[i][j] + ", ");
			}
		}
	}
}
