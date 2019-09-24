package jti.polinema.relasiclass.percobaan2_1841720002Andy;

public class Mobil1841720002Andy {

    private String mNama;
    private int mBiaya;

    public Mobil1841720002Andy() {

    }

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public int getBiayaAndy() {
        return mBiaya;
    }

    public void setBiayaAndy(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public int hitungBiayaMobilAndy(int mHari) {
        return mBiaya * mHari;
    }

}
