import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
	
		try {
			FileReader file = new FileReader("file1.txt");
			int data = file.read();
			while(data != -1) {
				System.out.print((char) data);
				data = file.read();
			}
			file.close();
		} 
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
