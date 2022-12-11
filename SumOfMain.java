import java.util.Scanner; 
public class SumOfMain {

	public static void main(String[] args) {
	     float sub1, sub2, sub3, sub4, sub5;
	     Scanner in=new Scanner(System.in);
		 System.out.println("enter the marks of five subjects::\n");
		 //To store the values of subjects
		 float sub_1 = in.nextFloat();
		 float sub_2 = in.nextFloat();
		 float sub_3 = in.nextFloat();
		 float sub_4 = in.nextFloat();
		 float sub_5 = in.nextFloat();
		 
		 float total;
		 float average;
		 float percentage;
		char grade;
		
		 //Calculate total, average and percentage
		
		 total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
		  average = (float)(total/5.0);	
		  percentage = (float)((total/500.0)*100);
		  //It will calucate the grade
		  
		  if (average >= 90)
			  grade = 'A';
		  else if (average >= 80 && average < 90)
			  grade = 'B';
		  else if (average >= 70 && average < 80)
			  grade = 'C';
		  else if (average >= 60 && average < 70)
			  grade = 'D';
		  else  
			  grade = 'E';
		  
		  // It will produce the final output 
		  
		  System.out.println("\n the total marks =" + total +"/500.0");
		  System.out.println("the average marks =" + average);
		  System.out.println("the percentage=" + percentage + "%");
		  System.out.println("the grade ='" + grade +"'");
		

	}

}
