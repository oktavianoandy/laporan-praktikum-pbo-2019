package jti.polinema.inheritance.tugas._1841720002andy;

public class Mac1841720002Andy extends Leptop1841720002Andy {

    public String security;

    Mac1841720002Andy() {

    }

    public Mac1841720002Andy(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrei
            , String mSecurity) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrei);
        this.security = mSecurity;
    }

    public void tampilMacAndy() {
        super.tampilLeptopAndy();
        System.out.println("Security : " + security);
    }
}
