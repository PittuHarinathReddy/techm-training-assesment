package daily_tasks;

public class T_task1_runner {
	public static void main(String grs[])
	{
		Integer a[]= {10,20,30,40};
		Integer b[]= {10,20,30};
		Templete_task1 <Integer> t1=new Templete_task1 <Integer> (a,b);
		boolean eq=t1.checkarry();
		if(eq)
		{
			System.out.println("Arrays are eual");	
		}
		else
			System.out.println("arrays are not equal");
	}

}
