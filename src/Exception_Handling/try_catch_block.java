package Exception_Handling;

public class try_catch_block {

	public static void main(String[] args) {
		int num1, num2 ;
		try{
			
			 /* We suspect that this block of statement can throw 
	          * exception so we handled it by placing these statements
	          * inside try and handled the exception in catch block
	          */
			
			num1=0;
			num2=5/num1;
			System.out.println(num2);
	        System.out.println("Hey I'm at the end of try block");
			
		}catch(ArithmeticException e){
			/* This block will only execute if any Arithmetic exception 
	          * occurs in try block
	          */
			System.out.println("You should not divide a number by zero");
		}
				
	}

}
