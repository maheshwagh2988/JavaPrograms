package String_Concept;

public class Count_Occurrence_Character {

	public static void main(String[] args) {
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
