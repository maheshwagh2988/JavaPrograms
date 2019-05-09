package Exception_Handling;

import java.io.IOException;

public class Throws_Use {

	/** Throws keyword is used for handling checked exceptions . 
	 * Checked exception (compile time) force you to handle them
	 * suppose you have several  methods that can cause exceptions so try-catch need to write those times so we use throws
	 * Throws clause is used to declare an exception, which means it works similar to the try-catch block.
	 * On the other hand throw keyword is used to throw an exception explicitly.
	 * Throw keyword is used in the method body to throw an exception,
	 * while throws is used in method signature to declare the exceptions that can occur in the statements present in the method.
	 * You can throw one exception at a time but you can handle multiple exceptions by declaring them using throws keyword.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ 
		     ThrowExample obj=new ThrowExample(); 
		     obj.myMethod(1); 
		   }catch(Exception ex){
		     System.out.println(ex);
		    } 
		PersonAge age= new PersonAge();
		age.checkAge(15);
		System.out.println("End of Programs");
		
	 }

	}
	
	//Throws example
	class ThrowExample { 
		  void myMethod(int num)throws IOException, ClassNotFoundException{ 
		     if(num==1)
		        throw new IOException("IOException Occurred");
		     else
		        throw new ClassNotFoundException("ClassNotFoundException");
		  } 
		} 
	
	//Throw Example 
	 class PersonAge{  
		   void checkAge(int age){  
			if(age<18)  
			   throw new ArithmeticException("Not Eligible for voting");  
			else  
			   System.out.println("Eligible for voting");  
		   }
	 } 


