public class CobaContinue
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
			{
				if(j==5)
					continue;
				System.out.print('*');
			}

			System.out.println();
		}
	}
}
/*penjelasan program diatas
	Program diatas hampir sama dengan program sebelumnya, yang membedakan hanya di break dan continue.
	Pada program ini kondisi if(j==5) dan continue membuat program tetap dilanjutkan ke tahapan selanjutnya pada 
	perulangan dan tidak diberhentikan seperti pada program break.
*/