package jti.polinema.inheritance.tugas._1841720002andy;

public class Leptop1841720002Andy extends Komputer1841720002Andy {

    public String jnsBatrei;

    Leptop1841720002Andy() {

    }

    public Leptop1841720002Andy(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor
            , String mJnsBatrei) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.jnsBatrei = mJnsBatrei;
    }

    public void tampilLeptopAndy() {
        super.tampilDataAndy();
        System.out.println("Jenis Batrai : " + jnsBatrei);
    }
}
