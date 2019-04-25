package Abstraction;

public class TestAbstractionBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICIBank icObj= new ICICIBank();
		//@Overriden method of USABank Interface
		icObj.credit();
		icObj.debit();
		icObj.transfer();
		//@Overriden method of RBI Interface
		icObj.educationLoan();
		icObj.homeLoan();
		icObj.carLoan();
		//ICICIBank Own Method		
		icObj.Insurance();
		icObj.MutulFund();
		//Interface Variable by default static in Nature 
		//Static variable called by Interface name if it is in the class then called by class name
		System.out.println("In USABank Interface Static Variable Value is :  "+USABank.min_bal);
		
		//Run time Polymorphisma 
		//IF we pass Obj reference variable to Interface then we call those method.
		USABank us=new ICICIBank();
		us.credit();
		us.debit();
		us.transfer();
		
				

	}

}
