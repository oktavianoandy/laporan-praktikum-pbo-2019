package jti.polinema.relasiclass.percobaan2_1841720002Andy;

public class Sopir1841720002Andy {

    private String mNama;
    private int mBiaya;

    public Sopir1841720002Andy() {

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

    public int HitungBiayaSopirAndy(int mHari) {
        return mBiaya * mHari;
    }

}
