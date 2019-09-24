package jti.polinema.relasiclass.tugas_1841720002Andy;

public class MainTugas1841720002Andy {

    public static void main(String[] args) {
        Komputer1841720002Andy komputer1 = new Komputer1841720002Andy(1);
        Pengguna1841720002Andy pengguna1 = new Pengguna1841720002Andy("Andy");
        PaketInternet1841720002Andy paketInternet1 = new PaketInternet1841720002Andy(2);
        Layanan1841720002Andy layanan1 = new Layanan1841720002Andy("Tidak ada", 0);
        
        Transaksi1841720002Andy transaksi1 = new Transaksi1841720002Andy(1001);
        transaksi1.setKomputerAndy(komputer1);
        transaksi1.setPenggunaAndy(pengguna1);
        transaksi1.setPaketAndy(paketInternet1);
        transaksi1.setLayananAndy(layanan1);
        transaksi1.totalBiayaAkhirAndy();
        transaksi1.printTransaksiAndy();
    }
}
