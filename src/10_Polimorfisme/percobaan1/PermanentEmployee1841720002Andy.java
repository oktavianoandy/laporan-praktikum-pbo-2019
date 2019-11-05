package percobaan1;

public class PermanentEmployee1841720002Andy extends Employee184172002Andy implements IPayable1841720002Andy {

    private int mSalary;

    public PermanentEmployee1841720002Andy(String mName, int mSalary) {
        this.mSalary = mSalary;
        this.mName = mName;
    }

    public int getSalaryAndy() {
        return mSalary;
    }

    public void setSalaryAndy(int mSalary) {
        this.mSalary = mSalary;
    }

    @Override
    public int getPaymentAmountAndy() {
        return (int) (mSalary + 0.05 * mSalary);
    }

    @Override
    public String getEmployeeInfoAndy() {
        String mInfo = super.getEmployeeInfoAndy() + "\n";
        mInfo += "Registered as permanent employee with salary " + mSalary + "\n";
        return mInfo;
    }

}
