import java.io.File;
import java.io.IOException;


public class CreateFilesAndFoldersInJava {
	// create folder (default path = src folder)
	public static void createFolder(String folderName){
		File folder = new File("src/" + folderName);
		folder.mkdir();
	}
	// create file (default path = src folder)
	public static void  createFile(String filename,String Content) throws IOException{
		File file = new File("src/" + filename);
		file.createNewFile();
	}
	public static void main(String[] args) {
		createFolder("no name");
		
	}
}
