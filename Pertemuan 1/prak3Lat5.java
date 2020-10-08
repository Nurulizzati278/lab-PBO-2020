public class prak3Lat5 {

	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;

		System.out.println("a && b = " + (a&&b));
		System.out.println("a || b = " + (a||b) );
		System.out.println("!(a && b) = " + !(a && b));
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk operator logika untuk membandingkan boolean a dan boolean b yang akan
	menghasilkan nilai true atau false. 
	Pada a && b itu merupakan operator logika and antara boolean a dan boolean b, pada code diatas 
	diketahui bahwa boolean a itu true dan boolean b itu false, maka ouputnya adalah false karena nilainya 
	bukan true. 
	Pada a || b itu merupakan operator logika or antara boolean a dan boolean b, maka hasil outputnya itu 
	adalah true karena salah satunya true.
	Pada !(a && b) itu merupakan operator logika not antara boolean a and boolean b, maka hasil outputnya
	adalah true karena pada baris pertama outputnya itu false, jadi pada baris ketiga dibalikkan oleh
	operator not.
*/