import java.util.*;

public class Bus
{
    private ArrayList <Penumpang> penumpangBiasa;
    private ArrayList <Penumpang> penumpangPrioritas;

    public Bus()
    {
        penumpangBiasa = new ArrayList <Penumpang>();
        penumpangPrioritas = new ArrayList <Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa(){
        for (Penumpang penumpang : penumpangBiasa) {
            penumpang.getNama();
        }
        return penumpangBiasa;

    }
    
    public ArrayList<Penumpang> getPenumpangPrioritas(){
        for (Penumpang penumpang : penumpangPrioritas) {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa(){
        int jumlahPenumpangBiasa = penumpangBiasa.size();
        System.out.println("Jumlah penumpang Biasa yaitu " + jumlahPenumpangBiasa);
        return jumlahPenumpangBiasa;

    }

    public int getJumlahPenumpangPrioritas(){
        int jumlahPenumpangPrioritas = penumpangPrioritas.size();
        System.out.println("Jumlah penumpang Prioritas yaitu " + jumlahPenumpangPrioritas);
        return jumlahPenumpangPrioritas;
    }

    public int getJumlahpenumpang(){
        return penumpangBiasa.size() + penumpangPrioritas.size();
    }

    public boolean NaikPenumpang(Penumpang penumpang){
        if(penumpangBiasa.size() < 5 && penumpang.getUmur() > 10 || penumpang.getUmur() < 60 || penumpang.getHamil()==false){
            System.out.println("Penumpang yang bernama " +penumpang.getNama()+ "ditambahkan");
            return penumpangBiasa.add(penumpang);
        }
        else if(penumpangPrioritas.size() < 1 && penumpang.getUmur() < 10 || penumpang.getUmur() > 60 || penumpang.getHamil()==true){
            System.out.println("Penumpang yang bernama " +penumpang.getNama()+ "ditambahkan");
            return penumpangPrioritas.add(penumpang);
        }
        else{
            System.out.println("Penumpang yang bernama " +penumpang.getNama()+ "gagal ditambahkan");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama){
        for (int i = 0; i < penumpangBiasa.size(); i++) {
            if (nama.equals(penumpangBiasa.get(i).getNama())) {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Telah Turun");
                return penumpangBiasa.equals(nama);
            } else {
                System.out.println("Penumpang" +nama+ "Tidak Ada ");
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i++) {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) {
                penumpangPrioritas.remove(i);
                System.out.println("Penumpang Telah Turun");
                return penumpangPrioritas.equals(nama);
            } else {
                System.out.println("Penumpang" +nama+ "Tidak Ada ");
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }

    public String toString(){
        String namaB =" ";
        String namaP =" ";
        boolean kosong1 = penumpangBiasa.isEmpty();
        boolean kosong2 = penumpangPrioritas.isEmpty();

        for(Penumpang penumpang : penumpangBiasa){
            namaB += penumpang.getNama().toString();
        }
        for(Penumpang penumpang : penumpangPrioritas){
            namaP += penumpang.getNama().toString();
        }

        if(kosong1 == true){
            System.out.println("Penumpang biasa : kosong");
        }
        else{
            System.out.println("Penumpang biasa : " +namaB);
        }

        if(kosong2 == true){
            System.out.println("Penumpang prioritas : kosong");
        }
        else{
            System.out.println("Penumpang prioritas : " +namaP);
        }

        return "Penumpang biasa = "+namaB+ "Penumpang prioritas = "+namaP+ "total semua penumpang = "+getJumlahpenumpang()+"\n";
    }
}