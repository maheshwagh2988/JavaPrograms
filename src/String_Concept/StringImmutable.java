package String_Concept;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Mahesh";
		s1.concat("Wagh");
		System.out.println(s1);//It will print only S1 that is reason String is Immutable 
		//if we want to change then we have to store in another in variable then access it
		
		String a="TestString";
		StringBuffer sb= new StringBuffer(a);
		//OR  StringBuffer sb= new StringBuffer("TestString");
		sb.append("Sucessfully"); //Here String are changed 
		System.out.println(sb);
		
	}

}
