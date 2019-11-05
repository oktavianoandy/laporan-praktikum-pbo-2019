package percobaan1;

public class InternshipEmployee1841720002Andy extends Employee184172002Andy {

    private int mLength;

    public InternshipEmployee1841720002Andy(String mName, int mLength) {
        this.mLength = mLength;
        this.mName = mName;
    }

    public int getLengthAndy() {
        return mLength;
    }

    public void setLengthAndy(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoAndy() {
        String mInfo = super.getEmployeeInfoAndy() + "\n";
        mInfo += "Registered as internship employee for " + mLength + "month/s\n";
        return mInfo;
    }

}
