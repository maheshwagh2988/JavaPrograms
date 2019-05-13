package String_Concept;

//reverse() method is available in StringBuffer not in String 
//String is IMutable Object so here we don;t have reverse() method
//String buffer is Mutable 

public class ReverseString {

	public static void main(String[] args) {
		String str="Selenium";
		
		//Using for Loop
		int len= str.length();
		String revr="";
		
		for(int i=len-1;i>=0;i--){
		revr=revr+str.charAt(i);
		
		}
		System.out.println(revr);

	}

}
