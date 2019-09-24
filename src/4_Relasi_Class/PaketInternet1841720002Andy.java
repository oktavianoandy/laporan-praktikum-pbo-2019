package jti.polinema.relasiclass.tugas_1841720002Andy;

public class PaketInternet1841720002Andy {

    private int mKodePaket;
    private String mNamaPaket;
    private int mHargaPaket;
    private int mJam;

    public PaketInternet1841720002Andy(int mKodePaket) {
        this.mKodePaket = mKodePaket;
        initKodePaketInternetAndy();
    }

    public void initKodePaketInternetAndy() {
        switch (mKodePaket) {
            case 0:
                mNamaPaket = "Regular";
                mHargaPaket = 2000;
                setJamAndy(mJam);
                break;
            case 1:
                mNamaPaket = "Paket 1 Jam";
                mHargaPaket = 1500;
                break;
            case 2:
                mNamaPaket = "Paket 2 Jam";
                mHargaPaket = 2500;
                break;
            case 3:
                mNamaPaket = "Pake 3 jam";
                mHargaPaket = 3500;
                break;
            case 4:
                mNamaPaket = "Pake 4 jam";
                mHargaPaket = 4500;
                break;
            case 5:
                mNamaPaket = "Pake 5 jam";
                mHargaPaket = 6500;
                break;
            default:
                System.out.println("Pilihan pake salah!");
                break;
        }
    }

    public void setJamAndy(int mJam) {
        this.mJam = mJam;
    }

    public int totalBiayaPaketAndy() {
        if (mKodePaket == 0) {
            return mHargaPaket * mJam;
        } else {
            return mHargaPaket;
        }
    }

    public void printInfoPaketAndy() {
        System.out.println("Nama paket \t\t: " + mNamaPaket);
        System.out.println("Total biaya paket \t: " + totalBiayaPaketAndy());
    }
}
