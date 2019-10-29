package pbominggu9.abstractclass;

public class Orang1841720002Andy {

    private String mNama;
    private Hewan1841720002Andy mHewanPeliharaan;

    public Orang1841720002Andy(String mNama) {
        this.mNama = mNama;
    }
    
    public void peliharaanHewanAndy(Hewan1841720002Andy mHewanPeliharaan){
        this.mHewanPeliharaan = mHewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanAndy(){
        System.out.println("Namaku "+this.mNama);
        System.out.println("Hewan peliharaanku berlajan dengan cara :");
        this.mHewanPeliharaan.bergerakAndy();
        System.out.println("-----------------------------------------");
    }
    
}
