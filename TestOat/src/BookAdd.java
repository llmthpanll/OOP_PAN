/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author windows
 */
import javax.swing.*;
import java.awt.*;
public class BookAdd{
    private JFrame fr;
    private JPanel p1,p2;
    private JLabel lb1, lb2, lb3;
    private JTextField tf1,tf2;
    private JComboBox cb;
    private JButton btn1;
    public BookAdd(){
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        tf1 = new JTextField();
        tf2 = new JTextField();
        cb = new JComboBox();
        btn1 = new JButton("Insert");
        
        fr.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3,1));
        p2.setLayout(new FlowLayout());
        fr.add(p1, BorderLayout.CENTER);
        fr.add(p2, BorderLayout.SOUTH);
        
        p1.add(lb1);
        p1.add(tf1);
        p1.add(lb2);
        p1.add(tf2);
        p1.add(lb3);
        p1.add(cb);
        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        
        p2.add(btn1);
        
        fr.setSize(300, 150);
        fr.setVisible(false);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getP1() {
        return p1;
    }

    public void setP1(JPanel p1) {
        this.p1 = p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public void setP2(JPanel p2) {
        this.p2 = p2;
    }

    public JLabel getLb1() {
        return lb1;
    }

    public void setLb1(JLabel lb1) {
        this.lb1 = lb1;
    }

    public JLabel getLb2() {
        return lb2;
    }

    public void setLb2(JLabel lb2) {
        this.lb2 = lb2;
    }

    public JLabel getLb3() {
        return lb3;
    }

    public void setLb3(JLabel lb3) {
        this.lb3 = lb3;
    }

    public JTextField getTf1() {
        return tf1;
    }

    public void setTf1(JTextField tf1) {
        this.tf1 = tf1;
    }

    public JTextField getTf2() {
        return tf2;
    }

    public void setTf2(JTextField tf2) {
        this.tf2 = tf2;
    }

    public JComboBox getCb() {
        return cb;
    }

    public void setCb(JComboBox cb) {
        this.cb = cb;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }
    
}
