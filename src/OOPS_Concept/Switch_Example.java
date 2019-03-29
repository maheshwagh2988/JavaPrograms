package OOPS_Concept;

public class Switch_Example {
		public static void main(String[] args) {
			int week=7;
			String weeknumber;
switch (week){
case 1: 
		weeknumber="Monday";
		break;
case 2:		
		weeknumber="Twesday";
		break;
case 3:
		weeknumber="Wednesday";
		break;
case 4:
		weeknumber="Thuresday";
		break;
case 5: 
		weeknumber="Friday";
		break;
case 6: 
		weeknumber="Saturday";
		break;
case 7: 
		weeknumber="Sunday";
		break;
default:
		weeknumber="Invalid Week";
		break;
		}			
	System.out.println(weeknumber);	

	}

}
