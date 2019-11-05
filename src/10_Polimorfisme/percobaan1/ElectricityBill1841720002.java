package percobaan1;

public class ElectricityBill1841720002 implements IPayable1841720002Andy {

    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720002(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getKwhAndy() {
        return mKwh;
    }

    public void setKwhAndy(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getCategoryAndy() {
        return mCategory;
    }

    public void setCategoryAndy(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPaymentAmountAndy() {
        return mKwh*getBasePriceAndy();
    }

    public int getBasePriceAndy() {
        int mBPrice = 0;
        switch (mCategory) {
            case "R-1" : mBPrice = 100;break;
            case "R-2" : mBPrice = 200;break;    
        }
        return mBPrice;
    }
    
    public String getBillInfoAndy(){
        return "kWH = "+mKwh+"\n"+
                "Category = "+mCategory+"("+getBasePriceAndy()+" per kWH)\n";
    }

}
