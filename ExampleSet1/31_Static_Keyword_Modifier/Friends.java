public class Friends {
	
	String name;
	static int numberofFriends;
	
	Friends(String name){
		this.name = name;
		numberofFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have " + numberofFriends + " friends.");
	}
}