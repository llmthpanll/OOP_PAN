package lab04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame implements MouseListener{
    private JFrame frame;
    private MyClock clock;
    private Thread t;
    private int checkPause = 0;
    
    public MyFrame(){
        frame = new JFrame("MyFrame");
        clock = new MyClock();
        t = new Thread(clock);
        clock.addMouseListener(this);
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

    @Override
    public synchronized void mouseClicked(MouseEvent ev){
        if(checkPause%2==0){
            clock.pauseThread();
        }
        else{
            clock.resumeThread();
        }
        checkPause++;
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }
}
