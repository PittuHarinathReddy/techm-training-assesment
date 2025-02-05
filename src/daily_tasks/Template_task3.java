package daily_tasks;
import java.util.*;

public class Template_task3<T> {
	List<T> ob;
	T target;
	public Template_task3(List<T> o,T target)
	{
		ob=o;
		this.target=target;
		
	}
	public int findtarget()
	{
		return ob.indexOf(target);
	}

}
