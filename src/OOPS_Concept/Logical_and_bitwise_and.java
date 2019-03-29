package OOPS_Concept;

public class Logical_and_bitwise_and {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=20;
		System.out.println("Logical && Answer is="+(a<b && a<c));//false && true = false  
		System.out.println("Bitwise & Answer is= "+(a<b & a<c));//false & true = false
		
		//Java AND Operator Example: Logical && vs Bitwise &
		
		System.out.println((a<b) && (a++<c));//false && true = false  
		
		System.out.println(a);//10 because second condition is not checked 
		
		System.out.println((a<b) & (a++<c));//false && true = false
		
		System.out.println(a);//11 because second condition is checked  
		
		//Java OR Operator Example: Logical || and Bitwise |
		
//The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false.

//The bitwise | operator always checks both conditions whether first condition is true or false.

		
		System.out.println(a>b||a<c);//true || true = true  
		System.out.println(a<b|a>c);//False | false = False  
		//|| vs |  
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked  

		

	}

}
