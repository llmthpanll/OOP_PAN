
import java.awt.*;
import javax.swing.*;

public class CalculatorSample extends JFrame {

    private JPanel p;
    private JLabel lbl;
    private JTextField txt;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton btn14;
    private JButton btn15;
    private JButton btn16;

    public CalculatorSample() {
        p = new JPanel();
        txt = new JTextField();
        btn1 = new JButton("7");
        btn2 = new JButton("8");
        btn3 = new JButton("9");
        btn4 = new JButton("+");
        btn5 = new JButton("4");
        btn6 = new JButton("5");
        btn7 = new JButton("6");
        btn8 = new JButton("-");
        btn9 = new JButton("1");
        btn10 = new JButton("2");
        btn11 = new JButton("3");
        btn12 = new JButton("x");
        btn13 = new JButton("0");
        btn14 = new JButton("c");
        btn15 = new JButton("=");
        btn16 = new JButton("/");

        p.setLayout(new GridLayout(4, 4));
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn10);
        p.add(btn11);
        p.add(btn12);
        p.add(btn13);
        p.add(btn14);
        p.add(btn15);
        p.add(btn16);

        this.setTitle("calculator");
        this.setLayout(new BorderLayout());
        this.add(txt, BorderLayout.NORTH);
        this.add(p);

        this.setSize(250, 250);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
//        System.out.println(dimension.getWidth());
//        System.out.println(dimension.getHeight());
//        System.out.println(x);
//        System.out.println(y);
        txt.setEditable(false);
        this.setLocation(x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }
}
