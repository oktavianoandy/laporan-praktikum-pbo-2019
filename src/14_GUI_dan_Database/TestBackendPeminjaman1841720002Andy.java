/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1841720002Andy;
import backend.Peminjaman1841720002Andy;
import backend.Buku1841720002Andy;

/**
 *
 * @author Andy
 */
public class TestBackendPeminjaman1841720002Andy {
    public static void main(String[] args) {
        Anggota1841720002Andy andy = new Anggota1841720002Andy().getByIdAndy(9);
        Buku1841720002Andy TimunMas = new Buku1841720002Andy().getByIdAndy(1);
        Peminjaman1841720002Andy peminjaman1 = 
                new Peminjaman1841720002Andy(andy,TimunMas,"2019/09/21","2019/10/01");
        
        peminjaman1.save();
        
        for(Peminjaman1841720002Andy p : new Peminjaman1841720002Andy().getAllAndy()){
            System.out.println("Nama Peminjam : "+p.getAnggotaAndy().getmNamaAndy()
                    +", Nama Buku : "+p.getBukuAndy().getJudulAndy()+", "
                    + "Tanggal Pinjam: "+p.getTanggalPinjamAndy()+", Tanggal Kembali: "+p.getTanggalKembaliAndy());
        }
    }
}