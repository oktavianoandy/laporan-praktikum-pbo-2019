package jti.polinema.percobaan1._1841720002andy;

public class Utama1841720002Andy {

    public static void main(String[] args) {
        Manager1841720002Andy man[] = new Manager1841720002Andy[2];
        Staff1841720002Andy staff1[] = new Staff1841720002Andy[2];
        Staff1841720002Andy staff2[] = new Staff1841720002Andy[3];
        
        //pembuatan manager
        man[0] = new Manager1841720002Andy();
        man[0].setNamaAndy("Tedjo");
        man[0].setNipAndy("101");
        man[0].setGolonganAndy("1");
        man[0].setTunjanganAndy(5000000);
        man[0].setBagianAndy("Administrasi");
        
        man[1] = new Manager1841720002Andy();
        man[1].setNamaAndy("Atika");
        man[1].setNipAndy("102");
        man[1].setGolonganAndy("1");
        man[1].setTunjanganAndy(2500000);
        man[1].setBagianAndy("Pemasaran");
        
        staff1[0] = new Staff1841720002Andy();
        staff1[0].setNamaAndy("Usman");
        staff1[0].setNipAndy("0003");
        staff1[0].setGolonganAndy("2");
        staff1[0].setLemburAndy(10);
        staff1[0].setGajiLemburAndy(10000);
        
        staff1[1] = new Staff1841720002Andy();
        staff1[1].setNamaAndy("Anugrah");
        staff1[1].setNipAndy("0005");
        staff1[1].setGolonganAndy("2");
        staff1[1].setLemburAndy(10);
        staff1[1].setGajiLemburAndy(55000);
        man[0].setStAndy(staff1);
        
        staff2[0] = new Staff1841720002Andy();
        staff2[0].setNamaAndy("Hendra");
        staff2[0].setNipAndy("0004");
        staff2[0].setGolonganAndy("3");
        staff2[0].setLemburAndy(15);
        staff2[0].setGajiLemburAndy(5500);
        
        staff2[1] = new Staff1841720002Andy();
        staff2[1].setNamaAndy("Arie");
        staff2[1].setNipAndy("0006");
        staff2[1].setGolonganAndy("4");
        staff2[1].setLemburAndy(5);
        staff2[1].setGajiLemburAndy(100000);
        
        staff2[2] = new Staff1841720002Andy();
        staff2[2].setNamaAndy("Mentari");
        staff2[2].setNipAndy("0007");
        staff2[2].setGolonganAndy("3");
        staff2[2].setLemburAndy(6);
        staff2[2].setGajiLemburAndy(20000);
        man[1].setStAndy(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].lihatInfoAndy();
        man[1].lihatInfoAndy();
        
    }
}
