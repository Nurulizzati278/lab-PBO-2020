public class CobaLoopingWhile
{
	public static void main(String arg[])
	{
		int i=0;

		while (i<10)
		{
			int j=0;
			while (j<i+1)
			{
				System.out.print('*');
				j++;
			}

			System.out.println();
			i++;
		}
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mencoba looping while, dimana perulangan while dipakai saat melakukan 
	perulangan dengan jumlah yang belum diketahui pastinya. Pernyataan pada while akan dikerjakan setelah 
	pengecekan kondisi pada while bernilai true. Pada code diatas, while (i<10) akan melakukan perulangan
	sampai i<10 atau sampai i=9, sedangkan int j akan melakukan perulangan sampai j<i+1. int i akan mencetak * 
	secara vertikal dari atas kebawah, sedangkan int j akan mencetak * secara horzontal. Perulangan dilakukan 
	sampai semua kondisi telah terpenuhi.
*/