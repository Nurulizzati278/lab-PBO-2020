public class prak3Lat6 {

	public static void main(String args[]) {
		int a, b;
		a = 10;

		b = (a == 1) ? 20: 30;
		System.out.println( "Value of b is : " + b );
		
		b = (a == 10) ? 20: 30;
		System.out.println( "Value of b is : " + b );
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mengecek boolean, dimana jika true maka dipilih sebelah kiri dan jika false
	maka dipilih sebelah kanan. 
	Pada b = (a == 1) hasil outputnya adalah 30, karena 1 tidak sama dengan 10.
	Pada b = (a == 10) hasil outputnya adalah 20, karena 10 sama dengan 10.
*/