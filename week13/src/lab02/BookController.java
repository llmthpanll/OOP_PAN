package lab02;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class BookController implements ActionListener {

    private BookView view;
    private BookModel model;
    private BookAdd addbook;

    public BookController() {
        view = new BookView();
        model = new BookModel();
        addbook = new BookAdd();

        init();
    }

    public void init() {
        if (model.loadData()) {
//            view.setData(model.getData().getName(), model.getData().getPrice(), model.getData().getType());
        }
        view.getBtnless().addActionListener(this);
        view.getBtnmore().addActionListener(this);
        view.getBtnadd().addActionListener(this);
        view.getBtnup().addActionListener(this);
        view.getBtnde().addActionListener(this);
        addbook.getBtnin().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnless())) {
            System.out.println("<<<");
        } else if (e.getSource().equals(view.getBtnmore())) {
            System.out.println(">>>");
        } else if (e.getSource().equals(view.getBtnadd())) {
            System.out.println("add");
            addbook.getFrame().setVisible(true);
        } else if (e.getSource().equals(view.getBtnup())) {
            System.out.println("update");
            JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.PLAIN_MESSAGE);
        } else if (e.getSource().equals(view.getBtnde())) {
            System.out.println("delete");
            JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.PLAIN_MESSAGE);
        } else if (e.getSource().equals(addbook.getBtnin())) {
            System.out.println("insert");
            String name = addbook.getTfname().getText();
            Double price = Double.valueOf(addbook.getTfprice().getText());
            String type = (String) addbook.getComboBox().getSelectedItem();
            model.setBooktoarray(name, price, type);
            if (model.saveData()) {
                System.out.println(name);
                System.out.println(price);
                System.out.println(type);
                System.out.println("Complete");
            } else {
                System.out.println("Fail!");
            }
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
            addbook.getFrame().dispose();
        }
    }

    public static void main(String[] args) {
        new BookController();
    }
}
