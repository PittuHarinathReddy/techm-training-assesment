package orgau;

public class Altupper {
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("harinath");
		for(int i=0;i<str.length();i+=2)
		{
			char ch=str.charAt(i);
			str.setCharAt(i,Character.toUpperCase(ch));
		}
		
		System.out.println(str);
	}
		

}
