public class Menejer extends Pegawai { 
 private String departemen;
 
 public Menejer(String nama, double gaji, String departemen) 
 {
  super(nama, gaji);
  this.departemen = departemen;
 } 
 
 public void setDepartemen(String departemen)
 {
  this.departemen = departemen; 
 }
 
 public String getDepartemen() 
 {
  return this.departemen;
 }
} 

/**
merupakan turun dari class pegawai
*/