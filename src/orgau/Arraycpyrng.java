package orgau;
import java.util.Arrays;

public class Arraycpyrng {
	public static void main(String args[])
	{
		int org[]= {10,20,0,40,50,60};
		int cpy[];
		cpy=Arrays.copyOfRange(org, 1, 5);
		for(int i=0;i<cpy.length;i++)
		System.out.println(cpy[i]);
	}

}
