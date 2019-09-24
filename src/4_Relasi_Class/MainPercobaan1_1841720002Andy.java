package jti.polinema.relasiclass.percobaan1_1841720002Andy;

public class MainPercobaan1_1841720002Andy {

    public static void main(String[] args) {
        Processor1841720002Andy p = new Processor1841720002Andy("Intel i5", 3);
        Laptop1841720002Andy L = new Laptop1841720002Andy("Thinkpad", new Processor1841720002Andy("Intel i5", 3));
        L.infoLaptopAndy();

        Processor1841720002Andy p1 = new Processor1841720002Andy();
        p1.setMerkAndy("Intel i5");
        p1.setCacheAndy(4);
        Laptop1841720002Andy L1 = new Laptop1841720002Andy();
        L1.setMerkAndy("Thinkpad");
        L1.setProcAndy(p1);
        L1.infoLaptopAndy();
    }
}
