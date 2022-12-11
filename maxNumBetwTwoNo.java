import java.util.Scanner;
public class maxNumBetwTwoNo {

	public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  int num1;
	  int num2;
	  int num3;
	  System.out.print("Input first integer");
	  num1=input.nextInt();
	  System.out.print("Input second integer");
	  num2=input.nextInt();
	  System.out.print("Input third integer");
	  num3=input.nextInt();
	  
	  if(num1==num2);
	  System.out.printf("%d==%d\n" , num1 , num2 , num3);
	  if(num1==num3);
	  System.out.printf("%d==%d\n" , num1 , num2 , num3);
	  if(num1!=num2);
	  System.out.printf("%d!=%d\n" , num1 , num2 , num3);
	  if(num1<num2);
	  System.out.printf("%d<%d\n" , num1 , num2 , num3);
	  if(num1>num2);
	  System.out.printf("%d>%d\n" , num1 , num2 , num3);
	  if(num1<=num2);
	  System.out.printf("%d<=%d\n" , num1 , num2 , num3);
	  if(num1>=num2);
	  System.out.printf("%d>=%d\n" , num1 , num2 , num3);
		// TODO Auto-generated method stub

	}

}
