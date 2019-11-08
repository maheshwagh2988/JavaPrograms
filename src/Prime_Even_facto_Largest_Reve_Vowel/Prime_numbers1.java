package Prime_Even_facto_Largest_Reve_Vowel;

public class Prime_numbers1 {

	public static void main(String[] args) {
			int number=29;
			boolean flag = false;
			for(int j=2;j<number/2;++j){
				if(number%j==0){
					flag=true;
					break;
				}
			}
			if(!flag)
				System.out.println(number +" Is a Prime");
			else
				System.out.println(number +" Not Prime");
			
	}

}
