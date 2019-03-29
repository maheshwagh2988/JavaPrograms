package OOPS_Concept;

public class Multiple_Switch_case {

	public static void main(String[] args) {
		int day = 6;
		String DayType;
		String DayString;
		switch (day) {
		case 1:
			DayString = "Monday";
			break;
		case 2:
			DayString = "Tuesday";
			break;
		case 3:
			DayString = "Wednesday";
			break;
		case 4:
			DayString = "Thursday";
			break;
		case 5:
			DayString = "Friday";
			break;
		case 6:
			DayString = "Saturday";
			break;
		case 7:
			DayString = "Sunday";
			break;
		default:
			DayString = "Invalid day";
		}
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			DayType = "Weekday";
			break;
		case 6:
		case 7:
			DayType = "Weekend";
			break;

		default:
			DayType = "Invalid daytype";
		}
		System.out.println(DayString + " is a " + DayType);
	}

}
