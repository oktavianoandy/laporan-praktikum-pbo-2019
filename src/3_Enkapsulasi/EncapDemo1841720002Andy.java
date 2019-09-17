package jti.polinema.jobsheet03tugas011841720002andy;

public class EncapDemo1841720002Andy {

    private String mName;
    private int mAge;

    public String getmNameAndy() {
        return mName;
    }

    public void setmNameAndy(String newName) {
        this.mName = newName;
    }

    public int getmAgeAndy() {
        return mAge;
    }

    public void setmAgeAndy(int newAge) {
        //perubahan kondisi pada soal ke 3. umur maksimal 30 dan minimal 18
        if (newAge <= 30 && newAge >= 18) {
            mAge = newAge;
        } else {
            System.out.println("Umur maksmimal 30 dan minimal 18!");
        }
    }
}
