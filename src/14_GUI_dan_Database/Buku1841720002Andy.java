package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Buku1841720002Andy {
    private int mIdBuku;
    private Kategori1841720002Andy mKategori = new Kategori1841720002Andy();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public int getIdBukuAndy() {
        return mIdBuku;
    }

    public void setIdBukuAndy(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }

    public Kategori1841720002Andy getKategoriAndy() {
        return mKategori;
    }

    public void setKategoriAndy(Kategori1841720002Andy mKategori) {
        this.mKategori = mKategori;
    }

    public String getJudulAndy() {
        return mJudul;
    }

    public void setJudulAndy(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getPenerbitAndy() {
        return mPenerbit;
    }

    public void setPenerbitAndy(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getPenulisAndy() {
        return mPenulis;
    }

    public void setPenulisAndy(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720002Andy() {
    }

    public Buku1841720002Andy(Kategori1841720002Andy mkategori, String mjudul, String mPenerbit, String mPenulis) {
        this.mKategori = mkategori;
        this.mJudul = mjudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }
    
    public Buku1841720002Andy getByIdAndy(int mId){
        Buku1841720002Andy buku = new Buku1841720002Andy();
        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("SELECT "
                + " b.idbuku as idbuku, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit, "
                + " b.penulis as penulis, "
                + " k.idkategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k on b.idkategori = k.idkategori "
                + " WHERE b.idbuku = '" + mId + "'");
        try{
            while(rs.next()){
                buku = new Buku1841720002Andy();
                buku.setIdBukuAndy(rs.getInt("idbuku"));
                buku.getKategoriAndy().setIdKategoriAndy(rs.getInt("idkategori"));
                buku.getKategoriAndy().setNamaAndy(rs.getString("nama"));
                buku.getKategoriAndy().setKeteranganAndy(rs.getString("keterangan"));
                buku.setJudulAndy(rs.getString("judul"));
                buku.setPenerbitAndy(rs.getString("penerbit"));
                buku.setPenulisAndy(rs.getString("penulis"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720002Andy> getAllAndy(){
        ArrayList<Buku1841720002Andy> listBuku = new ArrayList();
        
        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("SELECT "
                        + " b.idbuku as idbuku, "
                        + " b.judul as judul, "
                        + " b.penerbit as penerbit, "
                        + " b.penulis as penulis, "
                        + " k.idkategori as idkategori, "
                        + " k.nama as nama, "
                        + " k.keterangan as keterangan "
                        + " FROM buku b "
                        + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try{
            while(rs.next()){
                Buku1841720002Andy buku = new Buku1841720002Andy();
                buku.setIdBukuAndy(rs.getInt("idbuku"));
                buku.getKategoriAndy().setIdKategoriAndy(rs.getInt("idkategori"));
                buku.getKategoriAndy().setNamaAndy(rs.getString("nama"));
                buku.getKategoriAndy().setKeteranganAndy(rs.getString("keterangan"));
                buku.setJudulAndy(rs.getString("judul"));
                buku.setPenerbitAndy(rs.getString("penerbit"));
                buku.setPenulisAndy(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listBuku;
    }
    
    public ArrayList<Buku1841720002Andy> searchAndy(String keyword){
        ArrayList<Buku1841720002Andy> listBuku = new ArrayList();
        
        ResultSet rs = DBHelper1841720002Andy.selectQueryAndy("SELECT "
                        + " b.idbuku as idbuku, "
                        + " b.judul as judul, "
                        + " b.penerbit as penerbit, "
                        + " b.penulis as penulis, "
                        + " k.idkategori as idkategori, "
                        + " k.nama as nama, "
                        + " k.keterangan as keterangan "
                        + " FROM buku b "
                        + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                        + " WHERE b.judul LIKE '%" + keyword + "%' "
                        + " OR b.penerbit LIKE '%" + keyword + "%' "
                        + " OR b.penulis LIKE '%" + keyword + "%'");
        try{
            while(rs.next()){
                Buku1841720002Andy buku = new Buku1841720002Andy();
                buku.setIdBukuAndy(rs.getInt("idbuku"));
                buku.getKategoriAndy().setIdKategoriAndy(rs.getInt("idkategori"));
                buku.getKategoriAndy().setNamaAndy(rs.getString("nama"));
                buku.getKategoriAndy().setKeteranganAndy(rs.getString("keterangan"));
                buku.setJudulAndy(rs.getString("judul"));
                buku.setPenerbitAndy(rs.getString("penerbit"));
                buku.setPenulisAndy(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listBuku;
    }
    
    public void saveAndy(){
        if(getByIdAndy(mIdBuku).getIdBukuAndy()== 0){
            String SQL = "INSERT INTO buku (judul, idkategori, penerbit, penulis) VALUES("
                    + " '" + this.mJudul + "', "
                    + " '" + this.getKategoriAndy().getIdKategoriAndy()+ "', "
                    + " '" + this.mPenerbit + "', "
                    + " '" + this.mPenulis + "' "
                    + " )";
            this.mIdBuku = DBHelper1841720002Andy.insertQueryGetIdAndy(SQL);
        }else{
            String SQL = "UPDATE buku SET "
                    + " judul = '" + this.mJudul + "', "
                    + " idkategori = '" + this.getKategoriAndy().getIdKategoriAndy()+ "', "
                    + " penerbit = '" + this.mPenerbit + "', "
                    + " penulis = '" + this.mPenulis + "' "
                    + " WHERE idbuku = '" + this.mIdBuku + "'";
            DBHelper1841720002Andy.executeQueryAndy(SQL);
        }
    }
    
    public void deleteAndy(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdBuku + "'";
        DBHelper1841720002Andy.executeQueryAndy(SQL);
    }
}
