package jti.polinema.percobaan1._1841720002andy;

public class Manager1841720002Andy extends Karyawan1841720002Andy {

    private double mTunjangan;
    private String mBagian;
    private Staff1841720002Andy mSt[];

    public double getTunjanganAndy() {
        return mTunjangan;
    }

    public void setTunjanganAndy(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getBagianAndy() {
        return mBagian;
    }

    public void setBagianAndy(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setStAndy(Staff1841720002Andy[] mSt) {
        this.mSt = mSt;
    }

    public void viewStaffAndy() {
        int i;
        System.out.println("----------------------");
        for (i = 0; i < mSt.length; i++) {
            mSt[i].lihatInfoAndy();
        }
        System.out.println("----------------------");
    }

    public void lihatInfoAndy() {
        System.out.println("Manager : " + this.getBagianAndy());
        System.out.println("NIP : " + this.getNipAndy());
        System.out.println("Nama : " + this.getNamaAndy());
        System.out.println("Golongan : " + this.getGolonganAndy());
        System.out.printf("Tunjangan : %.0f\n", this.getTunjanganAndy());
        System.out.printf("Gaji : %.0f\n", this.getGajiAndy());
        System.out.println("Bagian : " + this.getBagianAndy());
        this.viewStaffAndy();
    }

    @Override
    public double getGajiAndy() {
        return super.getGajiAndy()+mTunjangan;
    }
    
}
