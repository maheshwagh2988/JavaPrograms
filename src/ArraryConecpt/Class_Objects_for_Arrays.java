package ArraryConecpt;

public class Class_Objects_for_Arrays {
	
	public static void main(String[] args) {
			
			int intArrary[]=new int [3];
			byte byteArray[] = new byte[3]; 
	        short shortsArray[] = new short[3]; 
	        // array of Strings 
	        String[] strArrary= new String[3];
	        System.out.println(intArrary.getClass());
	        System.out.println(intArrary.getClass().getSuperclass());
	        System.out.println(byteArray.getClass());
	        System.out.println(shortsArray.getClass());
	        System.out.println(strArrary.getClass());

	}

}
