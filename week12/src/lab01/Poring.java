package lab01;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Poring implements MouseListener,Runnable {

    private JFrame frame;
    private JLabel label;
    private ImageIcon image;
    private String number;

    public Poring(int numberOfPoring) {
        number = numberOfPoring + "";
        frame = new JFrame("Poring");
        frame.setLayout(new FlowLayout());

        image = new ImageIcon("C:\\Users\\metha\\Desktop\\KMITL\\OOP_PAN\\week12\\Poring.jfif");
        label = new JLabel(image);
        label.setText(number);
        
        label.addMouseListener(this);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int)(Math.random()*(dimension.getWidth()-frame.getWidth())), (int)(Math.random()*(dimension.getHeight()-frame.getHeight())));
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.dispose();
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
    
    @Override
    public void run() {
        try{
            while(true){
                Thread.sleep(150);
                if(Math.random()<=0.5){
                    if(Math.random()<=0.5){
                        frame.setLocation(frame.getX()+2, frame.getY()+2);
                    }else{
                      frame.setLocation(frame.getX()-2, frame.getY()-2);  
                    }
                }else{
                    if(Math.random()<=0.5){
                        frame.setLocation(frame.getX()+2, frame.getY()-2);
                    }else{
                      frame.setLocation(frame.getX()-2, frame.getY()+2);  
                    }
                }
            }
        }catch(Exception e){
            System.out.print(e);
        }
    }
    
}
