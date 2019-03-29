



public class EvenOrOdd {
	
	int n=10;
	
	public void evenOdd(){
		
		
		for(int i=1;i<n+1;i++){
			if(i%2==0)
				System.out.println(i+" is an Even number");
			else
				System.out.println(i+" is a Odd Number");
				}
	}
	
	public static void main (String srgs[]){
		EvenOrOdd eo = new EvenOrOdd();
		eo.evenOdd();
	}

}
