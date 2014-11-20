/*Define an Employee class and take the details of the ID,name,Salary,Date of Birth, Date of Joining.
And Raise an Exception if the employee's date of joining is before the Date of Birth and If the date of joining is not less than 22 years from Date of birth*/
import java.util.*;
class AgeLessException extends Exception
{
	public AgeLessException(String s)
	{
		System.out.println(s);
	}
}
class AgeMoreException extends Exception
{
	public AgeMoreException(String s)
	{
		System.out.println(s);
	}
}
class Employee 
{
int eage;
String ename;
int esal;
int DOB_date;
int DOB_month;
int DOB_year;
int YOJ_date;
int YOJ_month;
int YOJ_year;
Employee(int age,String name,int sal,int DOB_date1,int DOB_month1,int DOB_year1,int YOJ_date1, int YOJ_month1,int YOJ_year1)
{
	eage =age;
	ename= name;
	esal = sal;
	DOB_date = DOB_date1; 
	DOB_month = DOB_month1;	
	DOB_year = DOB_year1;
	YOJ_date = YOJ_date1;
	YOJ_month = YOJ_month1;
	YOJ_year = YOJ_year1;
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	sc.nextLine();
	String name = sc.nextLine();
	int sal = sc.nextInt();
	int DOB_date1 = sc.nextInt();
	int DOB_month1= sc.nextInt();
	int DOB_year1= sc.nextInt();
	int YOJ_date1=sc.nextInt();
	int YOJ_month1 = sc.nextInt();
	int YOJ_year1 = sc.nextInt();
	Employee e1 = new Employee(id,name,sal,DOB_date1,DOB_month1,DOB_year1,YOJ_date1,YOJ_month1,YOJ_year1);
	try{
		if(YOJ_year1<DOB_year1)
		{
			throw new AgeLessException("Employee's Joining Date is earlier than the Date of Birth. Please check what you've entered!");				
		}
	
		}
	catch(AgeLessException ale)
	{
		
	}
	try {
		if ((YOJ_year1 == DOB_year1)&&(YOJ_month1 < DOB_month1))
		{
			throw new AgeLessException("Employee's Joining Date is earlier than the Date of Birth. Please check what you've entered!");			
		}
		}
	catch(AgeLessException ale)
	{
		
	} 
	try {
		if ((YOJ_year1 == DOB_year1)&&(YOJ_month1 == DOB_month1)&&(YOJ_date1<DOB_date1))
		{
			throw new AgeLessException("Employee's Joining Date is earlier than the Date of Birth. Please check what you've entered!");			
		}
		}
	catch(AgeLessException ale)
	{
		
	} 
	try{
		if (YOJ_year1-DOB_year1 < 22)
		{
			throw new AgeMoreException("Employee shouldn't be less than 22 years of age.");
		}
		}
	catch(AgeMoreException ame)
	{
	}	
}
}
