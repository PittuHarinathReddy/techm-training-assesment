package jan30assesments;

public class Last_letter {
	public static void main(String args[])
	{
		String org="experience3  is very importent";
		lstletter(org);
		
	}
	public static void lstletter(String test)
	{
		
		for(int i=0;i<test.length();i++)
		{
			if(i==test.length()-1)
			{
			System.out.print(test.charAt(i));
			return;
			}
			if(test.charAt(i+1)==' ')
			{
				if(test.charAt(i-1)!=' '&Character.isLetter(test.charAt(i)))
				{
				System.out.print(test.charAt(i));
				i++;
				}
			}
		}
		
		
	}

}
