package orgau;
import java.util.Scanner;

public class excetion_task1 {
	public static void main(String args[])
	{
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		try
		{
			int c= a/b;
			System.out.println("result"+c);
		}catch (ArithmeticException e)
		{
			System.out.println("denominator cannot be zero");
		}
		sc.close();
		
	}

}
