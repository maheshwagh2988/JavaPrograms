package oops_convept_part2_naveen;

public class finalizeConcept {
//finalizeConcept used to perform cleanup memory processing like garbage collector 
//	finalize is a method 	
//Just before the Garbage collection we have to use finalize method to perform cleanup memory processing of Object ()
	
	public void finalize(){
		System.out.println("finalize method call automatically withour create Object ");
	}
	
	public static void main(String[] args) {
		finalizeConcept f1 = new finalizeConcept();
		finalizeConcept f2 =  new finalizeConcept();
		
		//f1 and f2 create memory inside java memory with some reference 
		
		f1=null;
		f2=null;
//After write f1 and f2 null then Object not reference any memory only blank Object with no reference 
//Garbage collector will come inside memory  see who are not having reference any memory those Object will destroyed by Garbage collector
//If there is not Object reference available then all those Object destroyed by Garbage collector
//It Automatically Called you never know 
	
		//Called Garbage collector
			System.gc();	

	}
}