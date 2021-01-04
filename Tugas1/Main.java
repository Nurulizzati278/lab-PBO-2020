import java.util.Scanner;

/**
 * Write a description of class Main here.
 * Class ini di buat untuk menjalankan seluruh program dari class lain dan inti dari program ini
 *
 * @author Muammar Yasir
 * @version 1.1 01/01/2021
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Bus b = new Bus();
        int pilih;

        System.out.println("===== BUS TRANS KOETARADJA =====");
        
        while(true){
            System.out.println("\n~~~~~~~~");
            System.out.println("MENU : ");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Pendapatan Bus");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            System.out.println();
            input.nextLine();
        
            switch(pilih)
            {
                case 1:
                    b.jumlahPenumpang();
                    break;
                case 2:
                    b.turun();
                    break;
                case 3:
                    b.toString();
                case 4:
                    b.pendapatan();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                System.out.println("Tidak ada pilihan");
            }
        }
    }
}