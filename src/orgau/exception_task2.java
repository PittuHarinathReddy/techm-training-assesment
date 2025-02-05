package orgau;
import java.util.Scanner;

public class exception_task2 {
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		try
		{
			evennum(a);
		}catch(IllegalArgumentException e)
		{
			System.out.println("argument must be even");
		}
		
		
	}
	public static void evennum(int e)
	{
		if(e%2!=0)
		{
			throw new IllegalArgumentException("argument is odd");
		}
		System.out.println("number is even");
	}

}
