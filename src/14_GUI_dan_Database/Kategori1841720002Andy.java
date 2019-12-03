package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Kategori1841720002Andy {

    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720002Andy() {

    }

    public Kategori1841720002Andy(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720002Andy getByIdAndy(int mId) {
        Kategori1841720002Andy mKat = new Kategori1841720002Andy();
        ResultSet mRs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM kategori "
                + "WHERE idkategori = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Kategori1841720002Andy();
                mKat.setIdKategoriAndy(mRs.getInt("idkategori"));
                mKat.setNamaAndy(mRs.getString("nama"));
                mKat.setKeteranganAndy(mRs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Kategori1841720002Andy> getAllAndy() {
        ArrayList<Kategori1841720002Andy> mListKategori = new ArrayList();

        ResultSet mRs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM kategori");

        try {
            while (mRs.next()) {
                Kategori1841720002Andy mKat = new Kategori1841720002Andy();
                mKat.setIdKategoriAndy(mRs.getInt("idkategori"));
                mKat.setNamaAndy(mRs.getString("nama"));
                mKat.setKeteranganAndy(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public ArrayList<Kategori1841720002Andy> searchAndy(String mKeyword) {
        ArrayList<Kategori1841720002Andy> mListKategori = new ArrayList();

        String mSql = "SELECT * FROM kategori WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR keterangan LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720002Andy.selectQueryAndy(mSql);

        try {
            while (mRs.next()) {
                Kategori1841720002Andy mKat = new Kategori1841720002Andy();
                mKat.setIdKategoriAndy(mRs.getInt("idkategori"));
                mKat.setNamaAndy(mRs.getString("nama"));
                mKat.setKeteranganAndy(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public void saveAndy() {
        if (getByIdAndy(mIdKategori).getIdKategoriAndy() == 0) {
            String mSql = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdKategori = DBHelper1841720002Andy.insertQueryGetIdAndy(mSql);
        } else {
            String mSql = "UPDATE kategori SET "
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdKategori + "'";
            DBHelper1841720002Andy.executeQueryAndy(mSql);
        }
    }

    public void deleteAndy() {
        String mSql = "DELETE FROM kategori WHERE idkategori = '" + this.mIdKategori + "'";
        DBHelper1841720002Andy.executeQueryAndy(mSql);
    }
    
    public String toString(){
        return mNama;
    }

    public int getIdKategoriAndy() {
        return mIdKategori;
    }

    public void setIdKategoriAndy(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganAndy() {
        return mKeterangan;
    }

    public void setKeteranganAndy(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

}
