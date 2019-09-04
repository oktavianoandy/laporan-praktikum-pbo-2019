package sepedademo;

public class SepedaDemo1841720002Andy 
{
    public static void main(String[] args) 
    {
        Sepeda1841720002Andy spd1 = new Sepeda1841720002Andy();
        Sepeda1841720002Andy spd2 = new Sepeda1841720002Andy();
        
        //penamabahan object spd3 pada percobaan 2
        SepedaGunung1841720002Andy spd3 = new SepedaGunung1841720002Andy();
        
        spd1.setMerekAndy("Polygon");
        spd1.tambahKecepatanAndy(10);
        spd1.gantiGearAndy(2);
        spd1.setWarnaAndy("Hitam");
        spd1.cekStatusAndy();
        
        spd2.setMerekAndy("Wiim Cycle");
        spd2.tambahKecepatanAndy(10);
        spd2.gantiGearAndy(2);
        spd2.tambahKecepatanAndy(10);
        spd2.gantiGearAndy(3);
        spd2.setWarnaAndy("Biru");
        spd2.cekStatusAndy();
        
        spd3.setMerekAndy("Klinee");
        spd3.tambahKecepatanAndy(5);
        spd3.gantiGearAndy(7);
        spd3.setTipeSuspensionAndy("Gas Suspension");
        spd3.setWarnaAndy("Kuning");
        spd3.cetakStatusAndy();
    }
}
