package PalindromePrograms;

public class Palendrom1 {
	//1) Get the number to check for palindrome
	//2) Hold the number in temporary variable
	//3) Reverse the number
	//4) Compare the temporary number with reversed number
	//5) If both numbers are same, print "palindrome number"
	//6) Else print "not palindrome number"

	public static void main(String[] args) {
		int remainder,OriginamNumber;
		int reversedInteger =0;
		
		int num=121; //1) Get the number to check for palindrome
		OriginamNumber = num;
		
		// reversed integer is stored in variable 
		while(num !=0){
			remainder=num % 10;
			reversedInteger=reversedInteger*10+remainder;
			num /=10;
	        // palindrome if orignalInteger and reversedInteger are equal
		}
		if (OriginamNumber == reversedInteger)
            System.out.println(OriginamNumber + " is a palindrome.");
        else
            System.out.println(OriginamNumber + " is not a palindrome.");
				

	}

}
