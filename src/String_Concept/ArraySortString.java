package String_Concept;

import java.util.Arrays;

public class ArraySortString {
	
	String[] strnames = {"John","alex","Chris","williams","Mark","Bob"};
	
	public void sortString(){
		Arrays.sort(strnames);
		System.out.println("Sorted String (Case sensitive) :");
		for(int i=0;i<strnames.length;i++){
			System.out.println(strnames[i]);
		}
	}
		
	public static void main (String args[]){
		ArraySortString as = new ArraySortString();
		as.sortString();
	}

}

