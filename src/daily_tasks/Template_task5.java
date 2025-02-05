package daily_tasks;

import java.util.ArrayList;
import java.util.List;

public class Template_task5<T> {
	List<T> l1,l2;
	List<T> merged=new ArrayList<T>();
	public Template_task5(List<T> o,List<T> p)
	{
		l1=o;
		l2=p;
	}
	public List<T> mergealtelelist()
	{
		int i=0,j=0;
		
		while(i<l1.size() || j<l2.size())
		{
			if(i<l1.size())
				merged.add(l1.get(i++));
			if(j<l2.size())
				merged.add(l2.get(j++));
				
		}
		
		return merged;
	}

}
