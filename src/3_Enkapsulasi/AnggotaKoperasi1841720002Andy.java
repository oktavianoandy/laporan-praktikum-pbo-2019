package jti.polinema.koperasigettersetter1841720002andy;

public class AnggotaKoperasi1841720002Andy {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;

    AnggotaKoperasi1841720002Andy(String mNama, String mAlamat) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mSimpanan = 0;
    }
    
    public void setmNamaAnggotaAndy(String mNama) {
        this.mNama = mNama;
    }

    public void setmAlamatAnggotaAndy(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmNamaAnggotaAndy() {
        return mNama;
    }

    public String getmAlamatAnggotaAndy() {
        return mAlamat;
    }

    public float getmSimpananAnggotaAndy() {
        return mSimpanan;
    }

    public void setorAnggotaAndy(float uang) {
        mSimpanan += uang;
    }

    public void pinjamAnggotaAndy(float uang) {
        mSimpanan -= uang;
    }
}
