package Exception_Handling;

public class Unchecked_exceptions {

//	2)Unchecked exceptions		
//Runtime Exceptions are also known as Unchecked Exceptions.
//These exceptions are not checked at compile-time so compiler does not check whether the programmer has
//handled them or not but it’s the responsibility of the programmer to handle these exceptions
//ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int num1=0;
		int res=num/num1;
		System.out.println(res);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//it would compile successfully however when you will run it, it would throw ArithmeticException.
		
		int arr[] ={1,2,3,4,5};
		
		System.out.println(arr[7]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
		
		
		//NullPointerException
		//ArrayIndexOutOfBoundsException
		//ArithmeticException
		//IllegalArgumentException
		//NumberFormatException

	}

}
