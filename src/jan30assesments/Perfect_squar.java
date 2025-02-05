package jan30assesments;
import java.util.Scanner;

public class Perfect_squar {
	 public static boolean isPftsqr(int num) {
	        if (num < 0) return false;
	        
	        int sqrt = (int) Math.sqrt(num);
	        return sqrt * sqrt == num;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (isPftsqr(number)) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is NOT a perfect square.");
	        }
	        
	    }
	

}
