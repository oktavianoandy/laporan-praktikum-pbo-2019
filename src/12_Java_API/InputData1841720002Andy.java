package andy.percobaan4;

import java.util.ArrayList;

public class InputData1841720002Andy {
    ArrayList<Mahasiswa1841720002Andy> mListMahasiswa;

    public InputData1841720002Andy() {
        this.mListMahasiswa = new ArrayList();
    }
    
    public void isiDataAndy(String mNim, String mNama, String mAlamat){
        Mahasiswa1841720002Andy mhs = new Mahasiswa1841720002Andy(mNim, mNama, mAlamat);
        mListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720002Andy> getDataAndy(){
        return mListMahasiswa;
    }
    
}
