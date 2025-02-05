package daily_tasks;

import java.util.Arrays;
import java.util.List;

public class t_task4_runner {
	public static void main(String grs[])
	{
		List<Integer> a= Arrays.asList(1,2,3,45,6,7,78,9,3);
		Template_task4 <Integer> t4=new Template_task4 <Integer> (a);
		List<Integer> result=t4.reverselist();
		System.out.println("Reversed list"+result);
		
	}

}
