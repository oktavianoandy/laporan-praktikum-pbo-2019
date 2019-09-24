package jti.polinema.relasiclass.percobaan2_1841720002Andy;

public class MainPercobaan2_1841720002Andy {

    public static void main(String[] args) {
        Mobil1841720002Andy m = new Mobil1841720002Andy();
        m.setNamaAndy("Avanza");
        m.setBiayaAndy(350000);
        Sopir1841720002Andy s = new Sopir1841720002Andy();
        s.setNamaAndy("Jane Doe");
        s.setBiayaAndy(200000);
        Pelanggan1841720002Andy p = new Pelanggan1841720002Andy();
        p.setNamaAndy("Jane Doe");
        p.setMobilAndy(m);
        p.setSopirAndy(s);
        p.setHariAndy(2);
        System.out.println("Biaya Total = " + 
        p.hitungBiayaTotalAndy());
        
        //penambahan sintak pada bagian pertanyaan
        System.out.println(p.getMobilAndy().getNamaAndy());
    }
    
}
