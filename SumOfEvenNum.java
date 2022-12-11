import java.util.Scanner;
public class SumOfEvenNum
{
     public static Scanner sc;
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);	 
		int number , i, evenSum=0;
		sc= new Scanner(System.in);
		
		System.out.print("Enter any nember :");
		number = sc.nextInt();
		
		for(i = 1; i<=number; i++)
		{
			if(i%2==0)
			{
				evenSum = evenSum +i;
			}
		}
        System.out.println("\n The sum of even numbers upto " + number+ "=" +evenSum);	

	}

}
