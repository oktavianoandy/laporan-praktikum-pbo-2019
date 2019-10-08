package jti.polinema.inheritance.percobaan6._1841720002andy;

public class Karyawan1841720002Andy {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1841720002Andy() {
    }

    public Karyawan1841720002Andy(String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        this.nama = mNama;
        this.alamat = mAlamat;
        this.jk = mJk;
        this.umur = mUmur;
        this.gaji = mGaji;
    }

    public void tampilDataKaryawanAndy() {
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jenis Kelamin   : " + jk);
        System.out.println("Umur            : " + umur);
        System.out.println("Gaji            : " + gaji);
    }
}
