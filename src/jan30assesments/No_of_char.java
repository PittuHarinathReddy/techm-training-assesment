package jan30assesments;

public class No_of_char {
	public static void main(String args[])
	{
		int c[]= {0,0};
		String org="experience3  is very importent";
		c=no_of_ch_wp(org);
		System.out.print("no of char "+c[1]);
		System.out.print(" no of whitespace "+c[0]);
		
		
		
	}
	public static int[] no_of_ch_wp(String test)
	{
		int ch[]= {0,0};
		
		for(int i=0;i<test.length();i++)
		{
			
			if(test.charAt(i)==' ')
				ch[0]+=1;
			else
				ch[1]+=1;
			
		}
		return ch;
		
		
	}

}
