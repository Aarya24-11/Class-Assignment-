/**
 * java program to calculate total , average and percentage of five subjects
 */
import java.util.Scanner;
public class testTotal {

	public static void main(String[] args) {
		float eng, phy, math, comp, hindi;
		double total, average, percentage;
		Scanner op=new Scanner(System.in);
		System.out.println("Enter marks of five subject");
		System.out.print("Enter marks of english subject");
		eng=op.nextFloat();
		System.out.print("Enter marks of physics subject");
		phy=op.nextFloat();
		System.out.print("Enter marks of maths subject");
		math=op.nextFloat();
		System.out.print("Enter marks of computer subject");
		comp=op.nextFloat();
		System.out.print("Enter marks of hindi subject");
		hindi=op.nextFloat();
		
		/* Calculate total, average and percentage */
		total = eng + phy + math + comp + hindi;
		average= (total/5.0);
		percentage= (total/500.0)*100;
		/*Print all results*/
		System.out.println("Total marks=" +total);
		System.out.println("Average marks=" + average);
		System.out.println("Percentage=" +percentage);
		// TODO Auto-generated method stub

	}

}
