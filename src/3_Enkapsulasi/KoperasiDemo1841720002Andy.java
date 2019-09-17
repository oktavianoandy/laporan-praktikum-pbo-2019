package jti.polinema.koperasigettersetter1841720002andy;

public class KoperasiDemo1841720002Andy {

    public static void main(String[] args) {

        //passing parameter pada langkah ke-4 percobaan 4.
        AnggotaKoperasi1841720002Andy anggota1 = new AnggotaKoperasi1841720002Andy("Iwan", "Jalan Mawar");

        //langkah pertama pada percobaan 4.
        System.out.println("Simpanan " + anggota1.getmNamaAnggotaAndy() + " : Rp "
                + anggota1.getmSimpananAnggotaAndy());

        anggota1.setmNamaAnggotaAndy("Iwan Setiawan");
        anggota1.setmAlamatAnggotaAndy("Jalan Soekarno Hattan no 10");
        anggota1.setorAnggotaAndy(100000);
        System.out.println("Simpanan " + anggota1.getmNamaAnggotaAndy() + " : Rp "
                + anggota1.getmSimpananAnggotaAndy());

        anggota1.pinjamAnggotaAndy(5000);

        System.out.println("Simpanan " + anggota1.getmNamaAnggotaAndy() + " : Rp "
                + anggota1.getmSimpananAnggotaAndy());
    }
}
