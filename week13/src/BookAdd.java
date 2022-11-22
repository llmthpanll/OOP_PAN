import javax.swing.*;
import java.awt.*;

public class BookAdd{
    private JFrame frame;
    private JPanel pn1, pn2, pn3, pn4;
    private JLabel lb1, lb2, lb3;
    private JTextField tfname, tfprice;
    private JButton btnin;
    private JComboBox comboBox;
    public BookAdd(){
        frame = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        tfname = new JTextField();
        tfprice = new JTextField();
        comboBox = new JComboBox();
        btnin = new JButton("Insert");
        comboBox.addItem("General");
        comboBox.addItem("Computer");
        comboBox.addItem("Math&Sci");
        comboBox.addItem("Photo");

        pn1.setLayout(new GridLayout(3,2));
        pn1.add(lb1);
        pn1.add(tfname);
        pn1.add(lb2);
        pn1.add(tfprice);
        pn1.add(lb3);
        pn1.add(comboBox);
        pn2.setLayout(new FlowLayout());
        pn2.add(btnin);

        frame.setLayout(new BorderLayout());
        frame.add(pn1, BorderLayout.CENTER);
        frame.add(pn2, BorderLayout.SOUTH);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setVisible(false);
    }

//    public static void main(String[] args) {
//        new BookDisplayView();
//    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
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

    public JButton getBtnin() {
        return btnin;
    }

    public void setBtnin(JButton btnin) {
        this.btnin = btnin;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }
}
