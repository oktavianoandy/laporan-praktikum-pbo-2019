package jti.polinema.motorencapsulation1841720002andy;

public class Motor1841720002Andy {
  
    //perubahan access modifier pada percobaan 2.
    private int mKecepatan = 0;
    private boolean mKontakOn = false;

    //method di bawah ini adalah method yang ditambahakan pada percobaan 2
    public void nyalakanMesinMotorAndy() {
        mKontakOn = true;
    }

    public void matikanMesinMotorAndy() {
        mKontakOn = false;
    }
    
    public boolean isMaxSpeedAndy(){
        if (mKecepatan >= 100) {
            return true;
        } else {
            return false;
        }
    }
    
    public void tambahKecepatanMotorAndy(){
        if (mKontakOn == true) {
            if (isMaxSpeed() == false) {
                mKecepatan += 5;
            }else{
                System.out.println("Kepatan tidak bisa lebih dari 100!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin OFF!\n");
        }
    }
    
    public void kurangiKecepatanMotorAndy(){
        if (mKontakOn == true) {
            mKecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin OFF!\n");
        }
    }
    /*
        Batas penambahan method dari percobaan 2. Selain method diatas, 
        adalah method - method yang ditambahkan sebelum percobaan 2.
    */
    
    public void printStatusMotorAndy() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan " + mKecepatan + "\n");
    }
}
