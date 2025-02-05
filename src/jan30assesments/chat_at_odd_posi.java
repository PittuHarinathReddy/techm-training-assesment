package jan30assesments;

public class chat_at_odd_posi {
	public static void main(String args[])
	{
		String org="rornova";
		for(int i=1;i<org.length();i+=2)
		{
			System.out.print(org.charAt(i));
		}
	}

}
