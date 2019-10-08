package jti.polinema.inheritance.tugas._1841720002andy;

public class InheritanceTugas1841720002Andy {

    public static void main(String[] args) {
        System.out.println("===============PC===============");
        Pc1841720002Andy pc = new Pc1841720002Andy("HP", 2, 4, "AMD Raizen", 1280);
        pc.tampilPcAndy();

        System.out.println("===============MAC===============");
        Mac1841720002Andy mac = new Mac1841720002Andy("MAC PRO", 2, 8, "Intel Core 5+", "Baterai Tanam", "AVG security");
        mac.tampilMacAndy();

        System.out.println("===============WINDOWS===============");
        Windows1841720002Andy windows = new Windows1841720002Andy("ASUS", 2, 8, "Intel Core 7", "Baterai Tanam", "Win10");
        windows.tampilWindowsAndy();
    }
}
