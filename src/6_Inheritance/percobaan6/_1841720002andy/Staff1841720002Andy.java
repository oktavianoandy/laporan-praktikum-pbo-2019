package jti.polinema.inheritance.percobaan6._1841720002andy;

public class Staff1841720002Andy extends Karyawan1841720002Andy {

    public int lembur, potongan;

    public Staff1841720002Andy() {

    }

    public Staff1841720002Andy(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan) {
        super(mNama, mAlamat, mJk, mUmur, mGaji);
        this.lembur = mLembur;
        this.potongan = mPotongan;
    }

    public void tampilDataStaffAndy() {
        super.tampilDataKaryawanAndy();
        System.out.println("Lembur          : " + lembur);
        System.out.println("Potongan        : " + potongan);
        System.out.println("Total Gaji      : " + (gaji + lembur - potongan));
    }
}
