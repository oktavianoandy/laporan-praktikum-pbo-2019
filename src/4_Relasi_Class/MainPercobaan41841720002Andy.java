package jti.polinema.relasiclass.percobaan4_1841720002Andy;

public class MainPercobaan41841720002Andy {

    public static void main(String[] args) {
        Penumpang184120002Andy p = new Penumpang184120002Andy("1234", "Mr. Crab");
        
        //penambahan object baru untuk pertanyaan nomor 4
        Penumpang184120002Andy budi = new Penumpang184120002Andy("5678", "Budi");
        Gerbong1841720002Andy gerbong = new Gerbong1841720002Andy("A", 10);
        gerbong.setPenumpangAndy(p, 1);
        
        //pengisian data penumpang baru untuk pertanyaan nomor 4
        gerbong.setPenumpangAndy(budi, 1);
        System.out.println(gerbong.infoAndy());
    }
    
}
