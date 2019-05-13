package String_Concept;

public class CreateString {

	public static void main(String[] args) {
		//creating a string by java string literal 
		String str="Using String Litral we can create String";
		char arrch[]={'H','E','L','L','O'};
		//converting char array arrch[] to string str2
		System.out.println(arrch);
		String str2 = new String(arrch); 
		
		//creating another java string str3 by using new keyword 
		String str3 = new String("Using new Keyword we can create String"); 
		
		//Displaying all the three strings
		System.out.println(str);  
		System.out.println(str2);  
		System.out.println(str3);  

	}

}
