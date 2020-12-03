Penjelasan

Program ini merupakan program sederhana untuk mengelola penumpang di bus Trans Koetaradja yang mempunyai ketentuan sebagai berikut : 
1. Bus hanya memiliki 6 kursi penumpang, yang terdiri dari 4 kursi penumpang biasa dan 2 kursi prioritas.
2. Kursi prioritas hanya dapat diisi oleh orang-orang berikut :
	Lansia : umur lebih dari 60 tahun
	Anak-anak : umur kurang dari 10 tahun
	Ibu hamil
3. Penumpang biasa dilarang duduk di kursi prioritas
4. Penumpang prioritas boleh duduk di kursi biasa.
5. Penumpang tidak bisa lagi menaiki bus jika bus sudah penuh

PENJELASAN CLASS DIAGRAM :
1. Class Penumpang
   Class ini mewakili entitas penumpang bus
   Satu objek penumpang mewakili satu penumpang
   Setiap penumpang mempunyai attribut nama, umur, dan status hamil
   Method Penumpang() merupakan method constructor yang akan memberikan nilai awal kepada attribute.
   Method getNama(), getUmur(), dan getHamil() adalah method accessor yang mengembalikan nilai yang diminta.
2. Class Bus
   Class ini mewakili bus
   Class ini memiliki attribute berupa objek dari Class Penumpang
   Attribute penumpangBasa berisi penumpang biasa (minimal 0, maksimal 4)
   Attribute penumpangPrioritas berisi penumpang prioritas (minimal 0, maksimal 2)
   Method getPenumpang….() mengembalikan list penumpang yang diminta.
   Method getJumlahPenumpang….() mengembalikan jumlah penumpang yang diminta.
   Method NaikPenumpang() berfungsi untuk menambahkan penumpang ke dalam Bus
   Method turunkanPenumpang(nama) menerima parameter nama penumpag. Jika nama penumpang ditemukan, maka hapus penumpang tersebut dari Array penumpang dan
     kembalikan nilai true. Sebaliknya, kembalikan false.
   Method toString() untuk mencetak daftar nama Penumpang Biasa, Penumpang Prioritas, dan Jumlah semua penumpang.
3. Class Main
   Pada method main() dideklarasikan sebuah objek Bus. Pada method ini anda akan mensimulasikan proses naik dan turunnya penumpang dari bus.

Instalisai

$ cd Tugas 1

$ ls
  Bus.java
  Penumpang.java
  Main.java

*//Compile
$javac Bus.java
$javac Penumpang.java
$javac Main.java

*//Run
$java Bus
$java Penumpang
$java Main


Run The Program
1. Buka aplikasi Teks Editor (Visual Studio atau Sublime)
2. Buat kode dari soal yang telah diberikan.
3. Compile program tersebut dan lihat apakah ada eror atau tidak
4. Jika tidak ada eror run program tersebut
5. Setalh itu muncul hasil output dari kode yang kita buat 
6. Pilih pilihan yang diinginkan dari setiap menu tersebut
7. kemudian isi apa yang diminta.
7. Selesai.

