package String_Concept;

public class StringReverser_using_StringBuilder {

	
	public static void main(String[] args) {
		String s="Mahesh";
		StringBuffer bs= new StringBuffer();
		bs.append(s);
		bs=bs.reverse();
		for(int i=0;i<bs.length();i++)
		System.out.print(bs.charAt(i));
		
		
	}

}
