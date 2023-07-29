import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
	
		try {
			FileWriter newFile = new FileWriter("file1.txt");
			newFile.write("Tapsa is snoring \nand dreaming.");
			newFile.append("\n29/07/2023");
			newFile.close();
		} 
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
