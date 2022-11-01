
import java.awt.*;
import javax.swing.*;
import lab01.ChatDemo;

public class StudentView {

    private JFrame jf;
    private JPanel pn1, pn2, pn3, pn4;
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;
    private JButton deposit;
    private JButton withdraw;

    public StudentView() {
        jf = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        l1 = new JLabel("ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Money:");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField(0);
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        
        tf3.setEditable(false);
        jf.setLayout(new GridLayout(4, 1));
        pn1.setLayout(new GridLayout(1, 2));
        pn1.add(l1);
        pn1.add(tf1);
        pn2.setLayout(new GridLayout(1, 2));
        pn2.add(l2);
        pn2.add(tf2);
        pn3.setLayout(new GridLayout(1, 2));
        pn3.add(l3);
        pn3.add(tf3);

        pn4.setLayout(new GridLayout(1, 2));
        pn4.add(deposit);
        pn4.add(withdraw);

        jf.add(pn1);
        jf.add(pn2);
        jf.add(pn3);
        jf.add(pn4);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentView();
    }
}
