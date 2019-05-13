package String_Concept;
//reverse() method is available in StringBuffer not in String 
//String is IMutable Object so here we don;t have reverse() method
//String buffer is Mutable 
//String is slow and consumes more memory
//StringBuffer is fast and consumes less memory when you cancat strings.
//String class overrides the equals() method of Object class.
//StringBuffer class doesn't override the equals() method of Object class.
//String, StringBuilder & StringBuffer have charAt() method
//StringBuilder & StringBuffer class do not have toCharArray() method
//String class does have toCharArray() method.
public class ReverserStringUsingStringBuilder {

	public static void main(String[] args) {
		String s="Selenium";
		StringBuilder sf= new StringBuilder(s);
		System.out.println(sf.reverse());
	}

}
