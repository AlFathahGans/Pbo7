import java.util.Scanner;
import java.text.DecimalFormat;
public class Koperasi
{
    // instance variables - replace the example below with your own
    public String nik,nama;
    public int usia,bulan;
    private double jumlah_pinjam, jumlah_angsuran;

    double getPinjaman(){
        if(usia < 20){
            jumlah_pinjam = 2000000;
        }else if(usia >= 20){
            jumlah_pinjam = 3000000;
        }else{
            jumlah_pinjam = 1000000;
        }
        
        return jumlah_pinjam;
    }
    
    double getAngsuran(){
        if(bulan < 3){
            jumlah_angsuran = 500000;
        }else if(bulan <= 12){
            jumlah_angsuran = 250000;
        }else{
            jumlah_angsuran = 550000;
        }
        
        return jumlah_angsuran;
    }
    
    void cetak(){
        DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println("----- Detail Pinjaman -----");
        System.out.println("NIK: "+ this.nik);
        System.out.println("Nama: "+ this.nama);
        System.out.println("Usia: "+ this.usia);
        System.out.println("Bulan: "+ this.bulan);
        System.out.println("Jumlah Pinjaman: "+ df.format(getPinjaman()));
        System.out.println("Jumlah Angsuran: "+ df.format(getAngsuran()));
    }
}

class MainKoperasi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Koperasi k = new Koperasi();
        
        System.out.println("NIK: ");
        k.nik = sc.next();
        
        System.out.println("Nama: ");
        k.nama = sc.next();
        
        System.out.println("Usia: ");
        k.usia = sc.nextInt();
        
        System.out.println("Bulan: ");
        k.bulan = sc.nextInt();
        
        k.cetak();

    }
}
