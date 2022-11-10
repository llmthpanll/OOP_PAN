package lab02;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    private JFrame frame;
    private MyClock clock;
    private Thread t;
    
    public MyFrame(){
        frame = new JFrame("MyFrame");
        clock = new MyClock();
        t = new Thread(clock);
        frame.setLayout(new FlowLayout());
        frame.add(clock);
        t.start();
        frame.setSize(450, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
