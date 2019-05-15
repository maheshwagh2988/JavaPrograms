package String_Concept;
//The Java String charAt(int index) method returns the character at the specified index in a string.
//The index value that we pass in this method should be between 0 and (length of string-1).
//Java String charAt method throws IndexOutOfBoundsException.
//If the index value passed in the charAt() method is less than zero or greater than or equal to the length of the string.


public class String_charAt_Method {

	public static void main(String[] args) {
		String str="Welcome to string handling tutorial";
		System.out.println(str);
		
		//This will return the 0th char of the string
		char ch1=str.charAt(0);
		//This will return the 4th char of the string
		char ch2=str.charAt(4);
		//This will return the 5st char of the string
		char ch3=str.charAt(5);
		System.out.println("Character at 0 index is: "+ch1);
		System.out.println("Character at 4th index is: "+ch2);
		System.out.println("Character at 5th index is: "+ch3);
		
		
		String st = "Print all Charecter";
		for(int i=0; i<=st.length()-1; i++) {
			System.out.print(st.charAt(i));
			//char arr=(char) st.charAt(i);
			//System.out.print(arr);
		}
		
		String s = "BeginnersBook";
		//negative index, method would throw exception 
		//java.lang.StringIndexOutOfBoundsException:
		char ch = s.charAt(13);
		System.out.println(ch);
		
		
		

	}

}
