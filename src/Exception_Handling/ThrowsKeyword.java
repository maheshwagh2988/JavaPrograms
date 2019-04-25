package Exception_Handling;

public class ThrowsKeyword {

		public static void main(String[] args) {
			
			ThrowsKeyword th= new ThrowsKeyword();
			th.sum();
		

	}
		
		
		public void sum()throws ArithmeticException{
			div();
		}
		public void div() throws ArithmeticException{
			int i=9/0;
		}

}
