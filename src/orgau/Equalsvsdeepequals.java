package orgau;
import java.util.Arrays;
public class Equalsvsdeepequals {
	public static void main(String args[])
	{
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3)); 

        Integer[] objArr1 = {1, 2, 3};
        Integer[] objArr2 = {1, 2, 3};
        System.out.println(Arrays.equals(objArr1, objArr2));

        Integer[][] nestedArr1 = {{1, 2}, {3, 4}};
        Integer[][] nestedArr2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.equals(nestedArr1, nestedArr2));
       
        System.out.println(Arrays.deepEquals(objArr1, objArr2)); 

        System.out.println(Arrays.deepEquals(nestedArr1, nestedArr2));
	}

}
