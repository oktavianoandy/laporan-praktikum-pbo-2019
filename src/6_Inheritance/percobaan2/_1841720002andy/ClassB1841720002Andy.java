package jti.polinema.inheritance.percobaan2._1841720002andy;

public class ClassB1841720002Andy extends ClassA1841720002Andy{

    private int mZ;

    public void setZAndy(int mZ) {
        this.mZ = mZ;
    }

    public void getNilaiZAndy() {
        System.out.println("Nilai mZ : " + mZ);
    }

    public void getJumlahAndy() {
        System.out.println("Jumlah : " + (super.getXAndy() + super.getYAndy() + mZ));
    }
    
}
