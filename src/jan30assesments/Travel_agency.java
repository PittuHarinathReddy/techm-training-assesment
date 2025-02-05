package jan30assesments;
import java.util.Scanner;

public class Travel_agency {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number agencies");
		int n=sc.nextInt();
		Travel_agencies arr[]=new Travel_agencies[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter regno");
			int regno=sc.nextInt();
			System.out.print("enter Agency name");
			String agencyname=sc.next();
			System.out.print("enter package type");
			String packagetype=sc.next();
			System.out.print("enter price");
			int price=sc.nextInt();
			System.out.print("enter flight facilty");
			boolean flightfacilty=sc.nextBoolean();
			arr[i] = new Travel_agencies(regno,agencyname,packagetype,price,flightfacilty);
			
		}
		System.out.print("Enter the registration number : ");
		int regNo = sc.nextInt();
		System.out.print("Enter the packagetype  : ");
		String packageType = sc.next();
		System.out.println(findagencywithhighestspackageprice(arr));
		Travel_agencies ans = agencydetailsforgivenidandtype(arr,regNo,packageType);
		if(ans == null)
			System.out.println("No object present");
		else 
			System.out.println(ans.agencyName+ " : "+ ans.price);
		
		
	}
	public static int findagencywithhighestspackageprice(Travel_agencies arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max,arr[i].price);
		}
		return max;
	}
	public static Travel_agencies agencydetailsforgivenidandtype(Travel_agencies arr[],int regno,String packagetype)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].regno==regno && arr[i].flightFacility==true && arr[i].packageType.equalsIgnoreCase(packagetype))
			{
				return arr[i];
			}
		}
		return null;
	}
	
	
	
	
	

}
class Travel_agencies
{
	int regno,price;
	String agencyName,packageType;
	boolean flightFacility;
	
	public Travel_agencies(int regno,String agencyName,String packageType,int price,boolean flightFacility)
	{
		this.regno = regno;
		this.agencyName = agencyName;
		this.packageType = packageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
	public int getregno()
	{
		return this.regno;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getAgencyName()
	{
		return this.agencyName;
	}
	public String getPackageType()
	{
		return this.packageType;
	}
	public boolean getFlightFacility()
	{
		return this.flightFacility;
	}
	public void setFlightFacility(boolean ff)
	{
		this.flightFacility = ff;
	}
	public void setPackageType(String pType)
	{
		this.packageType = pType;
	}
	public void setAgencyName(String agencyName)
	{
		this.agencyName = agencyName;
	}
	public void setRegNo(int regno)
	{
		this.regno = regno;
	}
}
