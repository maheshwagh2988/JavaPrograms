package Abstraction;

public class ICICIBank 	implements USABank,RBI {

	@Override
	public void educationLoan() {
		System.out.println("RBI Interface method");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("RBI Interface method");
		
	}

	@Override
	public void carLoan() {
		System.out.println("RBI Interface method");
		
	}

	@Override
	public void debit() {
		System.out.println("USABank Interface method");
		
	}

	@Override
	public void credit() {
		System.out.println("USABank Interface method");
		
	}

	@Override
	public void transfer() {
		System.out.println("USABank Interface method");
		
	}
	
	//All above Method are @Override method from USABank & RBI Bank Interface
	//ICICBank class own method 
	//these feature are available only ICICI Bank class
	public void MutulFund(){
		System.out.println("ICICBank Class Own Method");
		
	}
	public void Insurance(){
		System.out.println("ICICBank Class Own Method");
		
	}

}
