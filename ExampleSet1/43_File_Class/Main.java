import java.io.File;

public class Main {
	
	public static void main(String[] args) {
	
		File file = new File("file1.txt");
		
		if(file.exists()) {
			System.out.println("The file exist.");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile()); // returns true or false
			file.delete(); 	// deletes
		}
		else {
			System.out.println("The file does not exist.");
		}
	}
}
