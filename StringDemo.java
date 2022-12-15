package Array;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "Aarya";
		String str2 = "Aarya";
		String str3 = "Welcome";
//		System.out.println(str1==str2);
//		System.out.println(str1==str3);
		
//		str1.concat("Chaurasiya");  //create new instance
//		System.out.println(str1);
		
//		System.out.println(str1.indexOf("ti,2"));
//		System.out.println(str1.lastIndexOf("S,4"));
//		System.out.println(str3.isEmpty());
//		System.out.println(str2.replace('t','p'));
//		System.out.println(str2.replace("was","is"));
//		System.out.println(str3.startsWith("wel"));
//		int i=10;
//		String s=String.valueOf(i);
//		System.out.println(s);

			
		
//		char c=str1.charAt(5);
//		System.out.println(c);
		
	//	String s = new String("Welcome");
	//	String s1 = new String("Welcome");
	//	System.out.println(s==s1);
		
//		StringBuilder builder=new StringBuilder("Welcome  ");
//		builder.append("java  ");
//		System.out.println(builder.capacity());
//		builder.append("is a plateform  language");
//		System.out.println(builder);
//		builder.insert(30,"independant");
//		System.out.println(builder);
 //       builder.replace(15, 17, "will");
  //      System.out.println(builder);
		
		 StringBuffer buffer=new StringBuffer("Welcome"); //synchronous
		 System.out.println(buffer + " "+buffer.capacity());
		 
	}

}
