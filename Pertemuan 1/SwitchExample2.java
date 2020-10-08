public class SwitchExample2 {
	public static void main(String[] args) {
		int number=20;

		switch(number){
		case 10: System.out.println("10");
		case 20: System.out.println("20");
		case 30: System.out.println("30");
		default:System.out.println("Not in 10, 20 or 30");
		}
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mencoba switch-case, sebenarnya sama saja seperti Switch case pada program
	sebelumnya, akan tetapi pada code diatas tidak terdapat break, jadi hasil outputnya adalah 10, 20, 30, 
	Not in 10, 20, or 30 karena tidak ada break, sehingga program diatas tidak berhenti menampilkan hasilnya.
*/