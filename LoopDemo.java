import java.util.Scanner;
public class LoopDemo {

	public static void main(String[] args) 
	{
		int i , n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		n=sc.nextInt();
		
		for(i=1;i<=n;++i);
		{
			sum=sum+i;//sum+=i;
		}
		System.out.println("Sum of natural number from 1 to "+n+" is:"+sum);
		sc.close(); 
	}

}
