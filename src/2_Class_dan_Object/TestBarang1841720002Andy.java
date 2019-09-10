package barang;

public class TestBarang1841720002Andy 
{
    public static void main(String[] args) 
    {
        Barang1841720002Andy brg1 = new Barang1841720002Andy();
        brg1.namaBarang = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangAndy();
        
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok baru adalah "+brg1.tambahStokAndy(20));
    }
}
