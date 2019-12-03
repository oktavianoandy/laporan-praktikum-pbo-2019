package frontend;

import backend.Anggota1841720002Andy;
import backend.Kategori1841720002Andy;

public class TestBackendAnggota1841720002Andy {

    public static void main(String[] args) {
        Anggota1841720002Andy anggota1 = new Anggota1841720002Andy("Andy", "Landungsari", "085766566560");
        Anggota1841720002Andy anggota2 = new Anggota1841720002Andy("Udean", "Batu", "085331456789");
        Anggota1841720002Andy anggota3 = new Anggota1841720002Andy("Ella", "Kepanjen", "081445335267");
        
        anggota1.saveAndy();
        anggota2.saveAndy();
        anggota3.saveAndy();
       
        // test update
        anggota2.setmAlamatAndy("Probolinggo");
        anggota2.saveAndy();

        // test delete
        anggota3.deleteAndy();

        // test select all
        for (Anggota1841720002Andy a : new Anggota1841720002Andy().getAllAndy()) {
            System.out.println("Nama: " + a.getmNamaAndy()+ ", Alamat: " + a.getmAlamatAndy()
                    + ", Telepon: "+ a.getmTeleponAndy());
        }

        // test search
        for (Anggota1841720002Andy a : new Anggota1841720002Andy().searchAndy("udean")) {
            System.out.println("Nama: " + a.getmNamaAndy()+ ", Alamat: " + a.getmAlamatAndy()
                    + ", Telepon: "+ a.getmTeleponAndy());
        }
    }
}
