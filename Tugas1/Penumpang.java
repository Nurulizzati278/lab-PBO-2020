public class Penumpang{
   private String nama;
   private int id;
   private int umur;
   private boolean hamil;
   private int saldo;
   
   public Penumpang(String nama, int id, int umur, boolean hamil, int saldo){
      this.nama = nama;
      this.id = id;
      this.umur = umur;
      this.hamil = hamil;
      saldo = 10000;
    }
    
    public String getNama(){
      return this.nama;
    }

    public int getId(){
      return this.id;
    }
    
    public int getUmur(){
      return this.umur;
    }
    
    public boolean getHamil(){
      return this.hamil;
    }

    public int getSaldo(){
      return this.saldo;
    }

    public int tambahSaldo(int saldobaru){
      saldobaru += saldo;
      return saldobaru;
    }

    public void kurangiSaldo(int ongkos){
      saldo -= ongkos;
    }

}