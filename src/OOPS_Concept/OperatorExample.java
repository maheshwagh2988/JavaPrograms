package OOPS_Concept;

public class OperatorExample {

	public static void main(String[] args) {
		int x=10;
		int y=5;
		System.out.println("Postfix addition "+(x++));
		System.out.println("Prefix addition "+(++x));
		System.out.println("Postfix Subtraction "+(x--));
		System.out.println("Prefix Subtraction"+(--x));
		//
		System.out.println("Addition of two number is "+(x+y));//15  
		System.out.println("Subtraction of two bumber is "+(x-y));//5  
		System.out.println("Multiplication of two number is"+ (x*y));//50  
		System.out.println("Division of two number is "+(x/y));//2  
		System.out.println("Mod of two number is "+(x%y));//0  

	}

}
