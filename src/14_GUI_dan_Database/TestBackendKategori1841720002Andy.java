package frontend;

import backend.Kategori1841720002Andy;

public class TestBackendKategori1841720002Andy {

    public static void main(String[] args) {
        Kategori1841720002Andy kat1 = new Kategori1841720002Andy("Novel", "Koleksi buku novel");
        Kategori1841720002Andy kat2 = new Kategori1841720002Andy("Referensi", "Buku referensi ilmiah");
        Kategori1841720002Andy kat3 = new Kategori1841720002Andy("Komik", "Komik anak-anak");

        // test insert
        kat1.saveAndy();
        kat2.saveAndy();
        kat3.saveAndy();

        // test update
        kat2.setKeteranganAndy("Buku referensi");
        kat2.saveAndy();

        // test delete
        kat3.deleteAndy();
//
        // test select all
        for (Kategori1841720002Andy k : new Kategori1841720002Andy().getAllAndy()) {
            System.out.println("Nama: " + k.getNamaAndy()+ ", Ket: " + k.getKeteranganAndy());
        }

        // test search
        for (Kategori1841720002Andy k : new Kategori1841720002Andy().searchAndy("ilmiah")) {
            System.out.println("Nama: " + k.getNamaAndy()+ ", Ket: " + k.getKeteranganAndy());
        }
    }
}
