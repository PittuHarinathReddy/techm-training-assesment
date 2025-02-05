package jan30assesments;
import java.util.Scanner;

public class smallest_vowel {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String str=sc.nextLine();
		char sml_vowel=small_v(str);
		if(sml_vowel!='\0')
			System.out.println(sml_vowel);
		else
			System.out.println("no vowels found");
		
	}
	public static char small_v(String string)
	{
		char smallv='\0';
		for(char ch : string.toLowerCase().toCharArray())
		{
			if("aeiou".indexOf(ch)!=-1)
			{
				if(smallv=='\0' || ch<smallv)
					smallv=ch;
			}
		}
		return smallv;
	}

}
