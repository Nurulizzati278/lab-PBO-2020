public class CobaBreak
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
			{
				if(j==5)
					break;
				System.out.print('*');
			}

			System.out.println();
		}
	}
}
/*penjelasan program diatas
	program diatas digunakan untuk mencoba break, dimana suatu kondisi akan keluar dari perulangan.
	pada code diatas perulangan i akan dilakukan 10 kali dari 0 sampai 9 dan akan mencetak * secara vertikal 
	dari atas kebawah, sedangkan int j akanmelakukan perulangan sampai j<i+1 dan mencetak * secara horzontal.
	Pada kondisi if(j==5) dan break itu perulangan akan diberhentikan dan dilanjutkan kembali ke i, kemudian
	kembali ke j seperti biasa sampai semua kondisi terpenuhi.
*/