package jti.polinema.inheritance.tugas._1841720002andy;

public class Komputer1841720002Andy {

    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    Komputer1841720002Andy() {

    }

    public Komputer1841720002Andy(String mMerk, int mKecProcesor, int mSizeMemory, String mJnsProsesor) {
        this.merk = mMerk;
        this.kecProsesor = mKecProcesor;
        this.sizeMemory = mSizeMemory;
        this.jnsProsesor = mJnsProsesor;
    }

    public void tampilDataAndy() {
        System.out.println("Merk : " + merk);
        System.out.println("Kecepatan Processor : " + kecProsesor);
        System.out.println("Size Memory : " + sizeMemory);
        System.out.println("Jenis Processor : " + jnsProsesor);
    }
}
