package jan30assesments;

public class Uniquechar {
	public static void main(String args[])
	{
		String org="experience";
		unqchr(org);
		
	}
	public static void unqchr(String test)
	{
		String temp = "";
		for(int i=0;i<test.length();i++)
		{
			if(temp.indexOf(test.charAt(i))==-1)
			{
				temp=temp+test.charAt(i);
			}
		}
		System.out.println(temp);
		
	}

}
