package sepedademo;

public class SepedaGunung1841720002Andy extends Sepeda1841720002Andy
{
    private String mTipeSuspensi;
    
    public void setTipeSuspensionAndy(String newValue)
    {
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusAndy()
    {
        super.cekStatusAndy();
        System.out.println("Tipe suspensi \t: "+mTipeSuspensi);
    }
}
