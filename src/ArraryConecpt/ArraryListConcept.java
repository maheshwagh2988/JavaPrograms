package ArraryConecpt;

import java.util.ArrayList;

public class ArraryListConcept {

	public static void main(String[] args) {
		
		//ArrayList Dynamically allocate size and Data type
		ArrayList ar = new ArrayList();
		ar.add(100);   // Index 0
		ar.add(200);  // Index 1	
		ar.add(300); // Index 2
		System.out.println("ArraryList Size is: "+ar.size());
		
		ar.add("Tom"); // Index 3
		ar.add("Hello "); // Index 4
		System.out.println("ArraryList Size is: "+ar.size());
		
		ar.add(12.33); // Index 5
		ar.add("A"); // Index 6
		System.out.println("ArraryList Size is: "+ar.size());
		System.out.println("Index of ArraryList: "+ar.get(4));
		//System.out.println("Index of ArraryList: "+ar.get(8)); //java.lang.IndexOutOfBoundsException: 
		
		for(int i=0; i<ar.size(); i++){
			System.out.println("Element for all ArraryList with its Index  " +i+ " : "+ar.get(i));
			//System.out.println(ar.get(i));  this will just print ArraryList
			
			ArrayList<Integer> ar1= new ArrayList<Integer>(); //this will only accept Integer Values in ArrayList Called as Wrapper Class
			ar1.add(100);
//			ar1.add("test");// Error Message:The method add(Integer)in the type ArrayList<Integer>is not applicable for the arguments (String)
		}
		
	}

}
