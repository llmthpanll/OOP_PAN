package lab04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener {

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
    private Account ac;

    

    public TellerGUI() {
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        ac = new Account(6000, "Pan");

        String txt = ac.getBalance() + "";
        txt1 = new JTextField(txt);

        txt2 = new JTextField();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

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
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - fr.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - fr.getHeight()) / 2);
        fr.setLocation(x, y);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn2)) {
            ac.withdraw(Double.parseDouble(txt2.getText()));
            txt1.setText(ac.getBalance() + "");
        } 
        else if (ae.getSource().equals(btn1)) {
            ac.deposit(Double.parseDouble(txt2.getText()));
            txt1.setText(ac.getBalance() + "");
        }
//        System.out.print(ac.getBalance());
        
        if (ae.getSource().equals(btn3)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
