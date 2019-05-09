package Exception_Handling;

public class Finally_block_Exception {
//The statements present in this block will always execute regardless of whether
//exception occurs in try block or not such as closing a connection, stream etc.
// A finally block must be associated with a try block, you cannot use finally without a try block.
//it is Optional however if you place a finally block then it will always run after the execution of try block.
//In normal case when there is no exception in try block then the finally block is executed after try block.
//4. An exception in the finally block, behaves exactly like any other exception.

//close() statement is used to close all the open streams in a program. Its a good practice to use close() inside finally block. 	
	public static void main(String[] args) {
		
		try{
			int num=10/0;
			System.out.println(num);
		}catch(ArithmeticException e){
			System.out.println("Number should not be divided by zero");
		}
		finally{
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally"); 
	}

}
