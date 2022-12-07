import java.awt.*;
import javax.swing.*;
public class BookAdd {
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel labelname, labelprice, labeltype;
    private JTextField txtname, txtprice;
    private JComboBox combo;
    private JButton btninsert;
    public BookAdd() {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        labelname = new JLabel("name");
        labelprice = new JLabel("price");
        labeltype = new JLabel("type");
        txtname = new JTextField();
        txtprice = new JTextField();
        combo = new JComboBox();
        btninsert = new JButton("insert");
        combo.addItem("General");
        combo.addItem("Computer");
        combo.addItem("Math&Sci");
        combo.addItem("Photo");
        panel1.setLayout(new GridLayout(3, 1));
        panel1.add(labelname);
        panel1.add(txtname);
        panel1.add(labelprice);
        panel1.add(txtprice);
        panel1.add(labeltype);
        panel1.add(combo);
        panel2.add(btninsert);
        frame.add(panel1);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(false);
    }
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JTextField getTxtname() {
        return txtname;
    }
    public void setTxtname(JTextField txtname) {
        this.txtname = txtname;
    }
    public JTextField getTxtprice() {
        return txtprice;
    }
    public void setTxtprice(JTextField txtprice) {
        this.txtprice = txtprice;
    }
    public JComboBox getCombo() {
        return combo;
    }
    public void setCombo(JComboBox combo) {
        this.combo = combo;
    }
    public JButton getBtninsert() {
        return btninsert;
    }
    public void setBtninsert(JButton btninsert) {
        this.btninsert = btninsert;
    }
}
