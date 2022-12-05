


import java.awt.*;
import javax.swing.*;


public class BookView {
    private JFrame frame;
    private JPanel panel, panel2, panel3, mainpanel;
    private JLabel labelname, labelprice, labeltype;
    private JTextField txtname, txtprice, txtpage;
    private JComboBox combo;
    private JButton btnless, btnmore, btnadd, btnupdate, btndelete;
    
    public BookView(){
        frame = new JFrame("test");
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        mainpanel = new JPanel();
        labelname = new JLabel("name");
        labelprice = new JLabel("price");
        labeltype = new JLabel("type");
        txtname = new JTextField();
        txtprice = new JTextField();
        txtpage = new JTextField("0", 4);
        combo = new JComboBox();
        btnless = new JButton("<<<");
        btnmore = new JButton(">>>");
        btnadd = new JButton("add");
        btnupdate = new JButton("update");
        btndelete = new JButton("delete");
        
        panel.setLayout(new GridLayout(3,2));
        panel.add(labelname);
        panel.add(txtname);
        panel.add(labelprice);
        panel.add(txtprice);
        panel.add(labeltype);
        combo.addItem("General");
        combo.addItem("Computer");
        combo.addItem("Math&Sci");
        combo.addItem("Photo");
        panel.add(combo);
        
        panel2.add(btnless);
        panel2.add(txtpage);
        panel2.add(btnmore);
        
        
        panel3.add(btnadd);
        panel3.add(btnupdate);
        panel3.add(btndelete);
        
        
        mainpanel.setLayout(new GridLayout(2,1));
        mainpanel.add(panel2);
        mainpanel.add(panel3);
        
        
        frame.setLayout(new GridLayout(2,1));
        frame.add(panel);
        frame.add(mainpanel);
//        frame.add(panel2);
//        frame.add(panel3);
        frame.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
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

    public JTextField getTxtpage() {
        return txtpage;
    }

    public void setTxtpage(JTextField txtpage) {
        this.txtpage = txtpage;
    }

    public JComboBox getCombo() {
        return combo;
    }

    public void setCombo(JComboBox combo) {
        this.combo = combo;
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

    public JButton getBtnupdate() {
        return btnupdate;
    }

    public void setBtnupdate(JButton btnupdate) {
        this.btnupdate = btnupdate;
    }

    public JButton getBtndelete() {
        return btndelete;
    }

    public void setBtndelete(JButton btndelete) {
        this.btndelete = btndelete;
    }
    
}