package jti.polinema.inheritance.percobaan5._1841720002andy;

public class Karyawan1841720002Andy {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1841720002Andy() {
    }

    public Karyawan1841720002Andy(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawanAndy() {
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jenis Kelamin   : " + jk);
        System.out.println("Umur            : " + umur);
        System.out.println("Gaji            : " + gaji);
    }
}
