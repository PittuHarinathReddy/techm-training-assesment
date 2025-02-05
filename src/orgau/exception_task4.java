package orgau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception_task4 {
	public static void readFile(String fileName) throws PositiveException, FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
        	String line=sc.nextLine().trim();
        	int num = Integer.parseInt(line);
        	if(num>0) {
        		throw new PositiveException("Error: Positive number found - " + num);
        	}
        	else
            System.out.println(num);
        }
        sc.close();
    }
public static void main(String[] args) {
	try {
        readFile("C:/ECLIPSE/techM/src/Exception_Handling/file.txt");
    } catch (PositiveException e) {
        System.out.println("Error:File not found  " + e.getMessage());
    }
	catch(FileNotFoundException ex) {
		System.out.println(ex);
	}
}

}
