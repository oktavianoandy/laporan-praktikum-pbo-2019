package backend;

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
                mKat.setmIdAnggotaAndy(mRs.getInt("idanggota"));
                mKat.setmNamaAndy(mRs.getString("nama"));
                mKat.setmAlamatAndy(mRs.getString("alamat"));
                mKat.setmTeleponAndy(mRs.getString("telepon"));
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
                mKat.setmIdAnggotaAndy(mRs.getInt("idanggota"));
                mKat.setmNamaAndy(mRs.getString("nama"));
                mKat.setmAlamatAndy(mRs.getString("alamat"));
                mKat.setmTeleponAndy(mRs.getString("telepon"));

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
                mKat.setmIdAnggotaAndy(mRs.getInt("idanggota"));
                mKat.setmNamaAndy(mRs.getString("nama"));
                mKat.setmAlamatAndy(mRs.getString("alamat"));
                mKat.setmTeleponAndy(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }
    
    public void saveAndy() {
        if (getByIdAndy(mIdAnggota).getmIdAnggotaAndy()== 0) {
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

    public int getmIdAnggotaAndy() {
        return mIdAnggota;
    }

    public void setmIdAnggotaAndy(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getmNamaAndy() {
        return mNama;
    }

    public void setmNamaAndy(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatAndy() {
        return mAlamat;
    }

    public void setmAlamatAndy(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmTeleponAndy() {
        return mTelepon;
    }

    public void setmTeleponAndy(String mTelepon) {
        this.mTelepon = mTelepon;
    }

}
