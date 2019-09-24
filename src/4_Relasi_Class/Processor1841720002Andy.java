package jti.polinema.relasiclass.percobaan1_1841720002Andy;

public class Processor1841720002Andy {

    private String mMerk;
    private double mCache;

    public Processor1841720002Andy() {

    }

    public Processor1841720002Andy(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }

    public String getMerkAndy() {
        return mMerk;
    }

    public void setMerkAndy(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getCacheAndy() {
        return mCache;
    }

    public void setCacheAndy(double mCache) {
        this.mCache = mCache;
    }

    public void infoProcessorAndy() {
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}
