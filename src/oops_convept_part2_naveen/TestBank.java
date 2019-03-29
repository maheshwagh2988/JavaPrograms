package oops_convept_part2_naveen;

public class TestBank {
	
	public static void main(String[] args) {
		
		//USBank us= new USBank(); We cannot create a Object of Interface 
		
		System.out.println("Static var in Innterface,here we called whith class name: "+HSBCBank.min_bal);
		System.out.println("Static var in Innterface,here we called Interface Name: "+USBank.min_bal);
		System.out.println("**********************");
		//we cant change value of variable
		//USBank.min_bal=200;//The final field USBank.min_bal cannot be assigned
		
		HSBCBank hs = new HSBCBank();
		//	Compile time polymophsiam or Static polymophsiam here we are overriding method  
		//3 methods are overriding
		hs.credit();
		hs.debit();
		hs.transfreMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		System.out.println("**********************");
		//Dynamic time Polymorphsiam
		//Child class Object referred by parent Interface reference variable 
		USBank us=(HSBCBank)new HSBCBank();
		//Only overriding method called  not educationLoan() and carLoan()
		us.credit();
		us.debit();
		us.transfreMoney();
		
		
	}

}
