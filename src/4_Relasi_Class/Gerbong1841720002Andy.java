package jti.polinema.relasiclass.percobaan4_1841720002Andy;

public class Gerbong1841720002Andy {

    private String mKode;
    private Kursi1841720002Andy[] mArrayKursi;

    public Gerbong1841720002Andy(String mKode, int mJumlah) {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1841720002Andy[mJumlah];
        this.mNomorKursi = new int[mJumlah];
        this.initKursiAndy();
    }

    private void initKursiAndy() {
        for (int i = 0; i < mArrayKursi.length; i++) {
            this.mArrayKursi[i] = new Kursi1841720002Andy(String.valueOf(i + 1));
        }
    }

    public String getmKodeAndy() {
        return mKode;
    }

    public void setmKodeAndy(String mKode) {
        this.mKode = mKode;
    }
    
    //penambahan method baru untuk pertanyaan nomor 5
    public boolean isKursiKosongAndy(int mNomor) {
        return mArrayKursi[mNomor - 1].getPenumpang() == null;
    }
    
    //penambahan method baru untuk pertanyaan nomor 5
    public void setPenumpangAndy(Penumpang184120002Andy mPenumpang, int mNomor) {
        if (isKursiKosongAndy(mNomor) == true) {
            this.mArrayKursi[mNomor - 1].setPenumpangAndy(mPenumpang);
        } else {
            System.out.println("Maaf, kursi " + mNomor + " sudah terisi. Silahkan pilih yang lain\n");
        }
    }

    public Kursi1841720002Andy[] getArrayKursiAndy() {
        return mArrayKursi;
    }

    public String infoAndy() {
        String mInfo = "";
        mInfo += "Kode: " + mKode + "\n";
        for (Kursi1841720002Andy mKursi : mArrayKursi) {
            mInfo += mKursi.infoAndy();
        }
        return mInfo;
    }

}
