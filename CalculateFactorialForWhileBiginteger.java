import java.math.BigInteger;

public class CalculateFactorialForWhileBiginteger {

	public static void main(String[] args) {
		
	//int num =10;
	//long factorial = 1;
	//for(int i= 1; i<= num; ++i)
	//int num = 30;
	//BigInteger factorial = BigInteger .ONE;
	//for(int i= 1; i<= num; ++i)
	
		int num = 30, i=1;
		long factorial = 1;
		while(i<=num)
	{
		//factorial *= i; 
		//factorial = factorial.multiply(BigInteger.valueOf(i)); 
		factorial *= i;
		i++;;
	}
	System.out.printf("factrorial of %d = %d" , num, factorial);
	
	}

}
