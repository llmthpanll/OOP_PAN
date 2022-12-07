
import java.awt.event.*;
import javax.swing.*;

public class BookController implements ActionListener, WindowListener {

    private BookView view;
    private BookAdd bookAdd;
    private BookModel model;
    private Book book;
    private int index;

    public BookController() {
        model = new BookModel();
        view = new BookView();
        bookAdd = new BookAdd();
        init();
    }

    public void init() {
        index = Integer.parseInt(view.getTxtpage().getText());
        view.getBtnadd().addActionListener(this);
        view.getBtnupdate().addActionListener(this);
        view.getBtndelete().addActionListener(this);
        view.getBtnless().addActionListener(this);
        view.getBtnmore().addActionListener(this);
        view.getFrame().addWindowListener(this);
        bookAdd.getBtninsert().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnadd())) {
            bookAdd.getFrame().setVisible(true);
        } else if (e.getSource().equals(bookAdd.getBtninsert())) { //insert
            book = new Book(bookAdd.getTxtname().getText(), Double.parseDouble(bookAdd.getTxtprice().getText()), (String) bookAdd.getCombo().getSelectedItem());
            model.addBook(book);
            bookAdd.getFrame().dispose();
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
            System.out.println("insert finish");
            bookAdd.getTxtname().setText("");
            bookAdd.getTxtprice().setText("");
        } else if (e.getSource().equals(view.getBtnupdate()) && index != 0) { // update
            model.getBooks().set(index, new Book(view.getTxtname().getText(), Double.parseDouble(view.getTxtprice().getText()), (String) view.getCombo().getSelectedItem()));
            JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Update finish");
        } else if (e.getSource().equals(view.getBtndelete()) && index != 0) { //delete
            model.getBooks().remove(index);
            index--;
            if (index == 0) {
                view.getTxtname().setText("");
                view.getTxtprice().setText("");
                view.getTxtpage().setText(index + "");
                view.getCombo().setSelectedIndex(0);
            } else {
                view.getTxtname().setText(((Book) (model.getBooks().get(index))).getName());
                view.getTxtprice().setText(((Book) (model.getBooks().get(index))).getPrice() + "");
                view.getTxtpage().setText(index + "");
                view.getCombo().setSelectedItem(((Book) (model.getBooks().get(index))).getType());
            }
            JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Delete finish");
        } else if (e.getSource().equals(view.getBtnless()) && index > 0) { //<<<
            index--;
            if (index == 0) {
                view.getTxtname().setText("");
                view.getTxtprice().setText("");
                view.getTxtpage().setText(index + "");
                view.getCombo().setSelectedIndex(0);
            } else {
                view.getTxtname().setText(((Book) (model.getBooks().get(index))).getName());
                view.getTxtprice().setText(((Book) (model.getBooks().get(index))).getPrice() + "");
                view.getTxtpage().setText(index + "");
                view.getCombo().setSelectedItem(((Book) (model.getBooks().get(index))).getType());
            }
        } else if (e.getSource().equals(view.getBtnmore()) && index + 1 < model.getBooks().size()) { //>>>
            index++;
            view.getTxtname().setText(((Book) (model.getBooks().get(index))).getName());
            view.getTxtprice().setText(((Book) (model.getBooks().get(index))).getPrice() + "");
            view.getTxtpage().setText(index + "");
            view.getCombo().setSelectedItem(((Book) (model.getBooks().get(index))).getType());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        model.loadFile();
    }
    @Override
    public void windowClosing(WindowEvent e) {
        model.saveFile();
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

}
