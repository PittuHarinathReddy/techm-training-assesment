package streamcode;

import java.util.ArrayList;

public class Stream_task3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<Integer>al = new ArrayList<Integer>();
			al.add(100);
			al.add(101);
			al.add(102);
			al.add(103);
			al.add(104);
			al.add(105);
			System.out.println("printing collection"+al);
			System.out.println();
			int e = al.stream().mapToInt(Integer :: intValue).max().orElseGet(null);
			int o = al.stream().mapToInt(Integer :: intValue).min().orElseGet(null);
			System.out.println("max "+e+" min "+o);
		

	}

}
