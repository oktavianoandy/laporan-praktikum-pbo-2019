package jti.polinema.tugas1._1841720002andy;

public class Segitiga1841720002Andy {

    private int mSudut;
    
    public int totalSudutAndy(int mSudutA){
        return this.mSudut = 180 - mSudutA;
    }
    
    public int totalSudutAndy(int mSudutA, int mSudutB){
        return this.mSudut = 180 - (mSudutA + mSudutB);
    }
    
    public int kelilingAndy(int mSisiA, int mSisiB, int mSisiC){
        return mSisiA + mSisiB + mSisiC;
    }
    
    public double kelilingAndy(int mSisiA, int mSisiB){
        return Math.sqrt(mSisiA) + Math.sqrt(mSisiB);
    }
    
}
