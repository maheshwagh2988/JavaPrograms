package Exception_Handling;

public class ThrowKeyword {
	
//1. When you want to deliberately throw exception then we use throw it is also called user define exception.
//2. We have to use try Catch block when we are doing user define exception.
//3. If we use  throws then JVM will not catch it so no use of throws so no use of throws keyword.	
//4. printStackTrace will print the error message on console.	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Mahesh Exception");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("PQR");

	}

}
