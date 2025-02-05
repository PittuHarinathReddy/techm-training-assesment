package daily_tasks;

public class Template_task2<T> {
	T[] ob;
	int e,o;
	public Template_task2(T[] o)
	{
		ob=o;
		
	}
	public int[] evenodd()
	{
		for(T num:ob)
		{
			int v=((int) num);
			if(v%2==0)
			{
				e+=v;
			}
			else
				o+=v;
		}
		return new int[]{e,o};
	}

}
