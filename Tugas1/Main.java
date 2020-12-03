import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bus b = new Bus();
        int pilih;
        int x = 0;
        
        System.out.println("===== BUS TRANS KOETA RADJA =====");
        System.out.println("MENU");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang");
        System.out.print("Pilih nomor: ");
        pilih = input.nextInt();

        while (pilih != 4) {
            switch (pilih) {
                case 1:
                    while (x != 2) {
                        System.out.print("Nama : ");
                        String nama = input.next();
                        System.out.print("Masukan Umur: ");
                        int umur = input.nextInt();
                        System.out.print("Hamil [y/n]: ");
                        Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("N") ? true : false;

                        Penumpang penumpang = new Penumpang(nama, umur, hamil);
                        b.NaikPenumpang(penumpang);
                        b.toString();
                        System.out.println("");
                        System.out.print("Naikkan? (1.Yes 2.No) :");
                        x = input.nextInt();
                        System.out.println("============================");
                    }
                    break;
                case 2:
                    System.out.print("\nMasukan nama yang ingin dihapus: ");
                    String nama = input.next();
                    b.turunkanPenumpang(nama);
                    b.toString();
                    System.out.println("============================");
                    System.out.println("");
                    break;
                case 3:
                    b.toString();
                    System.out.println("============================");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }

            System.out.println("===== BUS TRANS KOETA RADJA =====");
            System.out.println("MENU");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.print("Pilih nomor: ");
            pilih = input.nextInt();

        }
    }
}
