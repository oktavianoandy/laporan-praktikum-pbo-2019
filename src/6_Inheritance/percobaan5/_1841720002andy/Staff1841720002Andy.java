package jti.polinema.inheritance.percobaan5._1841720002andy;

public class Staff1841720002Andy extends Karyawan1841720002Andy {

    public int lembur, potongan;

    public Staff1841720002Andy() {

    }

    public Staff1841720002Andy(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaffAndy() {
        super.tampilDataKaryawanAndy();
        System.out.println("Lembur          : " + lembur);
        System.out.println("Potongan        : " + potongan);
        System.out.println("Total Gaji      : " + (gaji + lembur - potongan));
    }
}
