package String_Concept;

public class Reverser_Using_toCharArray {

	public static void main(String[] args) {
		String input ="This is toCharArray";
		char[] input1 =input.toCharArray();
		
		for(int i=input1.length-1;i>=0;i--){
			System.out.print(input1[i]);
		}

	}

}
