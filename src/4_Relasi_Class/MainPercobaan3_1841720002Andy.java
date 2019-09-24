//method baru 
package jti.polinema.relasiclass.percobaan3_1841720002Andy;

public class MainPercobaan3_1841720002Andy {

    public static void main(String[] args) {
        Pegawai1841720002Andy masinis = new Pegawai1841720002Andy("1234", "Spongebob Squarepans");
        Pegawai1841720002Andy asisten = new Pegawai1841720002Andy("4567", "Patrick Star");
        KeretaApi1841720002Andy keretaApi = new KeretaApi1841720002Andy("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.infoAndy());
    }

}
