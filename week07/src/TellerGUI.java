
import java.awt.*;
import javax.swing.*;

public class TellerGUI {

    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JLabel lb1;
    private JLabel lb2;
    private JTextField txt1;
    private JTextField txt2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    public TellerGUI() {
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        txt1 = new JTextField("6000");
        txt2 = new JTextField();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        fr.setLayout(new GridLayout(2, 1));
        pn1.setLayout(new GridLayout(2, 2));
        pn2.setLayout(new FlowLayout());
        pn1.add(lb1);
        txt1.setEditable(false);
        pn1.add(txt1);
        pn1.add(lb2);
        pn1.add(txt2);

        pn2.add(btn1);
        pn2.add(btn2);
        pn2.add(btn3);

        fr.add(pn1);
        fr.add(pn2);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
