package manajemenlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid1841720002Andy extends JFrame{

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGTH = 200;
    private JPanel mPanel;

    public Grid1841720002Andy() {
        mPanel = new JPanel();
        mPanel.setLayout(new GridLayout(4,2));
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        mPanel.add(new JButton("6"));
        mPanel.add(new JButton("7"));
        mPanel.add(new JButton("8"));
        
        add(mPanel);
        setSize(FRAME_WIDTH, FRAME_HEIGTH);
        setTitle("Grid Layout Demo");
    }

}
