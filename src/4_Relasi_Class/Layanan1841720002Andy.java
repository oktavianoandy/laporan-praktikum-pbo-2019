package jti.polinema.relasiclass.tugas_1841720002Andy;

public class Layanan1841720002Andy {

    private String mNamaLayanan;
    private int mHargaLayanan;

    public Layanan1841720002Andy(String mNamaLayanan, int mHargaLayanan) {
        this.mNamaLayanan = mNamaLayanan;
        this.mHargaLayanan = mHargaLayanan;
    }

    public String getNamaLayananAndy() {
        return mNamaLayanan;
    }

    public void setNamaLayananAndy(String mNamaLayanan) {
        this.mNamaLayanan = mNamaLayanan;
    }

    public int getHargaLayananAndy() {
        return mHargaLayanan;
    }

    public void setHargaLayananAndy(int mHargaLayanan) {
        this.mHargaLayanan = mHargaLayanan;
    }

    public void printLayananAndy() {
        System.out.println("Nama layanan \t\t: " + mNamaLayanan);
        System.out.println("Biaya layanan \t\t: " + mHargaLayanan);
    }
}
