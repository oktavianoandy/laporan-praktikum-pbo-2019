package jti.polinema.relasiclass.percobaan1_1841720002Andy;

public class Laptop1841720002Andy {

    private String mMerk;
    private Processor1841720002Andy mProc;

    public Laptop1841720002Andy() {
        
    }
    
    public Laptop1841720002Andy(String mMerk, Processor1841720002Andy proc) {
        this.mMerk = mMerk;
        this.mProc = proc;
    }

    public String getMerkAndy() {
        return mMerk;
    }

    public void setMerkAndy(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720002Andy getProcAndy() {
        return mProc;
    }

    public void setProcAndy(Processor1841720002Andy proc) {
        this.mProc = proc;
    }
    
    public void infoLaptopAndy() {
        System.out.println("Merk Laptop = " + mMerk);
        mProc.infoProcessorAndy();
    }

}
