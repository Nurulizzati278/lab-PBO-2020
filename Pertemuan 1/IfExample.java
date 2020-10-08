import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		int age=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan umur anda:");
		age = sc.nextInt();

		if(age>=17)
			System.out.print("Anda sudah boleh buat KTP");
	}
}
/*penjelasan program diatas
	program datas digunakan untuk mencoba if statement, dimana if akan dilakukan jika keadaan benar. 
	Pada code diatas jika user memasukkan umur lebih dariama dengan 17, maka output yang keluar adalah
	"anda sudah boleh buat KTP", akan tetapi jika user memasukkan umur kurang dari 17 tahun, maka tidak ada 
	output yang akan keluar.
*/