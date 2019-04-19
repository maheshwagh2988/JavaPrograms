package oops_convept_part1_naveen;

public class MainMethodOverLoad {

	//While run  this Program JVM look exactly signature of Main method "(String [] args)" and this method should be "public static void"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Default  Main method");
		MainMethodOverLoad obj= new MainMethodOverLoad();
		//It static so no need to create Object we can directly called it or we can create Object then call it but it does not make sence
		main("Test"); 
		//obj.main("");
		main(10);
	}
	public static void main( String test) {
		System.out.println("This is Overladed Main method 1");

	}
	public static void main( int  a) {
		System.out.println("This is Overladed Main method 2");

	}

}
