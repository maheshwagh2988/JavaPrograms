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
	
	//ICICBank class own method
	public void MutulFund(){
		System.out.println("ICICBank Class Own Method");
		
	}
	public void Insurance(){
		System.out.println("ICICBank Class Own Method");
		
	}

}
