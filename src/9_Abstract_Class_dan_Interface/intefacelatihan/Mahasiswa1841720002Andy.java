package intefacelatihan;

public class Mahasiswa1841720002Andy {

    protected String mNama;

    public Mahasiswa1841720002Andy(String mNama) {
        this.mNama = mNama;
    }

    public void kuliahDikampusAndy() {
        System.out.println("Aku mahasiswa, namaku " + this.mNama);
        System.out.println("Aku berkuliah di kampus.");
    }
    
    public void lulusAndy() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    public void meraihIPKTinggiAndy() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
