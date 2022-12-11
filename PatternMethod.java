import java.util.Scanner;
public class PatternMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter row");
		  int n=sc.nextInt();
		 
		for(int i=1;i<=6;i++)
	   {
		   for (int j=1; j<=i; j++) // triangle 
		   
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
	   //reverse
	   for(int i=n-1;i>=0;i--)
	   { 
		   for(int j=0; j<=i; j++)  //reverse  triangle method
		   {
			   System.out.print("*" + "");
		   }
		   System.out.println();
	   }

	}

}
