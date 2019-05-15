package String_Concept;

public class Count_Occurrence_Character {
		

	//Userdefine chatAt() method
	public static char charFunc(int index, String st1){
		char arr[]= st1.toCharArray();
		
		return arr[index]; 
		
	}

	public static void main(String[] args) {
		
		String st1="test";
		System.out.println(charFunc(1, st1));
		
				
		String str="Selenium IS Selected for Automation";
		int counter=0;
		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i)=='S'){
				counter++;
			}
		}
		System.out.println("Char 'S' occurred "+counter+" times in the string");  
	}

}
