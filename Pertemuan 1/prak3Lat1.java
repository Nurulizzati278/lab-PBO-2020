public class prak3Lat1 {

	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;

		System.out.println("a + b = " + (a + b) );
		System.out.println("a - b = " + (a - b) );
		System.out.println("a * b = " + (a * b) );
		System.out.println("b / a = " + (b / a) );
		System.out.println("b % a = " + (b % a) );
		System.out.println("c % a = " + (c % a) );
		System.out.println("a++ = " + (a++) );
		System.out.println("b-- = " + (a--) );
		
		System.out.println("d++ = " + (d++) );
		System.out.println("++d = " + (++d) );
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mencoba operator aritmetika.
	Pada penjumlahan a + b, yaitu 10 + 20 maka outputnya adalah 30. 
	Pada pengurangan a - b, yaitu 10 - 20 maka outputnya adalah -10. 
	Pada perkalian a * b, yaitu 10 * 20 maka outputnya adalah 200. 
	Pada pembagian b / a, yaitu 20 / 10 maka outputnya adalah 2. 
	Pada modulo atau nilai sisa b % a, yaitu 20 % 10 maka outputnya adalah 0, 
	karena 20 % 10 itu hasil baginya 0. 
	Pada modulo atau nilai sisa c % a, yaitu 25 % 10 maka outputnya adalah 5, 
	karena 25 % 10 itu terdapat sisa yaitu 5. 
	Pada increment a++ ini merupakan postincrement, a akan ditampilkan dulu, kemudian a ditambah 1 
	maka outputnya adalah 10.
	Pada decrement b-- ini merupakan postdecrement, b akan ditampilkan dulu, kemudian dikurang 1 yang
	nilai b nya itu diambil dari
	nilai a sebelumnya. maka outputnya adalah 11.
	Pada increment d++ ini merupakan postincrement, d akan ditampilkan dulu, kemudian d ditambah 1. 
	Maka outputnya adalah 25
	Pada increment ++d, d akan ditambah dulu kemudian baru d akan ditampilkan. Variabel d sebelumnya telah
	mendapat postincrement, dimana nilai d menjadi 26 dan dalam proses increment ini variabel d akan menambah
	1 karena mendapat preincrement
*/