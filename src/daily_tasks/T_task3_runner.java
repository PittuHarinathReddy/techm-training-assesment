package daily_tasks;

import java.util.Arrays;
import java.util.List;

public class T_task3_runner {
	public static void main(String grs[])
	{
		List<Integer> a= Arrays.asList(1,2,3,45,6,7,78,9,3);
		Integer t=45;
		Template_task3 <Integer> t3=new Template_task3 <Integer> (a,t);
		int result=t3.findtarget();
		System.out.println("index of target variable"+result);
		
	}

}
