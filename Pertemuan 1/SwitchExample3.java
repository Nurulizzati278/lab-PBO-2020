public class SwitchExample3 {
	public static void main(String[] args) {
		String dayOfWeekArg = "Thursday";
		String typeOfDay = "";

	switch (dayOfWeekArg) {
		case "Monday":
			typeOfDay = "Start of work week";
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			typeOfDay = "Midweek";
			break;
		case "Friday":
			typeOfDay = "End of work week";
			break;
		case "Saturday":
		case "Sunday":
			typeOfDay = "Weekend";
			break;
		default:
			System.out.println("Invalid day of the week: " + dayOfWeekArg);
		}
		System.out.println(typeOfDay);
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mencoba switch-case, dimana hasil outputnya adalah "Midweek" karena setelah 
	diuji string dari variabel dayOfWeekArg yang memebuhi adalah midweek, dan karena ada break maka programnya 
	akan berhenti di typeOfDay = "Midweek".
*/