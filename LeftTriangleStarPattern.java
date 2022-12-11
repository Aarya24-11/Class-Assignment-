import java.util.Scanner;
public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		int i,j,k; 
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter row");
		  int n=sc.nextInt();
		  
		for(i=1;i<=n;i++)//row
	   {
		   for (j=n; j>i; j--) // space 
		   
		   {
			   System.out.print(" ");
		   }
		   for(k=1;k<=i;k++)//star
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }

	}

}
