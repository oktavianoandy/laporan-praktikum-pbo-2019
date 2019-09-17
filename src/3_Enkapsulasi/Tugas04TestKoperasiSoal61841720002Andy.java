package jti.polinema.jobsheet03tugas041841720002andy;
import java.util.Scanner;
public class Tugas04TestKoperasiSoal61841720002Andy {
    
    public static void main(String[] args) {
        Tugas04AnggotaKoperasi1841720002Andy anggota = new Tugas04AnggotaKoperasi1841720002Andy();
        Scanner scString = new Scanner (System.in);
        Scanner scInt = new Scanner (System.in);
        
        System.out.print("Masukkan ktp anggota \t\t: ");
        anggota.setmKtpAndy(scString.nextLine());
        System.out.print("Masukkan nama anggota \t\t: ");
        anggota.setmNamaAnggotaAndy(scString.nextLine());
        System.out.print("Masukkan limit pinjaman \t: ");
        anggota.setmLimitPinjamanAndy(scString.nextInt());
        do {            
            System.out.println("============================================================================");
            System.out.print("Masukkan jumlah pinjaman \t: ");
            anggota.setmJumlahPinjamanAndy(scInt.nextInt());
            System.out.println("Jumlah pinjaman saat ini \t: " + anggota.getmJumlahPinjamanAndy());
        } while (anggota.getmJumlahPinjamanAndy()==0);
        do {
            System.out.println("============================================================================");
            System.out.print("Masukkan jumlah angsuran \t: ");
            anggota.angsurPinjamanAndy(scInt.nextInt());
            System.out.println("Jumlah pinjaman saat ini \t: " + anggota.getmJumlahPinjamanAndy());;
        } while (anggota.getmJumlahPinjamanAndy()!=0);
    }
}
