
public class VowelConsonant {
	public static void main(String[]args)
	{
		char ch='3';
		if((ch=='a' ||ch=='A')||(ch=='e' ||ch=='E')||(ch=='i' ||ch=='I')||(ch=='o' ||ch=='O')||(ch=='U' ||ch=='U'))
  System.out.println(ch+ "is vowel");
		
		else if((ch>=74)||(ch<=88))
			System.out.println(ch+ "is number");
		else
			System.out.println(ch+ "is consonent");
	}
}


//A=65 B=66 C=67
//a=97 b=98 c=99
//'5'