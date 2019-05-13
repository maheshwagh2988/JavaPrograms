package String_Concept;

public class Reverse_String_StringBuilder {

	public static void main(String[] args) {
		String input="My Name is Mahesh";
		//Create a Object of StringBulder class
		StringBuilder str= new StringBuilder();
		// append a string into StringBuilder input1 
		str.append(input);
		 // reverse StringBuilder input1 
		str=str.reverse();
		// print reversed String 
		System.out.println(str);

	}

}
