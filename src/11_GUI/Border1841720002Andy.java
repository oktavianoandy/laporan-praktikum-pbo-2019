package manajemenlayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border1841720002Andy extends JFrame{

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGTH = 200;
    private JPanel mPanel;

    //membuat konstruktor BorderLayoutForm

    public Border1841720002Andy() {
        mPanel = new JPanel();
        mPanel.setLayout(new BorderLayout());
        
        mPanel.add(new JButton("1"), BorderLayout.NORTH);
        mPanel.add(new JButton("2"), BorderLayout.WEST);
        mPanel.add(new JButton("3"), BorderLayout.CENTER);
        mPanel.add(new JButton("4"), BorderLayout.EAST);
        mPanel.add(new JButton("5"), BorderLayout.SOUTH);
        
        add(mPanel);
        setSize(FRAME_WIDTH, FRAME_HEIGTH);
        setTitle("Border Layout Demo");
    }
    
}
