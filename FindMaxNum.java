import java.util.Scanner;
public class FindMaxNum {

public static void main(String[] args) 
{
int num1 , num2 , num3, max;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three number");
num1 =sc.nextInt();     //200
num2 =sc.nextInt();     //165
num3 =sc.nextInt();     //155
		
if (num1>num2)
{
if(num1>num3)
{
max=num1;
}
else //integer else
{
 max=num3;
}
}
else  // integer else
{
 if(num2>num3)
 {
max=num2;
}
 else
 {
	 max=num2;
}
}
System.out.println("Maximum number among all three is" +max);

}
}
