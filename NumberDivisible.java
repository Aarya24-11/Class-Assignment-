import java.util.Scanner;
public class NumberDivisible {
    private static Scanner sc;
	public static void main(String[] args) {
		int number;
	    sc=new Scanner(System.in);
	    
		System.out.print("Please Enter any number to check whether it is divisible by 5 and 11");
		number=sc.nextInt();
		
		if((number % 5==0)&&( number % 11==0))
		{
			System.out.println("/n Given number" + number +"is divisible by 5 and 11");
		}
		else
		{
			System.out.println("/n Given number" + number +"is not divisible by 5 and 11");
		}
			

	}

}
