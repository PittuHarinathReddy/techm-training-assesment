package daily_tasks;
import java.util.Arrays;

public class Templete_task1 <T>{
	T[] ob,op;
	public Templete_task1(T[] o,T[] p)
	{
		ob=o;
		op=p;
	}
	public boolean checkarry()
	{
		return Arrays.equals(ob,op);
	}

}
