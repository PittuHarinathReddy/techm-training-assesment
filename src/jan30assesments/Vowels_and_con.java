package jan30assesments;

public class Vowels_and_con {
	public static void main(String args[])
	{
		String input="Harinath";
		input=input.toLowerCase();
		int v=0;
		int c=0;
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(Character.isLetter(ch))
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
		}
		System.out.println("no of vowels:"+v+" no of constants"+c);
	}

}
