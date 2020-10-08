public class CobaLoopingFor
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mecoba looping for, dimana perulangan for dipakai saat melakukan perulangan 
	dengan jumlah yang sudah diketahui. Pada code diatas perulangan int i akan dilakukan 10 kali dari 0 sampai 9
	dan akan mencetak * secara vertikal dari atas kebawah, sedangkan int j akan melakukan perulangan j<i+1 
	dan akan mencetak * secara horzontal. Perulangan dilakukan sampai semua kondisi telah terpenuhi.
*/