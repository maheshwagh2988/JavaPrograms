package oops_convept_part1_naveen;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";  //100 is String as it has in Double quote 
		System.out.println("Before Convert String into Wrapper class: " + x+20); //We need to Add 100+20= 120 but it will display 10020 it Concat the string and given O/P
		//To Overcome this we need to convert String to Integer 
		//Wrapper Class Introduce 
		//Data Conversion for String to Integer
		Integer.parseInt(x);  // We can Directly wrote here but it just Understanding
		int y=Integer.parseInt(x);////Store this in One Integer Variable y
		System.out.println("After Convert String to Integer using Wrapper class: "+(y+20));//Here y=100 as we convert into Integer
		
		//Integer,Double,Character,Boolean This are Wrapper Classes
		
		String a="12.33";
		double b=Double.parseDouble(a);
		System.out.println(b+10.02);
		
		String k="true";
		boolean c=Boolean.parseBoolean(k);
		System.out.println(c);
		
		//Interger to  String Conversion
		int p=200;
		System.out.println(p+20);
		String s =String.valueOf(p);
		System.out.println(s+20);  //O/p Should be 20020 as it is String 
		
		 String q="100A";
		 Integer.parseInt(q);
		
		
		

	}

}
