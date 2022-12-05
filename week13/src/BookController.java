
import java.awt.event.*;
import javax.swing.*;

public class BookController implements ActionListener, WindowListener {

    private BookView bookView;
    private BookAdd bookAdd;
    private BookModel model;
    private Book book;
    private int index;

    public BookController() {
        bookView = new BookView();
        model = new BookModel();
        index = Integer.parseInt(bookView.getCollectionTextField().getText());

        bookView.getAddButton().addActionListener(this);
        bookView.getUpdateButton().addActionListener(this);
        bookView.getDeleteButton().addActionListener(this);
        bookView.getLeftButton().addActionListener(this);
        bookView.getRightButton().addActionListener(this);
        bookView.getBookViewWindow().addWindowListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == "Add") {
            bookAdd = new BookAdd();
            bookAdd.getInsertButton().addActionListener(this);
        } else if (ae.getActionCommand() == "Insert") {
            book = new Book(bookAdd.getNameTextField().getText(), Double.parseDouble(bookAdd.getPriceTextField().getText()), (String) (bookAdd.getTypeComboBox().getSelectedItem()));
            model.addBook(book);
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
            bookAdd.getBookAddWindow().dispose();
        } else if (ae.getActionCommand() == "Update" && index != 0) {
            model.getBooks().set(index, new Book(bookView.getNameTextField().getText(), Double.parseDouble(bookView.getPriceTextField().getText()), (String) (bookView.getTypeComboBox().getSelectedItem())));
            JOptionPane.showMessageDialog(null, "Done it.", "Update", JOptionPane.PLAIN_MESSAGE);
        } else if (ae.getActionCommand() == "Delete" && index != 0) {
            model.getBooks().remove(index);
            index--;
            if (index == 0) {
                bookView.getNameTextField().setText("");
                bookView.getPriceTextField().setText("");
                bookView.getCollectionTextField().setText(index + "");
                bookView.getTypeComboBox().setSelectedItem("General");
            } else {
                bookView.getNameTextField().setText(((Book) (model.getBooks().get(index))).getName());
                bookView.getPriceTextField().setText(((Book) (model.getBooks().get(index))).getPrice() + "");
                bookView.getTypeComboBox().setSelectedItem(((Book) (model.getBooks().get(index))).getType());
                bookView.getCollectionTextField().setText(index + "");
            }
            JOptionPane.showMessageDialog(null, "Done it.", "Delete", JOptionPane.PLAIN_MESSAGE);
        } else if (ae.getActionCommand() == "<<<" && index > 0) {
            index--;
            if (index == 0) {
                bookView.getNameTextField().setText("");
                bookView.getPriceTextField().setText("");
                bookView.getCollectionTextField().setText(index + "");
                bookView.getTypeComboBox().setSelectedItem("General");
            } else {
                bookView.getNameTextField().setText(((Book) (model.getBooks().get(index))).getName());
                bookView.getPriceTextField().setText(((Book) (model.getBooks().get(index))).getPrice() + "");
                bookView.getTypeComboBox().setSelectedItem(((Book) (model.getBooks().get(index))).getType());
                bookView.getCollectionTextField().setText(index + "");
            }
        } else if (ae.getActionCommand() == ">>>" && index + 1 < model.getBooks().size()) {
            index++;
            bookView.getNameTextField().setText(((Book) (model.getBooks().get(index))).getName());
            bookView.getPriceTextField().setText(((Book) (model.getBooks().get(index))).getPrice() + "");
            bookView.getTypeComboBox().setSelectedItem(((Book) (model.getBooks().get(index))).getType());
            bookView.getCollectionTextField().setText(index + "");
        }
    }

    public void windowOpened(WindowEvent ev) {
        model.loadFile();
    }

    public void windowClosed(WindowEvent ev) {
    }

    public void windowClosing(WindowEvent ev) {
        model.saveFile();
    }

    public void windowIconified(WindowEvent ev) {
    }

    public void windowDeiconified(WindowEvent ev) {
    }

    public void windowActivated(WindowEvent ev) {
    }

    public void windowDeactivated(WindowEvent ev) {
    }
}
