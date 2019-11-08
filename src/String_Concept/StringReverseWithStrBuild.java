package String_Concept;

public class StringReverseWithStrBuild {
	
	public static void main (String args[]){
		String str = "My Name is Swapnil";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String Before Reverse : "+str);
		System.out.println("String After Reverse : "+sb.reverse());
	}

}
