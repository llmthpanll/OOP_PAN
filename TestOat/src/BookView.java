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
public class BookView {
    private JFrame fr;
    private JPanel p1,p2,p3;
    private JLabel lb1,lb2,lb3;
    private JTextField tf1,tf2,tf3;
    private JComboBox cb;
    private JButton btn1,btn2,btn3,btn4,btn5;
    public BookView(){
        fr = new JFrame("BookView");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField("0");
        cb = new JComboBox();
        btn1 = new JButton(" <<< ");
        btn2 = new JButton(" >>> ");
        btn3 = new JButton("Add");
        btn4 = new JButton("Update");
        btn5 = new JButton("Delete");
        
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.add(p3, BorderLayout.SOUTH);    
        
        p1.setLayout(new GridLayout(3,1));
        p2.setLayout(new FlowLayout());
        p3.setLayout(new FlowLayout());
        
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
        p2.add(tf3);
        tf3.setEditable(false);
        p2.add(btn2);
        
        p3.add(btn3);
        p3.add(btn4);
        p3.add(btn5);
        
        fr.setSize(300,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    public JPanel getP3() {
        return p3;
    }

    public void setP3(JPanel p3) {
        this.p3 = p3;
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

    public JTextField getTf3() {
        return tf3;
    }

    public void setTf3(JTextField tf3) {
        this.tf3 = tf3;
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

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }
    
}
