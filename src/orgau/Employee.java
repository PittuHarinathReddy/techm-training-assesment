package orgau;
import java.util.Scanner;

public class Employee {	
		
			int empid;
			int exp;
			String empName= new String();
			double sal;
			
			void setEmployeeDetails(int empid,int exp,String empName,double sal)
			{
				this.empid=empid;
				this.empName=empName;
				this.sal=sal;
				this.exp=exp;
			}
			
			void getEmployeeDetails()
			{
				System.out.println("Employee id:"+empid);
				System.out.println("Employee Name:"+empName);
				System.out.println("Employee salary:"+sal);
				System.out.println("Employee experience:"+exp);
			}
			void getLoanEligibility() 
			{
				if(exp<5)
				{
					System.out.println("Your Experience should be more than 5 years");
					return;
				}
				double anualsal=sal*12;
				if (anualsal>=1500000)
				{
					System.out.println("Eligible for loan upto 7 lakhs");
					return;
				}
				else if(anualsal>=1000000)
				{
					System.out.println("Eligible for loan upto 5 lakhs");
					return;
				}
				else if(anualsal>=600000)
				{
					System.out.println("Eligible for loan upto 2 lakhs");
					return;
				}
			}
			
		
			public static void main(String args[])
			{
				Scanner sc =new Scanner(System.in);
				Employee emp=new Employee();
				
				System.out.print("enter employee id");
				int id= sc.nextInt();
				sc.nextLine();
				
				System.out.print("enter employee name");
				String name=sc.nextLine();
				
				System.out.print("enter employee salary");
				double salary=sc.nextDouble();
				
				System.out.print("enter employee experience");
				int experience=sc.nextInt();
				
				emp.setEmployeeDetails(id,experience,name,salary);
				emp.getEmployeeDetails();
				emp.getLoanEligibility();
				
			}
				
}
