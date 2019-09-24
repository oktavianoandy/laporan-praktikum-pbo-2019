package jti.polinema.relasiclass.tugas_1841720002Andy;

public class Transaksi1841720002Andy {

    private int mKodeTransaksi;
    private Komputer1841720002Andy mKomputer;
    private Pengguna1841720002Andy mPengguna;
    private Layanan1841720002Andy mLayanan;
    private PaketInternet1841720002Andy mPaket;

    public Transaksi1841720002Andy(int mKodeTransaksi) {
        this.mKodeTransaksi = mKodeTransaksi;
    }

    public int getKodeTransaksiAndy() {
        return mKodeTransaksi;
    }

    public void setKodeTransaksiAndy(int mKodeTransaksi) {
        this.mKodeTransaksi = mKodeTransaksi;
    }

    public Komputer1841720002Andy getKomputerAndy() {
        return mKomputer;
    }

    public void setKomputerAndy(Komputer1841720002Andy mKomputer) {
        this.mKomputer = mKomputer;
    }

    public Pengguna1841720002Andy getPenggunaAndy() {
        return mPengguna;
    }

    public void setPenggunaAndy(Pengguna1841720002Andy mPengguna) {
        this.mPengguna = mPengguna;
    }

    public Layanan1841720002Andy getLayananAndy() {
        return mLayanan;
    }

    public void setLayananAndy(Layanan1841720002Andy mLayanan) {
        this.mLayanan = mLayanan;
    }

    public PaketInternet1841720002Andy getPaketAndy() {
        return mPaket;
    }

    public void setPaketAndy(PaketInternet1841720002Andy mPaket) {
        this.mPaket = mPaket;
    }
    
    public int totalBiayaAkhirAndy(){
        return mLayanan.getHargaLayananAndy() + mPaket.totalBiayaPaketAndy();
    }
    
    public void printTransaksiAndy(){
        System.out.println("Kode Transaksi \t\t: " + mKodeTransaksi);
        System.out.println("==========================================");
        System.out.println("Informasi Komputer\n");
        mKomputer.printInfoKomputerAndy();
        System.out.println("==========================================");
        System.out.println("Informasi Pengguna\n");
        mPengguna.printInfoPenggunaAndy();
        System.out.println("==========================================");
        System.out.println("Informasi Paket & Biaya\n");
        mPaket.printInfoPaketAndy();
        System.out.println("==========================================");
        System.out.println("Informasi Layanan & Biaya\n");
        mLayanan.printLayananAndy();
        System.out.println("==========================================");
        System.out.println("Biaya Total \t\t: " + totalBiayaAkhirAndy());
        System.out.println("==========================================");
    }
}
