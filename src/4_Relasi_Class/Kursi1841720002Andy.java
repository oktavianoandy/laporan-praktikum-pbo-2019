package jti.polinema.relasiclass.percobaan4_1841720002Andy;

public class Kursi1841720002Andy {

    private String mNomor;
    private Penumpang184120002Andy mPenumpang;

    public Kursi1841720002Andy(String mNomor) {
        this.mNomor = mNomor;
    }

    public String getNomorAndy() {
        return mNomor;
    }

    public void setNomorAndy(String mNomor) {
        this.mNomor = mNomor;
    }

    public Penumpang184120002Andy getPenumpang() {
        return mPenumpang;
    }

    public void setPenumpangAndy(Penumpang184120002Andy mPenumpang) {
        this.mPenumpang = mPenumpang;
    }

    public String infoAndy() {
        String mInfo = "";
        mInfo += "Nomor: " + mNomor + "\n";
        if (this.mPenumpang != null) {
            mInfo += "Penumpang: " + mPenumpang.infoAndy() + "\n";
        }
        return mInfo;
    }
    
}
