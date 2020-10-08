public class prak3Lat4 {

	public static void main(String args[]) {
		int a = 60;
		int b = 13;
		int c = 0;

		c = a & b; /* 12 = 0000 1100 */
		System.out.println("a & b = " + c );

		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c );

		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c );

		c = ~a; /*-61 = 1100 0011 */
		System.out.println("~a = " + c );

		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c );

		c = a >> 2; /* 15 = 1111 */
		System.out.println("a >> 2 = " + c );

		c = a >>> 2; /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c );
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mecoba opeator bitwise untuk menangani operasi logika bilangan biner dalam 
	bentuk bit, dimana bilangan biner itu ada 0 yang berarti false dan 1 yang berarti true.
	Pada a & b itu merupakan bitwise and antara a dan b, dimana dalam bitwise and biner yang kita
	ambil itu jika kondisi antara biner a dan biner b keduanya benar, maka hasil outputnya adalah 12.
	Pada a | b itu merupakan bitwise or antara a dan b, dimana bilangan biner diambil itu jika kondisi antara 
	biner a dan biner b salah satunya benar dan apabila benar keduanya, maka hasil outputnya adalah 61.
	Pada a ^ b itu merupakan bitwise xor antara a dan b, dimana bilangan biner yang diambil itu jika salah
	satu kondisinya benar, maka hasil outputnya adalah 49.
	Pada ~a itu merupakan bitwise complement a, dimana dalam bitwise complement terdapat rumus -(n+1), 
	dimana n merupakan bilangan biner, maka hasil outputnya adalah -61. 
	Pada a << 2 itu merupakan pergeseran bit ke kiri, dimana posisi bit dalam variabel a digesr ke kiri
	sebanyak 1 tempat, maka outpunya adalah 240. 
	Pada a >> 2 itu merupakan pergeseran bit ke kanan, dimana posisi bit dalam variabel a digeser ke kanan 
	sebanyak 1 tempat, maka outputnya adalah 15. 
	Pada a >>> 2 itu merupakan penggeseran bit ke kanan dan nilai yang digeser diisi dengan nol, 
	maka otuputnya adalah 15.
*/ 