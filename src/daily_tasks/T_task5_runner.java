package daily_tasks;

import java.util.Arrays;
import java.util.List;

public class T_task5_runner {
	public static void main(String grs[])
	{
		List<Integer> a= Arrays.asList(1,3,5,7,9);
		List<Integer> b=Arrays.asList(2,4,6,8);
		Template_task5 <Integer> t5=new Template_task5 <Integer> (a,b);
		List<Integer> result=t5.mergealtelelist();
		
		System.out.println("merged list"+result);
		
		
	}

}
