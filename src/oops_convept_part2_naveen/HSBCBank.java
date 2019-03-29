package oops_convept_part2_naveen;

public   class HSBCBank implements USBank,BrazilBank{
	
	//here we are Achieving Multiple Inheritance 
	// Is-a-Relationship
		
	//If class implementing any Interface then its mandatory to define or Override all the method of Interface
	//Overriding from USBank
	public void credit(){
		System.out.println("HSBC-- Credit method called from Interface USBank ");
	}
	public void debit(){
		System.out.println("HSBC-- Debit method called from Interface USBank");
	}
	
	public void transfreMoney(){
		System.out.println("HSBC-- transfreMoney method called from Interface USBank ");
	}
	
	
	//This is HSBC bank Class Separate Method
	public void educationLoan(){
		System.out.println("HSBC ----educationLoan method called from HSBCBank class");
	}
	public void carLoan(){
		System.out.println("HSBC -------- carLoan method called from HSBCBank class");
	}
	
		
	//This is BrazilBank Interface Method
	public  void mutualFund(){
		System.out.println("HSBC ---mutualFund method called from Interface BrazilBank");
	}

}
