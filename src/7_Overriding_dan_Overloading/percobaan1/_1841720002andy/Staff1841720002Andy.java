package jti.polinema.percobaan1._1841720002andy;

public class Staff1841720002Andy extends Karyawan1841720002Andy {

    private int mLembur;
    private double mGajiLembur;

    public int getLemburAndy() {
        return mLembur;
    }

    public void setLemburAndy(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getGajiLemburAndy() {
        return mGajiLembur;
    }

    public void setGajiLemburAndy(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getGajiAndy(int mLembur, double mGajiLembur) {
        return super.getGajiAndy() + mLembur * mGajiLembur;
    }

    @Override
    public double getGajiAndy() {
        return super.getGajiAndy() + mLembur * mGajiLembur;
    }

    public void lihatInfoAndy() {
        System.out.println("NIP : " + this.getNipAndy());
        System.out.println("Nama : " + this.getNamaAndy());
        System.out.println("Golongan : " + this.getGolonganAndy());
        System.out.println("Jml Lembur : " + this.getLemburAndy());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLemburAndy());
        System.out.printf("Gaji : %.0f\n", this.getGajiAndy());
        System.out.println("");
    }
}
