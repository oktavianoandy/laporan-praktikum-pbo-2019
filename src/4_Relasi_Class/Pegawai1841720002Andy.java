package jti.polinema.relasiclass.percobaan3_1841720002Andy;

public class Pegawai1841720002Andy {

    private String mNip;
    private String mNama;

    public Pegawai1841720002Andy(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public String getNipAndy() {
        return mNip;
    }

    public void setNipAndy(String mNip) {
        this.mNip = mNip;
    }

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public String infoAndy() {
        String mInfo = "";
        mInfo += "Nip: " + this.mNip + "\n";
        mInfo += "Nama: " + this.mNama + "\n";
        return mInfo;
    }
}
