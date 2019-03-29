package oops_convept_part1_naveen;

public class StaticAndNonStatic {
		
		String name = "Iron Man"; //Non Static Globale Variable
		static int age=25;			//Static Globale Variable
		public static void main(String[] args) {
			//How to Call Static Method and Variable
			sum();                    //1) Direct Calling
			StaticAndNonStatic.sum();//2) Calling By ClassName
			System.out.println(age);//Calling Static Variable
			System.out.println("Static method Adding of I & J is :"+sum());
		//Can we Access Static method with Object References ? Answer is => YES 
		//Yes but it not necessary as it share single copy and no need to create Object we can access Directly or ClassName with MethodName
			
			StaticAndNonStatic Obj= new StaticAndNonStatic();
			Obj.sum();//See the Yellow Warning Message
	}
		public void sendMail(){  //Non Static method
			System.out.println("SendMain Method");
		}
		public static int sum(){  //Static method
			System.out.println("Sum static Method");
			int i = 10,j=20;
			int c=i+j;
			return c;
		}

}
