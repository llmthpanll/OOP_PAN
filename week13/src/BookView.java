import javax.swing.*;
import java.awt.*;

public class BookView implements BookRefInterface{
    private JFrame frame;
    private JPanel pn1, pn2, pn3, pn4;
    private JLabel lb1, lb2, lb3;
    private JTextField tf, tfname, tfprice;
    private JButton btnless, btnmore, btnadd, btnup, btnde;
    private JComboBox comboBox;

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JTextField getTf() {
        return tf;
    }

    public void setTf(JTextField tf) {
        this.tf = tf;
    }

    public JTextField getTfname() {
        return tfname;
    }

    public void setTfname(JTextField tfname) {
        this.tfname = tfname;
    }

    public JTextField getTfprice() {
        return tfprice;
    }

    public void setTfprice(JTextField tfprice) {
        this.tfprice = tfprice;
    }

    public JButton getBtnless() {
        return btnless;
    }

    public void setBtnless(JButton btnless) {
        this.btnless = btnless;
    }

    public JButton getBtnmore() {
        return btnmore;
    }

    public void setBtnmore(JButton btnmore) {
        this.btnmore = btnmore;
    }

    public JButton getBtnadd() {
        return btnadd;
    }

    public void setBtnadd(JButton btnadd) {
        this.btnadd = btnadd;
    }

    public JButton getBtnup() {
        return btnup;
    }

    public void setBtnup(JButton btnup) {
        this.btnup = btnup;
    }

    public JButton getBtnde() {
        return btnde;
    }

    public void setBtnde(JButton btnde) {
        this.btnde = btnde;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public BookView(){
        frame = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        tfname = new JTextField();
        tfprice = new JTextField();
        tf = new JTextField();
        comboBox = new JComboBox();
        btnless = new JButton("<<<");
        btnmore = new JButton(">>>");
        btnadd = new JButton("Add");
        btnup = new JButton("Update");
        btnde = new JButton("Delete");
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(lb1);
        pn1.add(tfname);
        pn1.add(lb2);
        pn1.add(tfprice);
        pn1.add(lb3);
        comboBox.addItem("General");
        comboBox.addItem("Computer");
        comboBox.addItem("Math&Sci");
        comboBox.addItem("Photo");
        pn1.add(comboBox);
        pn3.add(btnless);
        tf.setColumns(3);
        pn3.add(tf);
        pn3.add(btnmore);
        pn4.add(btnadd);
        pn4.add(btnup);
        pn4.add(btnde);

        pn2.setLayout(new GridLayout(2,1));
        pn2.add(pn3);
        pn2.add(pn4);


        frame.setLayout(new GridLayout(2,1));
        frame.add(pn1);
        frame.add(pn2);


        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
    @Override
    public void refresh(String name, String price, String type){
        System.out.println("BookView");
    }
}
