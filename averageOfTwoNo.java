import java.util.Scanner;
public class averageOfTwoNo {

	public static void main(String[] args) {
		
		//creat scanner class object
	Scanner scan=new Scanner(System.in);
	
	//declare two numbers
	double num1=1;
	double num2=1;
	
	//declare sum variable 
	//and initilize with 1
	double sum=1.0;
	
	//declare average variable
	double avg=1.0;
	
	 // take two numbers 
	System.out.print("Enter two number");
	num1=scan.nextDouble();
	num2=scan.nextDouble();
	
	// calculate the sum value
	sum=num1+num2;
	
	//calculate the average value
	avg=sum/2;
	
	//display result
	System.out.println("average" +avg);
	System.out.println("sum of two num" + sum);
		}

}
