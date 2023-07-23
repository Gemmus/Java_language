// Static: modifier.
// A single copy of a variable/method is created and shared. 
// The class "owns" the static member.

public class Main {
	
	public static void main(String[] args) {

		Friends friend1 = new Friends("Andy");
		Friends friend2 = new Friends("Gary");
		Friends friend3 = new Friends("Mary");
		//System.out.println(Friends.numberofFriends);
		Friends.displayFriends();
		
		Friends friend4 = new Friends("Terry");
		Friends.displayFriends();
	}
}
