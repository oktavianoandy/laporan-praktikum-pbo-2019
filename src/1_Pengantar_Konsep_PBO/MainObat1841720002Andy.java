package tugas1;

public class MainObat1841720002Andy 
{
    public static void main(String[] args)
    {
        Obat1841720002Andy obat = new Obat1841720002Andy();
        ObatDalam1841720002Andy obatDalam = new ObatDalam1841720002Andy();
        ObatLuar1841720002Andy obatLuar = new ObatLuar1841720002Andy();
        
        obat.setNamaObatAndy("Bodrex");
        obat.setHargaAndy(1500);
        obat.setStokAndy(100);
        obat.cetakObatAndy();
        
        obatDalam.setNamaObatAndy("Paramex");
        obatDalam.setHargaAndy(3000);
        obatDalam.setStokAndy(100);
        obatDalam.setDosisAndy("3x Sehari");
        obatDalam.cetakObatAndy();
        
        obatLuar.setNamaObatAndy("Betadine");
        obatLuar.setHargaAndy(12000);
        obatLuar.setStokAndy(100);
        obatLuar.setCaraPenggunaan("Di Oleskan Pada Luka");
        obatLuar.cetakObatAndy();
    }
}
