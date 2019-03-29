public class TestCollege {
	
	//Class file. No need to implement Interface.

 public static void main(String[] args) {
    //Can access Interface variable directly using Interface name.
	 
  System.out.println(College.Collegename+" Collage student details.");
  
  //Created Computer class object with reference of interface College.
  
  College compdept = new Computer();
      
  //Methods will be called from Computer class.
  compdept.StudentDetails();
  compdept.StudentResult();
  
  //Created Mechanical class object with reference of interface College.
  College mecdept = new Mechanical();
  //Methods will be called from Mechanical class.
  mecdept.StudentDetails();
  mecdept.StudentResult();    
 }
}