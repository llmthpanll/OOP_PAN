
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class StudentView implements ActionListener, WindowListener {

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
        tf1 = new JTextField("");
        tf2 = new JTextField("");
        tf3 = new JTextField("0");
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        jf.addWindowListener(this);

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
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - jf.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - jf.getHeight()) / 2);
        jf.setLocation(x, y);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(deposit)) {
            String money = tf3.getText();
            tf3.setText(Integer.parseInt(tf3.getText()) + 100 + "");
        } else if (ae.getSource().equals(withdraw)) {
            String money = tf3.getText();
            if ((Integer.parseInt(tf3.getText()) - 100) < 0) {
                tf3.setText("0");
            } else {
                tf3.setText((Integer.parseInt(tf3.getText()) - 100) + "");
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent ev) {
        Student s = null;
        try {
            try (FileInputStream fin = new FileInputStream("StudentM.dat"); ObjectInputStream in = new ObjectInputStream(fin)) {
                s = (Student) in.readObject();
            }
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
//        System.out.println("Deserialized Student.");
//        System.out.println("Name: " + s.name);
//        System.out.println("ID: " + s.id);
        tf1.setText(s.getID()+ "");
        tf2.setText(s.getName());
        tf3.setText(s.getMoney()+ "");
    }

    @Override
    public void windowClosing(WindowEvent ev) {
//        System.out.println("hello");
        try ( FileOutputStream fileOutput = new FileOutputStream("StudentM.dat");  ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);) {
            objectOutput.writeObject(new Student(tf2.getText(), Integer.parseInt(tf1.getText()), Integer.parseInt(tf3.getText())));
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    @Override
    public void windowClosed(WindowEvent ev) {
    }

    @Override
    public void windowIconified(WindowEvent ev) {
    }

    @Override
    public void windowDeiconified(WindowEvent ev) {
    }

    @Override
    public void windowActivated(WindowEvent ev) {
    }

    @Override
    public void windowDeactivated(WindowEvent ev) {
    }

    public static void main(String[] args) {
        new StudentView();
    }
}
