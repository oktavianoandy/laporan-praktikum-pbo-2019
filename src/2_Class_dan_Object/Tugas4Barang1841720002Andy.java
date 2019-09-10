package barang;

public class Barang1841720002Andy 
{
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public Barang1841720002Andy(String kode, String namaBarang, int hargaDasar, float diskon) 
    {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }
    
    public int hitungHargaJualBarangAndy()
    {
        int mHargaJual = hargaDasar - (((int)diskon*hargaDasar)/100);
        return mHargaJual;
    }
    
    public void tampilDataBarangAndy()
    {
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : " + "Rp."+hargaDasar);
        System.out.println("Diskon      : " + (int)diskon +"%");
        System.out.println("Harga Jual  : " + "Rp."+hitungHargaJualBarangAndy());
    }
}
