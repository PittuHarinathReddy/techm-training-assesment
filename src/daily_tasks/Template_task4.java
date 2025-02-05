package daily_tasks;

import java.util.Collections;
import java.util.List;

public class Template_task4 <T>{
	List<T> ob;
	public Template_task4(List<T> o)
	{
		ob=o;
	}
	public List<T> reverselist()
	{
		Collections.reverse(ob);
		return ob;
	}

}
