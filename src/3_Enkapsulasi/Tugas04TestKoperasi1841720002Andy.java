package jti.polinema.jobsheet03tugas041841720002andy;

import java.util.Scanner;

public class Tugas04TestKoperasi1841720002Andy {

    public static void main(String[] args) {
        Tugas04AnggotaKoperasi1841720002Andy donny = new 
            Tugas04AnggotaKoperasi1841720002Andy("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getmNamaAnggotaAndy());
        System.out.println("Limit Pinjaman: " + donny.getmLimitPinjamanAndy());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.setmJumlahPinjamanAndy(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getmJumlahPinjamanAndy());
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.setmJumlahPinjamanAndy(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getmJumlahPinjamanAndy());
        System.out.println("\nMembayar angsuran 100.000");
        donny.angsurPinjamanAndy(100000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getmJumlahPinjamanAndy());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsurPinjamanAndy(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getmJumlahPinjamanAndy());
    }
}
