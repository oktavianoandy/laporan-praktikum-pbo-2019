package jti.polinema.inheritance.percobaan6._1841720002andy;

public class StaffTetap1841720002Andy extends Staff1841720002Andy {

    public String golongan;
    public int asuransi;

    public StaffTetap1841720002Andy() {

    }

    public StaffTetap1841720002Andy(String mNama, String mAlamat, String mJk, int mUmur, int mGaji,
            int mLembur, int mPotongan, String mGolongan, int mAsuransi) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mPotongan, mLembur);
        this.golongan = mGolongan;
        this.asuransi = mAsuransi;
    }

    public void tampilStaffTetapAndy() {
        System.out.println("===============Data Staff Tetap===============");
        super.tampilDataStaffAndy();
        System.out.println("Golongan            : " + golongan);
        System.out.println("Jumlah Asuransi     : " + asuransi);
        System.out.println("Gaji Bersih         : " + (gaji + lembur - potongan - asuransi));
    }
}
