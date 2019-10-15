package jti.polinema.percobaan1._1841720002andy;

public class Karyawan1841720002Andy {

    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public String getNipAndy() {
        return mNip;
    }

    public void setNipAndy(String mNip) {
        this.mNip = mNip;
    }

    public String getGolonganAndy() {
        return mGolongan;
    }

    public void setGolonganAndy(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public double getGajiAndy() {
        return mGaji;
    }

    public void setGajiAndy(double mGaji) {
        this.mGaji = mGaji;
    }

}
