package orgau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_task5 {
	public static void check(String FileName) throws EmptyException{
		File file=new File(FileName);
		
		if(!file.exists() || file.length() == 0) {
			throw new EmptyException("File is Empty");
		}
		else {
			Scanner haha = null;
			try {
				haha = new Scanner(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			while (haha.hasNextLine()) {
	            System.out.println(haha.nextLine());
	        }
			haha.close();
		}
	}
	public static void main(String[] args) {
		try {
			check("C:/ECLIPSE/techM/src/Exception_Handling/fileEmpty.txt");
		}
		catch(EmptyException e) {
			System.out.println("Error Message: "+ e.getMessage());
		}
	}

}
