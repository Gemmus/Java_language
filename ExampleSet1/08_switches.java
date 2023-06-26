import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int day;
		System.out.println("Enter a day (1-7): ");
		day = scanner.nextInt();
		
		switch(day) {
		default: 
			System.out.println("Invalid input.");
			break;
		case 1:
			System.out.println("It's Monday.");
			break;
		case 2:
			System.out.println("It's Tuesday.");
			break;
		case 3:
			System.out.println("It's Wednesday.");
			break;
		case 4:
			System.out.println("It's Thursday.");
			break;
		case 5:
			System.out.println("It's Friday.");
			break;
		case 6:
			System.out.println("It's Saturday.");
			break;
		case 7:
			System.out.println("It's Sunday.");
			break;
		}	
	}
}
