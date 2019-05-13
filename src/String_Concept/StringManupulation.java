package String_Concept;
//String is collection of different character 
//It Start index from 0 zero
//size() method is used for array list object to print size of array for String we used length() method 

public class StringManupulation {
	
	public static void main(String[] args) {
		String str="The rainS have Stared here Selenium" ;
		String str1="The rainS Have Stared here Selenium" ;
		str.length();
		//Find the length of String we have length() method
		System.out.println("Lenght of given String is: "+str.length());
		
		//If want to find values available on 5th Index then we have method name as charAt() method
		System.out.println("String Avalible on 5th Index is: "+str.charAt(5));
		
		//Find Index of given String we have indexOf() method
		System.out.println("1st occurrence of S in Given String Index is: "+str.indexOf("S")); //1st occurrence of s
		
		System.out.println("2nd Occurance of S in Given String Index is:  "+str.indexOf("S", 9));//2nd occurrence of S
									//OR
		System.out.println(str.indexOf("S", str.indexOf("S")+1));//2nd occurrence of S
		
		System.out.println("3rd Occurance of S in Given String Index is: "+str.lastIndexOf("S"));//3rd Occurrence of S
		
		System.out.println("have String avalable on given index is: "+str.indexOf("have"));
		
		//if Given String is not present then it will return -1
		System.out.println("Give Hello String is Not Present so it will return: "+str.indexOf("hello"));
		
		//String Comparison 
		
		System.out.println(str.equals(str1));//change have to Have it will return false
		System.out.println(str.equalsIgnoreCase(str1));//It will Ignore case sensitive make comparison so return true
		
		//Find SubString
		System.out.println(str.substring(0, 8));
		
		//Trim
		//It remove only before space not after 
		String s1= "  Hi this is Word  ";
		System.out.println(s1.trim());
		
		//Remove Space inside String
		System.out.println(s1.replace(" ", ""));
		
		//Here - replace with /
		String date="01-01-2019";
		System.out.println(date.replace("-", "/"));
		
		
		//split
		String test="Hello_world_test_Selenium";
		String testarry[]=test.split("_");
		for(int i=0;i<testarry.length;i++){
			System.out.println("After remove _ String is: "+testarry[i]);
		}
		
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
		

	}

}
