package Exception_Handling;

public class ExceptionHandaling {

	int a=10;
	public static void main(String[] args) {
//An Exception is an unwanted event that interrupts the normal flow of the program. 
//When an exception occurs program execution gets terminated.
//Exception handling ensures that the flow of the program doesn’t break when an exception occurs
//Exceptions are events that occurs in the code. A programmer can handle such conditions and take necessary corrective actions
//ArithmeticException – When bad data is provided by user, for example
//when you try to divide a number by zero this exception occurs because dividing a number by zero is undefined.		
//ArrayIndexOutOfBoundsException – When you try to access the elements of an array out of its bounds, array size is 5 and you access 7	
		
//There are two types of exceptions in Java:
//	1)Checked exceptions
//Checked exceptions are checked at compile-time
//it should handle the exception using try-catch block or
//it should declare the exception using throws keyword, otherwise the program will give a compilation error.		
//All exceptions other than Runtime Exceptions are known as Checked exceptions as the 
//compiler checks them during compilation to see whether the programmer has handled them or not.
//SQLException, IOException, ClassNotFoundException etc.
		
//	2)Unchecked exceptions		
//Runtime Exceptions are also known as Unchecked Exceptions.
//These exceptions are not checked at compile-time so compiler does not check whether the programmer has
//handled them or not but it’s the responsibility of the programmer to handle these exceptions
//ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.		
		
//Divide by zero is called uncaught exception 	ArithmeticException: 
//Any Number can't be divide by zero so it given ArithmeticException: 	
//Object->Throwable->it has tow class 
//1. Error
//2. Exception
		
//		int i=9/0;
//		System.out.println(i);
		
		
		//Cought exception
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		ExceptionHandaling obj= new ExceptionHandaling();
		obj= null;
		System.out.println(obj.a);
		
		
		

	}

}
