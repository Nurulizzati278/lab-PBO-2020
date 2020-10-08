public class SwitchExample {
	public static void main(String[] args) {
		int number=20;

		switch(number){
		case 10: System.out.println("10");break;
		case 20: System.out.println("20");break;
		case 30: System.out.println("30");break;
		default:System.out.println("Not in 10, 20 or 30");
		}
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mencoba switch-case, dimana hasil outputnya adalah 20 karena nilai dari
	variabel int number memnuhi case 20, dan karena ada break maka programnya akan berhenti di case 20.
*/