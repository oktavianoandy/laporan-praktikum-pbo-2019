package intefacelatihan;

public class Sarjana1841720002Andy extends Mahasiswa1841720002Andy implements ICumlaude1841720002Andy, IBerprestasi1841720002Andy{

    public Sarjana1841720002Andy(String mNama) {
        super(mNama);
    }

    @Override
    public void lulusAndy() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiAndy() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    //penambahan pada percobaan 3   
    @Override
    public void menjuaraiKompetisiAndy() {
         System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }
    //penambahan pada percobaan 3
    @Override
    public void membuatPublikasiIlmiahAndy() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
    
}
