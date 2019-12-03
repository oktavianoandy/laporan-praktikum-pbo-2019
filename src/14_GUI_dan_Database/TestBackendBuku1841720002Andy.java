package frontend;

import backend.Buku1841720002Andy;
import backend.Kategori1841720002Andy;

public class TestBackendBuku1841720002Andy {

    public static void main(String[] args) {
        Kategori1841720002Andy novel = new Kategori1841720002Andy().getByIdAndy(35);
        Kategori1841720002Andy referensi = new Kategori1841720002Andy().getByIdAndy(36);

        Buku1841720002Andy buku1 = new Buku1841720002Andy(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720002Andy buku2 = new Buku1841720002Andy(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720002Andy buku3 = new Buku1841720002Andy(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.saveAndy();
        buku2.saveAndy();

        // test update
        buku2.setJudulAndy("Aljabar Linier");
        buku2.saveAndy();

        // test delete
        buku3.deleteAndy();

        // test select all
        for (Buku1841720002Andy b : new Buku1841720002Andy().getAllAndy()) {
            System.out.println("Kategori: " + b.getKategoriAndy().getNamaAndy()+ ", Judul: " + b.getJudulAndy());
        }

        // test search
        for (Buku1841720002Andy b: new Buku1841720002Andy().searchAndy("timun")) {
            System.out.println("Kategori: " + b.getKategoriAndy().getNamaAndy()+ ", Judul: " + b.getJudulAndy());
        }
    }

}
