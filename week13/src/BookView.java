import javax.swing.*;

public class BookView {
    private JFrame frame;
    private JPanel pn1, pn2;
    private JLabel lb1, lb2, lb3;
    private JTextField tf, tfname, tfprice;

    public BookView(){
        frame = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        tfname = new JTextField();
        tfprice = new JTextField();
        tf = new JTextField();
    }
}
