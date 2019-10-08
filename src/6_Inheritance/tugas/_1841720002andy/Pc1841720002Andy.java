package jti.polinema.inheritance.tugas._1841720002andy;

public class Pc1841720002Andy extends Komputer1841720002Andy {

    public int ukuranMonitor;

    Pc1841720002Andy() {

    }

    public Pc1841720002Andy(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor
            , int mUkuranMonitor) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.ukuranMonitor = mUkuranMonitor;
    }

    public void tampilPcAndy() {
        super.tampilDataAndy();
        System.out.println("Ukuran Monitor : " + ukuranMonitor);
    }
}
