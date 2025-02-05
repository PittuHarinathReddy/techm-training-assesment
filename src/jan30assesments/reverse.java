package jan30assesments;

public class reverse {
	public static void main(String args[])
	{
		int num=12345;
		int temp,res=0;
		while(num!=0)
		{
			temp=num%10;
			res=res*10+temp;
			num=num/10;
		}
		System.out.println(res);
	}

}
