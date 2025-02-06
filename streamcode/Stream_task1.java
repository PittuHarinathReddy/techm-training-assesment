package streamcode;

import java.util.ArrayList;


public class Stream_task1 {
	public static void main(String args[])
	{
			ArrayList<Integer>al = new ArrayList<Integer>();
			al.add(100);
			al.add(101);
			al.add(102);
			al.add(103);
			al.add(104);
			al.add(105);
			System.out.println("printing collection"+al);
			System.out.println();
			double ls = al.stream().mapToInt(Integer :: intValue ).average().orElse(0.0);
			System.out.println(""+ls);
	}

}
