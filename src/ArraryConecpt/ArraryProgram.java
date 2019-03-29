package ArraryConecpt;

public class ArraryProgram {
	//One Dim arrary 
	public static void main(String[] args) {
		//Advantages
		
		//Array used to store Similer Data Type values in Arrary Variable
		//Arrays are objects which store multiple variables of the same type. 
		//It can hold primitive types as well as object references
		//They can even hold the reference variables of other objects
		//They are created during runtime
		//They are dynamic, created on the heap
		
		
		//Disadvantages
		// Size is fixed  Static Arrary  To Overcome this we USE COLLECTION ArryList,HashTable this is Dynamic arrary
		// It Store Simmler Data Types To Overcome this we USE OBJECT Arrary
		int i[]= new int[4];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		// i[4]=40;
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		//System.out.println(i[4]);
		
		 //This will give you length of Arrary 
		 System.out.println(i.length);
		 //Print O th Position arry Value
		 System.out.println(i[0]);
		 for(int j=0;j<i.length;j++){
			 System.out.println(i[j]);
		 }
		// It Store Simmler Data Types To Overcome this we USE OBJECT Arrary
		//Object Array used to store different data types Values like,String,Int,Double,Char,Boolean 
		 
		 Object ob[] = new Object[5];
		 
		 ob[0]="Tom"; //String
		 ob[1]= 12;  //Int
		 ob[2]= 12.55;  //Double
		 ob[3]='c'; //Char
		 ob[4]=true;//Boolean
		for(int k=0;k<ob.length;k++){
			System.out.println(ob[k]);
		}
		 		 
	}

}
