package String_Concept;

public class charAt_element_present_at_odd_index {

	public static void main(String[] args) {
		String str="Welcome to Javatpoint portal"; 
		for(int i=0; i<=str.length()-1; i++){
			if(i%2!=0){
				System.out.println("Chat at "+ i +" place: "+str.charAt(i));
			}
			
		}

	}

}
