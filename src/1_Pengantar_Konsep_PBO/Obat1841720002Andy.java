package tugas1;

public class Obat1841720002Andy 
{
    private String mNamaObat;
    private int mStok,mHarga;
    
    public void setNamaObatAndy(String newValue)
    {
        mNamaObat = newValue;
    }
    
    public void setStokAndy (int newValue)
    {
        mStok = newValue;
    }
    
    public void setHargaAndy(int newValue)
    {
        mHarga = newValue;
    }
    
    public void tambahStokAndy(int increment)
    {
        mStok = mStok + increment;
    }
    
    public void kurangiStokAndy(int decrement)
    {
        mStok = mStok - decrement;
    }
    
    public void cetakObatAndy()
    {
        System.out.println("");
        System.out.println("Nama obat \t: "+mNamaObat);
        System.out.println("Stok \t\t: "+mStok);
        System.out.println("Harga \t\t: "+mHarga);
    }
}
