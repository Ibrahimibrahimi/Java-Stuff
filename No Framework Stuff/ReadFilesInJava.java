import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFilesInJava {
	public static void main(String[] args) {
		String filePath = "eee.txt";
		// create reader object instance
		try {
			BufferedReader BufferReader = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
