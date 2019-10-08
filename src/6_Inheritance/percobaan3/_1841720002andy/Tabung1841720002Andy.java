package jti.polinema.inheritance.percobaan3._1841720002andy;

public class Tabung1841720002Andy extends Bangun1841720002Andy {

    protected int mT;

    public void setSuperPhiAndy(double mPhi) {
        super.mPhi = mPhi;
    }

    public void setSuperRAndy(int mR) {
        super.mR = mR;
    }

    public void setTAndy(int mT) {
        this.mT = mT;
    }

    public void volumeAndy() {
        System.out.println("Volume Tabung adalah : " + (super.mPhi * super.mR * super.mR * this.mT));
    }
}
