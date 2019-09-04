package sepedademo;

public class Sepeda1841720002Andy 
{
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    
    //penambahan atribut mWarna pada pertanyaan
    private String mWarna;
    
    public void setMerekAndy(String newValue)
    {
        mMerek = newValue;
    }
    
    public void gantiGearAndy(int newValue)
    {
        mGear = newValue;
    }
    
    public void tambahKecepatanAndy (int increment)
    {
        mKecepatan =  + increment;
    }
    
    public void remAndy(int decrement)
    {
        mKecepatan = mKecepatan - decrement;
    }
    
    //penambahan method setWarnaAndy pada pertanyaan.
    public void setWarnaAndy(String newValue)
    {
        mWarna = newValue;
    }
    
    public void cekStatusAndy()
    {
        System.out.println("");
        System.out.println("Merek \t\t: " + mMerek);
        System.out.println("Kecepatan \t: " + mKecepatan);
        System.out.println("Gear \t\t: " + mGear);
        System.out.println("Warna \t\t: "+mWarna);
    }
}
