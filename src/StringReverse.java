

public class StringReverse {
	
	String str = "My Name is Swapnil";
	
	public void reverse(){
		String[] SP = str.split(" ");
		for(int i=SP.length-1;i>=0;i--){
			System.out.println(SP[i].charAt(i));
		}
	}
		
	public void reverseStr(){
		String[] SP = str.split(" ");
		for(int i=0;i<SP.length-1;i++){
			for(int j= SP.length-1;j>=0;j--)
			{
				System.out.println(SP[j]);
			}
			
		}
		
		
	}
	
	
	public static void main (String args[]){
		StringReverse strRev = new StringReverse();
		strRev.reverse();
		
	}

}
