package fileWrite;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("src/poem.txt");
			writer.write("Roses are red \nViolets are blue \n booty booty booty booty \nRockin' everywhere!");
			writer.append("\n(A poem by me)");
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
