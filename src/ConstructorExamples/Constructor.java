package ConstructorExamples;

public class Constructor {
	String name;
	   //Constructor and Class name is same it don't have any return Type
	public Constructor() {
		this.name="Constructor with This Keyword which reffer to  Current Object";
	}
	
	public static void main(String[] args) {
		Constructor obj= new Constructor();
		
		System.out.println(obj.name);
		

	}

}
