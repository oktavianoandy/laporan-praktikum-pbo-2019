package jti.polinema.jobsheet03tugas041841720002andy;

public class Tugas04AnggotaKoperasi1841720002Andy {

    private String mKtp;
    private String mNamaAnggota;
    private int mLimitPinjaman;
    private int mJumlahPinjaman;

    /* Pada soal nomor 6 tidak membutuhkan konstruktor lagi
    
    public Tugas04AnggotaKoperasi1841720002Andy(String mKtp, StringmNamaAnggota, int mLimitPinjaman){
        this.mKtp = mKtp;
        this.mNamaAnggota = mNamaAnggota;
        this.mLimitPinjaman = mLimitPinjaman;
    }
    */

    public String getmKtpAndy() {
        return mKtp;
    }

    public void setmKtpAndy(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNamaAnggotaAndy() {
        return mNamaAnggota;
    }

    public void setmNamaAnggotaAndy(String mNamaAnggota) {
        this.mNamaAnggota = mNamaAnggota;
    }

    public int getmLimitPinjamanAndy() {
        return mLimitPinjaman;
    }

    public void setmLimitPinjamanAndy(int mLimitPinjaman) {
        this.mLimitPinjaman = mLimitPinjaman;
    }

    public int getmJumlahPinjamanAndy() {
        return mJumlahPinjaman;
    }

    public boolean isBolehPinjamAndy() {
        return mJumlahPinjaman <= mLimitPinjaman;
    }

    public void setmJumlahPinjamanAndy(int mJumlahPinjaman) {
        this.mJumlahPinjaman = mJumlahPinjaman;
        if (isBolehPinjamAndy() == false) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            this.mJumlahPinjaman = 0;
        }
    }

    public int getMinimalAngsurPinjamanAndy() {
        int mMinimalAngsur = (mJumlahPinjaman * 10) / 100;
        return mMinimalAngsur;
    }

    public boolean isMinimalAngsurPinjamanAndy(int mJumlahAngsur) {
        return mJumlahAngsur >= getMinimalAngsurPinjamanAndy();
    }

    public void angsurPinjamanAndy(int mJumlahAngsur) {
        if (isMinimalAngsurPinjamanAndy(mJumlahAngsur)) {
            mJumlahPinjaman -= mJumlahAngsur;
        }else{
            System.out.println("Maaf, jumlah angsuran harus minimal 10% jumlah peminjaman, "
                    + "senilai Rp. "+getMinimalAngsurPinjamanAndy());
        }
    }
}
