/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class Peminjaman1841720002Andy {

    private int mIdPeminjaman;
    private Anggota1841720002Andy mAnggota = new Anggota1841720002Andy();
    private Buku1841720002Andy mBuku = new Buku1841720002Andy();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public int getIdPeminjamanAndy() {
        return mIdPeminjaman;
    }

    public void setIdPeminjamanAndy(int idPeminjaman) {
        this.mIdPeminjaman = idPeminjaman;
    }

    public Anggota1841720002Andy getAnggotaAndy() {
        return mAnggota;
    }

    public void setAnggotaAndy(Anggota1841720002Andy anggota) {
        this.mAnggota = anggota;
    }

    public Buku1841720002Andy getBukuAndy() {
        return mBuku;
    }

    public void setBukuAndy(Buku1841720002Andy buku) {
        this.mBuku = buku;
    }

    public String getTanggalPinjamAndy() {
        return mTanggalPinjam;
    }

    public void setTanggalPinjamAndy(String tanggalPinjam) {
        this.mTanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembaliAndy() {
        return mTanggalKembali;
    }

    public void setTanggalKembaliAndy(String tanggalKembali) {
        this.mTanggalKembali = tanggalKembali;
    }

    public Peminjaman1841720002Andy() {
        
    }

    public Peminjaman1841720002Andy(Anggota1841720002Andy anggota, Buku1841720002Andy buku, String tanggalPinjam, String tanggalKembali) {
        this.mAnggota = anggota;
        this.mBuku = buku;
        this.mTanggalPinjam = tanggalPinjam;
        this.mTanggalKembali = tanggalKembali;
    }

    public Peminjaman1841720002Andy getByIdAndy(int id) {
        Peminjaman1841720002Andy peminjaman = new Peminjaman1841720002Andy();
        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("Select "
                + " p.idpeminjaman as idpeminjaman, "
                + " p.tanggalpinjam as tanggalpinjam,"
                + " p.tanggalkembali as tanggalkembali, "
                + " a.idanggota as idanggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idbuku as idbuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idanggota = p.idanggota "
                + " left join buku as b on b.idbuku = p.idbuku"
                + " where p.idpeminjaman= '" + id + "'");
        try {
            while (rs.next()) {
                peminjaman = new Peminjaman1841720002Andy();
                peminjaman.setIdPeminjamanAndy(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaAndy().setmIdAnggotaAndy(rs.getInt("idanggota"));
                peminjaman.getAnggotaAndy().setmNamaAndy(rs.getString("nama"));
                peminjaman.getAnggotaAndy().setmAlamatAndy(rs.getString("alamat"));
                peminjaman.getAnggotaAndy().setmTeleponAndy(rs.getString("telepon"));
                peminjaman.getBukuAndy().setIdBukuAndy(rs.getInt("idbuku"));
                peminjaman.getBukuAndy().setJudulAndy(rs.getString("judul"));
                peminjaman.getBukuAndy().setPenerbitAndy(rs.getString("penerbit"));
                peminjaman.getBukuAndy().setPenulisAndy(rs.getString("penulis"));
                peminjaman.setTanggalKembaliAndy(rs.getString("tanggalkembali"));
                peminjaman.setTanggalPinjamAndy(rs.getString("tanggalpinjam"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    public ArrayList<Peminjaman1841720002Andy> getAllAndy() {
        ArrayList<Peminjaman1841720002Andy> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("Select "
                + " p.idpeminjaman as idpeminjaman, "
                + " p.tanggalpinjam as tanggalpinjam,"
                + " p.tanggalkembali as tanggalkembali, "
                + " a.idanggota as idanggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idbuku as idbuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idanggota = p.idanggota "
                + " left join buku as b on b.idbuku = p.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720002Andy peminjaman = new Peminjaman1841720002Andy();
                peminjaman.setIdPeminjamanAndy(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaAndy().setmIdAnggotaAndy(rs.getInt("idanggota"));
                peminjaman.getAnggotaAndy().setmNamaAndy(rs.getString("nama"));
                peminjaman.getAnggotaAndy().setmAlamatAndy(rs.getString("alamat"));
                peminjaman.getAnggotaAndy().setmTeleponAndy(rs.getString("telepon"));
                peminjaman.getBukuAndy().setIdBukuAndy(rs.getInt("idbuku"));
                peminjaman.getBukuAndy().setJudulAndy(rs.getString("judul"));
                peminjaman.getBukuAndy().setPenerbitAndy(rs.getString("penerbit"));
                peminjaman.getBukuAndy().setPenulisAndy(rs.getString("penulis"));
                peminjaman.setTanggalKembaliAndy(rs.getString("tanggalkembali"));
                peminjaman.setTanggalPinjamAndy(rs.getString("tanggalpinjam"));

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public ArrayList<Peminjaman1841720002Andy> searchIdAnggotaAndy(String keyword) {
        ArrayList<Peminjaman1841720002Andy> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("Select "
                + " p.idpeminjaman as idpeminjaman, "
                + " p.tanggalpinjam as tanggalpinjam,"
                + " p.tanggalkembali as tanggalkembali, "
                + " a.idanggota as idanggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idanggota = p.idanggota "
                + " left join buku as b on b.idbuku = p.idbuku"
                + " where a.idanggota like '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Peminjaman1841720002Andy peminjaman = new Peminjaman1841720002Andy();
                peminjaman.mAnggota.getmNamaAndy();

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }

    public ArrayList<Peminjaman1841720002Andy> searchIdBukuAndy(String keyword) {
        ArrayList<Peminjaman1841720002Andy> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("Select "
                + " p.idpeminjaman as idpeminjaman, "
                + " p.tanggalpinjam as tanggalpinjam,"
                + " p.tanggalkembali as tanggalkembali, "
                + " a.idanggota as idanggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idanggota = p.idanggota "
                + " left join buku as b on b.idbuku = p.idBuku"
                + " where b.idbuku like '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Peminjaman1841720002Andy peminjaman = new Peminjaman1841720002Andy();
                peminjaman.mBuku.getJudulAndy();

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }

    public void save() {
        if (getByIdAndy(mIdPeminjaman).getIdPeminjamanAndy()== 0) {
            String SQL = "INSERT INTO peminjaman (idanggota,idbuku,tanggalpinjam,tanggalkembali) VALUES("
                    + " '" + this.getAnggotaAndy().getmIdAnggotaAndy()+ "', "
                    + " '" + this.getBukuAndy().getIdBukuAndy()+ "', "
                    + " '" + this.mTanggalPinjam + "', "
                    + " '" + this.mTanggalKembali + "' "
                    + " )";
            this.mIdPeminjaman = DBHelper1841720002Andy.insertQueryGetIdAndy(SQL);
        } else {
            String SQL = "UPDATE peminjaman set "
                    + " judul = '" + this.getBukuAndy().getJudulAndy()+ "', "
                    + " nama = '" + this.getAnggotaAndy().getmNamaAndy()+ "', "
                    + " tanggalpinjam = '" + this.mTanggalPinjam + "', "
                    + " tanggalkembali = '" + this.mTanggalKembali + "', "
                    + " WHERE idpeminjaman = '" + this.mIdPeminjaman + "'";
            DBHelper1841720002Andy.executeQueryAndy(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku where idpeminjaman = '" + this.mIdPeminjaman + "'";
        DBHelper1841720002Andy.executeQueryAndy(SQL);
    }
}
