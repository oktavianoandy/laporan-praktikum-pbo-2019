package jti.polinema.relasiclass.percobaan3_1841720002Andy;

public class KeretaApi1841720002Andy {

    private String mNama;
    private String mKelas;
    private Pegawai1841720002Andy mMasinis;
    private Pegawai1841720002Andy mAsisten;

    public KeretaApi1841720002Andy(String mNama, String mKelas, Pegawai1841720002Andy mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720002Andy(String mNama, String mKelas, Pegawai1841720002Andy mMasinis, Pegawai1841720002Andy mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public String getKelasAndy() {
        return mKelas;
    }

    public void setKelasAndy(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720002Andy getMasinisAndy() {
        return mMasinis;
    }

    public void setMasinisAndy(Pegawai1841720002Andy mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720002Andy getAsistenAndy() {
        return mAsisten;
    }

    public void setAsisten(Pegawai1841720002Andy mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String infoAndy() {
        String info = "";
        if (this.mAsisten != null) {
            info += "Nama: " + this.mNama + "\n";
            info += "Kelas: " + this.mKelas + "\n";
            info += "Masinis: " + this.mMasinis.infoAndy() + "\n";
            info += "Asisten: " + this.mAsisten.infoAndy() + "\n";
        } else {
            info += "Nama: " + this.mNama + "\n";
            info += "Kelas: " + this.mKelas + "\n";
            info += "Masinis: " + this.mMasinis.infoAndy() + "\n";
        }
        return info;
    }

}
