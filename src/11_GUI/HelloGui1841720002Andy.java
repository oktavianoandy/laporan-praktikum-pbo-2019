package hellogui;

import javax.swing.*;

public class HelloGui1841720002Andy {

    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("ini percobaan HelloGui Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // program akan berhenti jika ditutup
        frame.setSize(600, 300); //lebar, tinggi windows
        //frame.setLocation(500, 700); // lokasi windows
        frame.setLocationRelativeTo(null); // posisi windows di tengah2
        frame.setVisible(true);// menampilkan frame
    }
}
