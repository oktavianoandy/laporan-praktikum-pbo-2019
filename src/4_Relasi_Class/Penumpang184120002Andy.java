package jti.polinema.relasiclass.percobaan4_1841720002Andy;

public class Penumpang184120002Andy {

    private String mKtp;
    private String mNama;

    public Penumpang184120002Andy(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getKtpAndy() {
        return mKtp;
    }

    public void setKtpAndy(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public String infoAndy() {
        String mInfo = "";
        mInfo += "Ktp: " + mKtp + "\n";
        mInfo += "Nama: " + mNama + "\n";
        return mInfo;
    }

}
