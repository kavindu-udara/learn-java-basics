package fileClass;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("src/secret_document.txt");
//		File file = new File("secret_document.txt");
		if(file.exists()) {
			System.out.println("That file exists !");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}else {
			System.out.println("That file doesn't exist :(");
		}
	}

}
