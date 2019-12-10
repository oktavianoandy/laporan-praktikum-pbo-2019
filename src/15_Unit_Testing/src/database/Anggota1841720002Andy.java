package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota1841720002Andy {

    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720002Andy() {

    }

    public Anggota1841720002Andy(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public Anggota1841720002Andy getByIdAndy(int mId) {
        Anggota1841720002Andy mKat = new Anggota1841720002Andy();
        ResultSet mRs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM anggota "
                + "WHERE idanggota = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Anggota1841720002Andy();
                mKat.setIdAnggotaAndy(mRs.getInt("idanggota"));
                mKat.setNamaAndy(mRs.getString("nama"));
                mKat.setAlamatAndy(mRs.getString("alamat"));
                mKat.setTeleponAndy(mRs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Anggota1841720002Andy> getAllAndy() {
        ArrayList<Anggota1841720002Andy> mListAnggota = new ArrayList();

        ResultSet mRs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM anggota");

        try {
            while (mRs.next()) {
                Anggota1841720002Andy mKat = new Anggota1841720002Andy();
                mKat.setIdAnggotaAndy(mRs.getInt("idanggota"));
                mKat.setNamaAndy(mRs.getString("nama"));
                mKat.setAlamatAndy(mRs.getString("alamat"));
                mKat.setTeleponAndy(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }

    public ArrayList<Anggota1841720002Andy> searchAndy(String mKeyword) {
        ArrayList<Anggota1841720002Andy> mListAnggota = new ArrayList();

        String mSql = "SELECT * FROM anggota WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR alamat LIKE '%" + mKeyword + "%' "
                + " OR telepon LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720002Andy.selectQueryAndy(mSql);

        try {
            while (mRs.next()) {
                Anggota1841720002Andy mKat = new Anggota1841720002Andy();
                mKat.setIdAnggotaAndy(mRs.getInt("idanggota"));
                mKat.setNamaAndy(mRs.getString("nama"));
                mKat.setAlamatAndy(mRs.getString("alamat"));
                mKat.setTeleponAndy(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }
    
    public void saveAndy() {
        if (getByIdAndy(mIdAnggota).getIdAnggotaAndy()== 0) {
            String mSql = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720002Andy.insertQueryGetIdAndy(mSql);
        } else {
            String mSql = "UPDATE anggota SET "
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720002Andy.executeQueryAndy(mSql);
        }
    }
    
    public void deleteAndy() {
        String mSql = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720002Andy.executeQueryAndy(mSql);
    }
    
    ArrayList<Anggota1841720002Andy> getByNamaAndAlamatAndy(String nama, String alamat) {
        ArrayList<Anggota1841720002Andy> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (alamat.trim().length()>0)){
            rs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM anggota Where nama = '"+
            nama +"' and alamat = '"+ alamat+"'");
        }else if ((nama.trim().length()>0) && (alamat.trim().length()==0)){
            rs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM anggota Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720002Andy.selectQueryAndy("SELECT * FROM anggota Where alamat = '"+ alamat+"'");
        }
        try {
            while (rs.next()) {
                Anggota1841720002Andy ang = new Anggota1841720002Andy();
                ang.setIdAnggotaAndy(rs.getInt("idanggota"));
                ang.setNamaAndy(rs.getString("nama"));
                ang.setAlamatAndy(rs.getString("alamat"));
                ang.setTeleponAndy(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public int getIdAnggotaAndy() {
        return mIdAnggota;
    }

    public void setIdAnggotaAndy(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getNamaAndy() {
        return mNama;
    }

    public void setNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatAndy() {
        return mAlamat;
    }

    public void setAlamatAndy(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponAndy() {
        return mTelepon;
    }

    public void setTeleponAndy(String mTelepon) {
        this.mTelepon = mTelepon;
    }

}
