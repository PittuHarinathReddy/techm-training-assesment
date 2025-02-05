package orgau;

public class Arraycopymed {
	public static void main(String args[])
	{
		int arr1[]= {10,20,30,40,50};
		int n=(arr1.length+1)/2;
		int arr2[]= new int[n];
		
		for(int i=0,j=0;i<arr1.length;i+=2,j++)
		{
			System.arraycopy(arr1, i, arr2,j,1);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
	}
	

}
