
import java.awt.event.*;

public class BookController implements ActionListener {

    private boolean isAddViewOpen = false;
    final private BookView bookView;
    private BookAddView bookAddView;
    final private BookModel bookModel;

    public boolean isIsAddViewOpen() {
        return isAddViewOpen;
    }

    public void setIsAddViewOpen(boolean isAddViewOpen) {
        this.isAddViewOpen = isAddViewOpen;
    }

    public BookController() {
        this.bookView = new BookView();
        this.bookModel = new BookModel();

        this.init();
    }

    public void init() {
        Thread threadView = new Thread(bookView);
        threadView.start();

        /* Register for listener */
        bookView.getButtonAdd().addActionListener(this);
        bookView.getButtonPrev().addActionListener(this);
        bookView.getButtonNext().addActionListener(this);
        bookView.getButtonUpdate().addActionListener(this);
        bookView.getButtonDelete().addActionListener(this);
    }

    public void updateGUI() {
        if (bookModel.getCurrentPage() == 0) {
            bookView.getTextFieldName().setText("");
            bookView.getTextFieldPrice().setText("");
            bookView.getTextFieldCurrentBook().setText("0");
            bookView.getComboBoxType().setSelectedItem("General");
            return;
        }

        Book currentBook = (Book) bookModel.getBook(bookModel.getCurrentPage() - 1);
        bookView.refresh(currentBook.getName(), "" + currentBook.getPrice(), currentBook.getType(), bookModel.getCurrentPage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Add")) {
            if (!isAddViewOpen) {
                openAddBook();
            }
        }

        if (e.getActionCommand().equals("Insert")) {

            String toInsertName = bookAddView.getTextFieldName().getText();
            String toInsertPrice = bookAddView.getTextFieldPrice().getText();
            String toInsertType = bookAddView.getComboBoxType().getSelectedItem().toString();

            bookModel.insertBook(toInsertName, Double.parseDouble(toInsertPrice), toInsertType);
            bookModel.saveBooks();
        }

        if (e.getActionCommand().equals("<<<")) {
            bookModel.decreasePage();
            this.updateGUI();
        }

        if (e.getActionCommand().equals(">>>")) {
            bookModel.increasePage();
            this.updateGUI();
        }

        if (e.getActionCommand().equals("Update")) {
            System.out.println("update");
            String toUpdateName = bookView.getTextFieldName().getText();
            double toUpdatePrice = Double.parseDouble(bookView.getTextFieldPrice().getText());
            String toUpdateType = bookView.getComboBoxType().getSelectedItem().toString();

            bookModel.updateBook(toUpdateName, toUpdatePrice, toUpdateType, bookModel.getCurrentPage());
            this.updateGUI();
            bookModel.saveBooks();
        }

        if (e.getActionCommand().equals("Delete")) {

            if (bookModel.getCurrentPage() == bookModel.getBooksAmount()) {
                System.out.println("LAST OF INDEX IS: " + (bookModel.getCurrentPage() - 1));
            }

            bookModel.decreasePage();
            this.updateGUI();
            bookModel.removeBook(bookModel.getCurrentPage());
            bookModel.saveBooks();
        }
    }

    class WindowHandler extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            // Close addBook
            closeAddBook();
        }
    }

    public void openAddBook() {
        this.bookAddView = new BookAddView();
        Thread threadAddView = new Thread(bookAddView);
        threadAddView.start();

        bookAddView.getFrame().addWindowListener(new WindowHandler());
        // Flag it!
        this.setIsAddViewOpen(true);
        /* Feature */
        bookAddView.getButtonInsert().addActionListener(this);
    }

    public void closeAddBook() {
        // Flag it!
        this.setIsAddViewOpen(false);
    }
}
