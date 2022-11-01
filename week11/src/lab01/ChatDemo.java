package lab01;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class ChatDemo extends JFrame implements ActionListener, WindowListener {

    private JPanel pn1;
    private JTextArea ta;
    private JTextField tf;
    private JButton btn1;
    private JButton btn2;
    String chatText = "";

    public ChatDemo() {
        pn1 = new JPanel();
        ta = new JTextArea(20, 45);
        tf = new JTextField(45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");
        ta.setEnabled(false);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        pn1.add(btn1);
        pn1.add(btn2);
        this.addWindowListener(this);
        this.setLayout(new BorderLayout());
        this.add(ta, BorderLayout.NORTH);
        this.add(tf, BorderLayout.CENTER);
        this.add(pn1, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn1)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//            System.out.print(dtf.format(LocalDateTime.now()));
            String txt = tf.getText();
            String tarea = ta.getText();
            ta.setText(tarea + dtf.format(LocalDateTime.now()) + " : " + txt + "\n");
            tf.setText("");
        } else if (ae.getSource().equals(btn2)) {
            tf.setText("");
            ta.setText("");
        }
    }

    @Override
    public void windowClosing(WindowEvent we) {
        String str = ta.getText();
        try ( FileWriter fw = new FileWriter("ChatDemo.dat");) {
            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i));
            }
            System.out.println("Writing successful");
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try ( FileReader fileReader = new FileReader("ChatDemo.dat")) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                chatText += (char) ch;
            }
            ta.setText(chatText);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new ChatDemo();
    }
}
