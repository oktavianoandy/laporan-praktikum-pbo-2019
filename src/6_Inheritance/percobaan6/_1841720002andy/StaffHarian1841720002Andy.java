package jti.polinema.inheritance.percobaan6._1841720002andy;

public class StaffHarian1841720002Andy extends Staff1841720002Andy {

    public int jmlJamKerja;

    public StaffHarian1841720002Andy() {

    }

    public StaffHarian1841720002Andy(String mNama, String mAlamat,
            String mJk, int mUmur, int mGaji, int mLembur, int mPotongan, int mJmlJamKerja) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.jmlJamKerja = mJmlJamKerja;
    }

    public void tampilStaffHarianAndy() {
        System.out.println("===============Data Staff Harian===============");
        super.tampilDataStaffAndy();
        System.out.println("Jumlah Jam Kerja    : " + jmlJamKerja);
        System.out.println("Gaji Bersih         : " + (gaji * jmlJamKerja + lembur - potongan));
    }
}
