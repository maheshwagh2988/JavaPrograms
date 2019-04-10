package Abstraction_And_Interface_Concept;

//Abstraction means to hide some implementation logic 
//this is Partial Abstraction 
//Abstract class can have Abstract as well as non Abstract method
//If class having one abstract method then that class should be define as abstract class
public class TestBank {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HDFCBank hb= new HDFCBank();
			hb.credit();
			hb.debit();
			hb.loan();//overridden method from BankClass
			hb.funds();//this  only access by HDFCBank
			
			System.out.println("----------Using Dynamic Poymorphisam-----------");
			//Dynamic Poymorpisam we call all the overridden method
			Bank b= new HDFCBank();
			//b is reference variable of Bank Class so you can't access of HDFCBank method only overridden method can access
			b.credit();
			b.debit();
			b.loan();
			//here funds() method don't have access as it part of Child class HDFCBank
			
	}

}
