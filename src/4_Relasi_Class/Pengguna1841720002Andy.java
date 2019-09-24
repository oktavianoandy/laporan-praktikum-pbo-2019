package jti.polinema.relasiclass.tugas_1841720002Andy;

public class Pengguna1841720002Andy {

    private String mNamaPengguna;

    public Pengguna1841720002Andy(String mNamaPengguna) {
        this.mNamaPengguna = mNamaPengguna;
    }

    public String getNamaPenggunaAndy() {
        return mNamaPengguna;
    }

    public void setNamaPenggunaAndy(String mNamaPengguna) {
        this.mNamaPengguna = mNamaPengguna;
    }
    
    public void printInfoPenggunaAndy(){
        System.out.println("User \t\t\t: " + mNamaPengguna);
    }
}
