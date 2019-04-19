package String_Concept;

public class StringPool {	

//String are Immutable in Nature	
//S1 and S1 point to same memory location it will create one application pool inside the memory and both are point same value "Java"
//If you debug it S1 and S1 id point same id whereas S3 will create another memory location 
//This is reason String is	Immutable and Final
//Integer, Long,Double ,Float are Wrapper class and these class also called as Immutable and Final class
//Class loading mechanism 
//Optimization and Performance 	As if we compare string then some time we need to check hashcode here String is Immutable and Final then no need
//If String final so we can't change and if class is final we can't inherit(extend) that class	
	
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		//s2="c++"; if we un-comment it then s2 point  another memory location
		String s3="Selenium";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
