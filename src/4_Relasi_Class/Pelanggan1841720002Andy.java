package jti.polinema.relasiclass.percobaan2_1841720002Andy;

public class Pelanggan1841720002Andy {

    private String mNama;
    private Mobil1841720002Andy mMobil;
    private Sopir1841720002Andy mSopir;
    private int mHari;

    public Pelanggan1841720002Andy() {
    
    }

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public Mobil1841720002Andy getMobilAndy() {
        return mMobil;
    }

    public void setMobilAndy(Mobil1841720002Andy mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720002Andy getSopirAndy() {
        return mSopir;
    }

    public void setSopirAndy(Sopir1841720002Andy mSopir) {
        this.mSopir = mSopir;
    }

    public int getHariAndy() {
        return mHari;
    }

    public void setHariAndy(int mHari) {
        this.mHari = mHari;
    }
    
    public int hitungBiayaTotalAndy(){
        return mMobil.hitungBiayaMobilAndy(mHari) 
                + mSopir.HitungBiayaSopirAndy(mHari);
    }
    
}
