package tugas1;

public class ObatDalam1841720002Andy extends Obat1841720002Andy
{
    private String mDosis;
    
    public void setDosisAndy(String newValue)
    {
        mDosis = newValue;
    }
    
    public void cetakObatAndy()
    {
        super.cetakObatAndy();
        System.out.println("Dosis \t\t: "+ mDosis);
    }
}
