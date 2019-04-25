package Exception_Handling;

public class ExceptionHandaling {

	int a=10;
	public static void main(String[] args) {
		
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
