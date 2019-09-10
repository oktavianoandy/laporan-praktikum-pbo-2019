package barang;

public class Barang1841720002Andy 
{
    public String namaBarang;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangAndy()
    {
        System.out.println("Nama Barang  : "+namaBarang);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok         : "+stok);
        
    }
    
    //method dengan argumen dan nilai balik (return)
    public int tambahStokAndy(int brgMasuk)
    {
        int mStokBaru = brgMasuk + stok;
        return mStokBaru;
    }
}
