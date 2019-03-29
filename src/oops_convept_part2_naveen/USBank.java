package oops_convept_part2_naveen;
//interface don't have main method
public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	public void debit();
	public void transfreMoney();// If we give body { } we got an error "Abstract methods do not specify a body"
	
	//Only Method Declaration 
	//No Method Body {} Only method Prototype 
	//We can Declare Variable and Variable by default are Static no need to write static and 
	//Value of variable will not change
	//No Static method in interface before JAVA 8 
	//With Java 8, interfaces can have static methods. They can also have concrete instance methods, but not instance fields.
	//No main method 
	//We Cann't create a Object of interface
	//It means interface Abstract in Nature 
	//All method are Static before 8 after In JAVA 8 we can declare Static method
	//we cant change value of variable its Final/Constant
	//USBank.min_bal=200;//The final field USBank.min_bal cannot be assigned
			
	

}
