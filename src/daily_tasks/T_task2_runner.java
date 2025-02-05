package daily_tasks;

public class T_task2_runner {
	public static void main(String grs[])
	{
		Integer a[]= {1,2,3,45,6,7,78,9,3};
		Template_task2 <Integer> t2=new Template_task2 <Integer> (a);
		int result[]=t2.evenodd();
		System.out.println("sum of even numbers are"+result[0]);
		System.out.println("sum of odd numbers are"+result[1]);
		
	}


}
