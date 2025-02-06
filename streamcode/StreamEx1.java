package streamcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {

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
			List<Integer> ls = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
			System.out.println("even collection"+ls);
		

	}

}
