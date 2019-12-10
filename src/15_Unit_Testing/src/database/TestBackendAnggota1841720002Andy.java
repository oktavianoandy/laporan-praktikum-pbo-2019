package database;

import database.Anggota1841720002Andy;
import database.Kategori1841720002Andy;

public class TestBackendAnggota1841720002Andy {

    public static void main(String[] args) {
        Anggota1841720002Andy anggota1 = new Anggota1841720002Andy("Andy", "Landungsari", "085766566560");
        Anggota1841720002Andy anggota2 = new Anggota1841720002Andy("Udean", "Batu", "085331456789");
        Anggota1841720002Andy anggota3 = new Anggota1841720002Andy("Ella", "Kepanjen", "081445335267");
        
        anggota1.saveAndy();
        anggota2.saveAndy();
        anggota3.saveAndy();
       
        // test update
        anggota2.setAlamatAndy("Probolinggo");
        anggota2.saveAndy();

        // test delete
        anggota3.deleteAndy();

        // test select all
        for (Anggota1841720002Andy a : new Anggota1841720002Andy().getAllAndy()) {
            System.out.println("Nama: " + a.getNamaAndy()+ ", Alamat: " + a.getAlamatAndy()
                    + ", Telepon: "+ a.getTeleponAndy());
        }

        // test search
        for (Anggota1841720002Andy a : new Anggota1841720002Andy().searchAndy("udean")) {
            System.out.println("Nama: " + a.getNamaAndy()+ ", Alamat: " + a.getAlamatAndy()
                    + ", Telepon: "+ a.getTeleponAndy());
        }
    }
}
