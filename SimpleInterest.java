import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		//declare variable 
		double principleAmount=0.0;
		double rate=0.0;
		double time=0.0;
		double interest=0.0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter peinciple amount");
		principleAmount=scan.nextDouble();
		System.out.print("Enter time(in months)");
		time=scan.nextDouble();
		System.out.print("Enter the interest rate(per year)");
		rate=scan.nextDouble();
		interest=(principleAmount*rate*time)/100;
		System.out.println("Simple interest=" +interest);
		System.out.println("Total amount to pay=" +(principleAmount+interest));
		scan.close();
		// TODO Auto-generated method stub

	}

}
