package String_Concept;

public class toCharArray_Method {

	public static void main(String[] args) {
		String s1= "Welcome to Javatpoint";
		s1.toCharArray();
		//Default string Print 
		System.out.println(s1.toCharArray());
		//convert String into array
		char[] ch=s1.toCharArray();
		//To find length of String
		int lenth=ch.length;
		//Print length of String
		System.out.println("Char Array length: " + lenth);  
        System.out.println("Char Array elements: ");
        //Print all Character in given String 
		for(int i=0; i<lenth;i++){
			System.out.print(ch[i]);
		}

	}

}
