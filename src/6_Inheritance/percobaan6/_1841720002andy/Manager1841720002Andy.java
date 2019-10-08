package jti.polinema.inheritance.percobaan6._1841720002andy;

public class Manager1841720002Andy extends Karyawan1841720002Andy {

    public int tunjangan;

    public Manager1841720002Andy() {

    }

    public void tampilDataManagerAndy() {
        super.tampilDataKaryawanAndy();
        System.out.println("Tunjangan       : " + tunjangan);
        System.out.println("Total Gaji      : " + (super.gaji + tunjangan));
    }
}
