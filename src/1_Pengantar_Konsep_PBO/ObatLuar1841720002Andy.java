package tugas1;

public class ObatLuar1841720002Andy extends Obat1841720002Andy
{
    private String mCaraPenggunaan;
    
    public void setCaraPenggunaan(String newValue)
    {
        mCaraPenggunaan = newValue;
    }
    
    public void cetakObatAndy()
    {
        super.cetakObatAndy();
        System.out.println("Cara Penggunaan : "+mCaraPenggunaan);
    }
    
}
