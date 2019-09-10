package mahasiswa;

public class TestMahasiswa1841720002Andy 
{
    public static void main(String[] args) 
    {
        Mahasiswa1841720002Andy mhs1 = new Mahasiswa1841720002Andy();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodataAndy();
        
        //Instansiasi 2 Object lagi pada percobaan 2 tahap ke 12.
        Mahasiswa1841720002Andy mhs2 = new Mahasiswa1841720002Andy();
        mhs2.nim = 2;
        mhs2.nama = "Andy";
        mhs2.alamat = "Jl. Tirto Utomo Gg.8 No.2";
        mhs2.kelas = "2D";
        mhs2.tampilBiodataAndy();
        
        Mahasiswa1841720002Andy mhs3 = new Mahasiswa1841720002Andy();
        mhs3.nim = 3;
        mhs3.nama = "Oktavian";
        mhs3.alamat = "Jl. Tirto Utomo Gg.8 No.3";
        mhs3.kelas = "2D";
        mhs3.tampilBiodataAndy();
    }
}
