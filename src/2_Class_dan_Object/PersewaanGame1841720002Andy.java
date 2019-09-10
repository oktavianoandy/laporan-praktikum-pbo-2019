package persewaangame;

public class PersewaanGame1841720002Andy 
{
    private int mIdMember;
    private String mNamaMember;
    private String mNamaGame;
    private int mHargaGame;
    private int mLamaPinjamGame;
    
    public PersewaanGame1841720002Andy(int mIdMember, String mNamaMember, String mNamaGame, int mHargaGame, int mLamaPinjamGame) 
    {
        this.mIdMember = mIdMember;
        this.mNamaMember = mNamaMember;
        this.mNamaGame = mNamaGame;
        this.mHargaGame = mHargaGame;
        this.mLamaPinjamGame = mLamaPinjamGame;
    }

    public int totalHargaSewaGameAndy()
    {
        int mTotalHargaSewa = mHargaGame*mLamaPinjamGame;
        return mTotalHargaSewa;
    }
    
    public void tampilDataSewaGameAndy()
    {
        System.out.println("Id Member \t\t: " + mIdMember);
        System.out.println("Nama Member \t\t: " + mNamaMember);
        System.out.println("Nama Game \t\t: " + mNamaGame);
        System.out.println("Harga Game \t\t: " + mHargaGame);
        System.out.println("Lama Pinjam Game \t: " + mLamaPinjamGame +" hari");
        System.out.println("Total Harga Sewa \t: " +totalHargaSewaGameAndy());
    }
}
