package intefacelatihan;

public class Rektor1841720002Andy {
    

    public void beriSetifikatCumlaudeAndy(ICumlaude1841720002Andy mMahasiswa1, Mahasiswa1841720002Andy mMahasiswa2) {
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selemat ! silahkan perkenalkan diri Anda...");
        mMahasiswa2.kuliahDikampusAndy();
        mMahasiswa1.lulusAndy();
        mMahasiswa1.meraihIPKTinggiAndy();
        System.out.println("--------------------------------------------");
    }

    //penambahan pada percobaan 3
    public void beriSetifikatMawapresAndy(IBerprestasi1841720002Andy mMahasiwa) {
        System.out.println("Saya Rektor, memberikan sertifikat MAWAPRES.");
        System.out.println("Selemat ! Bagaimana Anda bisa berprestasi?");
        mMahasiwa.menjuaraiKompetisiAndy();
        mMahasiwa.membuatPublikasiIlmiahAndy();
        System.out.println("--------------------------------------------");
    }

}
