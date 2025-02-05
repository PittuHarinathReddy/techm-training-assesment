package orgau;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception_task3 {
	public static void main(String args[])
	{
		try 
		{
			readfile("\"C:\\Users\\DELL\\OneDrive\\Documents\\iitkanpurcirtificate.txt\"");
		}
		catch(FileNotFoundException e)
		{
			System.out.print("file not found");
		}
	}
	public static void readfile(String filename) throws FileNotFoundException
	{
		File file=new File(filename);
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine())
		{
			System.out.print(sc.nextLine());
		}
		sc.close();
	}

}
