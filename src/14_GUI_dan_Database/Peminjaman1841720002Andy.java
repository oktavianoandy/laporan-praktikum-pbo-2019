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
                peminjaman.getAnggotaAndy().setIdAnggotaAndy(rs.getInt("idanggota"));
                peminjaman.getAnggotaAndy().setNamaAndy(rs.getString("nama"));
                peminjaman.getAnggotaAndy().setAlamatAndy(rs.getString("alamat"));
                peminjaman.getAnggotaAndy().setTeleponAndy(rs.getString("telepon"));
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
                peminjaman.getAnggotaAndy().setIdAnggotaAndy(rs.getInt("idanggota"));
                peminjaman.getAnggotaAndy().setNamaAndy(rs.getString("nama"));
                peminjaman.getAnggotaAndy().setAlamatAndy(rs.getString("alamat"));
                peminjaman.getAnggotaAndy().setTeleponAndy(rs.getString("telepon"));
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

    public void cariAnggotaAndy(int id){
        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM anggota WHERE idanggota = '" + id + "'");
        try{
            while(rs.next()){
                getAnggotaAndy().setIdAnggotaAndy(rs.getInt("idanggota"));
                getAnggotaAndy().setNamaAndy(rs.getString("nama"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void cariBukuAndy(int id){
        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM buku WHERE idbuku = '" + id + "'");
        try{
            while(rs.next()){
                getBukuAndy().setIdBukuAndy(rs.getInt("idbuku"));
                getBukuAndy().setJudulAndy(rs.getString("judul"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void saveAndy() {
        if (getByIdAndy(mIdPeminjaman).getIdPeminjamanAndy()== 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + " '" + this.getAnggotaAndy().getIdAnggotaAndy()+ "', "
                    + " '" + this.getBukuAndy().getIdBukuAndy()+ "', "
                    + " '" + this.mTanggalPinjam + "', "
                    + " '" + this.mTanggalKembali + "' "
                    + " )";
            this.mIdPeminjaman = DBHelper1841720002Andy.insertQueryGetIdAndy(SQL);
        } else {
            String sql = "UPDATE peminjaman SET "
                    + " idanggota = '" + this.getAnggotaAndy().getIdAnggotaAndy()+ "', "
                    + " idbuku = '" + this.getBukuAndy().getIdBukuAndy()+ "', "
                    + " tanggalpinjam = '" + this.mTanggalPinjam+ "', "
                    + " tanggalkembali= '" +this.mTanggalKembali + "' "
                    + " WHERE idpeminjaman = '" + this.mIdPeminjaman + "'";
            DBHelper1841720002Andy.executeQueryAndy(sql);
        }
    }

    public void deleteAndy() {
        String SQL = "DELETE FROM peminjaman where idpeminjaman = '" + this.mIdPeminjaman + "'";
        DBHelper1841720002Andy.executeQueryAndy(SQL);
    }
}
