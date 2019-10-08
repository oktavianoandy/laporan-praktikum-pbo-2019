package jti.polinema.inheritance.tugas._1841720002andy;

public class Windows1841720002Andy extends Leptop1841720002Andy {

    public String fitur;

    Windows1841720002Andy() {

    }

    public Windows1841720002Andy(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrei
            , String mFitur) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrei);
        this.fitur = mFitur;
    }

    public void tampilWindowsAndy() {
        super.tampilLeptopAndy();
        System.out.println("Fitur : " + fitur);
    }
}
