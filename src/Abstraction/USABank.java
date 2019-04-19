package Abstraction;

public interface USABank {
	//No method body {} only declaration /Only declaration Not Implementation
	//Only method prototype
	//Can't create Object of Interface
	//No static method allowed
	//but Interface variable are static in nature by default
	int min_bal=100;
	public void debit(); 
	public void credit();
	public void transfer();

}
