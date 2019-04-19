package String_Concept;

public class StringPool_new {
	
//Immutable simply means unmodifiable or unchangeable.
//Once string object is created its data or state can't be changed but a new string object is created.
//1)Suppose there are 5 reference variables,all referes to one object "sachin".
//If one reference variable changes the value of the object, it will be affected to all the reference variables.
//That is why string objects are immutable in java.
	

	public static void main(String[] args) {
		 String s1 = "Cat";
	     String s2 = "Cat";
	     String s3 = new String("Cat"); //This will create new Object in Heap Memory
	        
	     System.out.println("s1 == s2 :"+(s1==s2));
	     System.out.println("s1 == s3 :"+(s1==s3));
	     
//two objects are created but s reference variable still refers to "Sachin" not to "Sachin Tendulkar".     
	     
	     String s="Sachin";  
	     s.concat(" Tendulkar");//concat() method appends the string at the end  
	     System.out.println(s);//will print Sachin because strings are immutable objects 
	     
//But if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object.For example:
	     s=s.concat(" Tendulkar");  
	     System.out.println(s);  

	}
	

}
