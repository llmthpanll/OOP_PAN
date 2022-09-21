
import javax.swing.*;
import java.awt.*;

public class SimpleCalGUI {

    private JFrame fr;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;

    public SimpleCalGUI() {
        fr = new JFrame("TellerGUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        b1 = new JButton("Plus");
        b2 = new JButton("Minus");
        b3 = new JButton("Multipy");
        b4 = new JButton("Divide");
        p1.setLayout(new GridLayout(1, 1));
        p1.add(txt1);
        p2.setLayout(new GridLayout(1, 1));
        p2.add(txt2);
        p3.setLayout(new FlowLayout());
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p4.setLayout(new GridLayout(1, 1));
        p4.add(txt3);
        fr.setLayout(new GridLayout(4, 1));
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - fr.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - fr.getHeight()) / 2);
        fr.setLocation(x, y);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalGUI();
    }
}
