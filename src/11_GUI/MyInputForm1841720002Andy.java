package myinputform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JButton mButton1;
    private JPanel mPanel;

    public MyInputForm() {
        createTextFieldAndy();
        createButtonAndy();
        createPanelAndy();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextFieldAndy() {
        mALabel = new JLabel("Nilai A : ");
        mBLabel = new JLabel("Nilai B : ");
        mCLabel = new JLabel("Hasil : ");

        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }

    private void createButtonAndy() {
        mButton = new JButton("Calculate"); //membuat tombol calculate
        mButton1 = new JButton("Tambah");
        class AddInterestListener1841720002Andy implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                int mA = Integer.valueOf(mAField.getText()); //mengambil nilai dari label mALabel
                int mB = Integer.valueOf(mBField.getText());
                int mC = mA * mB;
                mCLabel.setText("Hasil : " + mC);
            }
        }
        ActionListener listener = new AddInterestListener1841720002Andy();
        mButton.addActionListener(listener);

        class TambahListener1841720002Andy implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                int mA = Integer.valueOf(mAField.getText()); //mengambil nilai dari label mALabel
                int mB = Integer.valueOf(mBField.getText());
                int mC = mA + mB;
                mCLabel.setText("Hasil : " + mC);
            }
        }
        ActionListener tambahListener = new TambahListener1841720002Andy();
        mButton1.addActionListener(tambahListener);
    }

    private void createPanelAndy() {
        mPanel = new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mButton1);
        mPanel.add(mCLabel);
        add(mPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
