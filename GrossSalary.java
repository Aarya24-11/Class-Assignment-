import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
		 float basicsalary , da ,hra ,da1 , hra1 , GrossPayment;
		System.out.println("Enter basic Salary of Employee");
		basicsalary=sc.nextFloat();
		
		System.out.println("Enter basic DA of Employee");
		da1=sc.nextFloat();
		
		System.out.println("Enter basic HRA of Employee");
		hra1=sc.nextFloat();
		
		da=(da1*basicsalary)/100;
		hra=(hra1*basicsalary)/100;
		GrossPayment=basicsalary + da + hra ;
		
		System.out.println("Gross Salary of Employee is" +GrossPayment);
		
	}

}
