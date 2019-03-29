package ArraryConecpt;

public class TwoDArrary {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FirstArrary[]= new int[6];
		for (int i=0;i<FirstArrary.length;i++){
			FirstArrary[i]=i+1;
			System.out.println(FirstArrary[i]);
		}
		System.out.println("========SECOND CALL==============");
		
		for(int i=0;i<FirstArrary.length;i++){
	         System.out.println(FirstArrary[i]);
	     }

	}

}
