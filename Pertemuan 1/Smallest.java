public class Smallest
{
	public static void main(String arg[])
	{
		int a, b;

		Mulai:
		for(a=0; a<2; a++)
		{
			for(b=0; b<3; b++)
			{
				if(b==2)
					break Mulai;
				System.out.println("a=" + a + " ; b=" + b);
			}
		}
	}
}
/*penjelasan program diatas
	Program diatas digunakan untuk mencoba pemakaian label pada break, dimana break itu menyebabkan suatu
	kondisi keluar dari perulangan. Pada program diatas break akan menghentikan operasi pada statemen mulai, 
	dan keluar dari loop for pertama. Maka hasil outputnya adalah a=0 ; b=0, a=0 ; b=1.
*/

