
import java.awt.*;
import javax.swing.*;

public class BookView implements Runnable, Refresh {

    String types[] = {"General", "Computer", "Math&Sci", "Photo"};

    private MainFrame frame;
    private Panel panelTop, panelCenter, panelBottom;
    private TextField textFieldName, textFieldPrice, textFieldCurrentBook;
    private ComboBox comboBoxType;
    private Button buttonPrev, buttonNext, buttonAdd, buttonUpdate, buttonDelete;
    private Label labelName, labelPrice, labelType;

    public BookView() {
        frame = new MainFrame();
        panelTop = new Panel(new GridLayout(3, 2));
        panelCenter = new Panel(new GridLayout(1, 3));
        panelBottom = new Panel(new FlowLayout());
        labelName = new Label("Name");
        labelPrice = new Label("Price");
        labelType = new Label("Type");
        textFieldName = new TextField();
        textFieldPrice = new TextField();
        comboBoxType = new ComboBox(types);
        buttonPrev = new Button("<<<");
        buttonNext = new Button(">>>");
        textFieldCurrentBook = new TextField();
        buttonAdd = new Button("Add");
        buttonUpdate = new Button("Update");
        buttonDelete = new Button("Delete");

        panelTop.add(labelName);
        panelTop.add(textFieldName);
        panelTop.add(labelPrice);
        panelTop.add(textFieldPrice);
        panelTop.add(labelType);
        panelTop.add(comboBoxType);

        panelCenter.add(buttonPrev);
        textFieldCurrentBook.setText("0");
        textFieldCurrentBook.setHorizontalAlignment(JTextField.CENTER);
        panelCenter.add(textFieldCurrentBook);
        panelCenter.add(buttonNext);

        panelBottom.add(buttonAdd);
        panelBottom.add(buttonUpdate);
        panelBottom.add(buttonDelete);

        frame.add(panelTop, BorderLayout.NORTH);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelBottom, BorderLayout.SOUTH);

        frame.config();
    }

    @Override
    public void refresh(String bookName, String bookPrice, String bookType, int CurrentPage) {
        this.getTextFieldName().setText(bookName);
        this.getTextFieldPrice().setText(bookPrice);
        this.getTextFieldCurrentBook().setText("" + CurrentPage);
        this.getComboBoxType().setSelectedItem(bookType);
    }

    @Override
    public void run() {
        System.out.println("Book view.");
    }

    public Button getButtonPrev() {
        return buttonPrev;
    }

    public Button getButtonNext() {
        return buttonNext;
    }

    public Button getButtonAdd() {
        return buttonAdd;
    }

    public Button getButtonUpdate() {
        return buttonUpdate;
    }

    public Button getButtonDelete() {
        return buttonDelete;
    }

    public TextField getTextFieldName() {
        return textFieldName;
    }

    public TextField getTextFieldPrice() {
        return textFieldPrice;
    }

    public TextField getTextFieldCurrentBook() {
        return textFieldCurrentBook;
    }
    
    public ComboBox getComboBoxType(){
        return comboBoxType;
    }
}

class MainFrame extends JFrame {

    public MainFrame() {
        this.setTitle("Book view");
    }

    public void config() {
        this.setSize(400, 225);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Panel extends JPanel {

    public Panel(LayoutManager layout) {
        this.setLayout(layout);
    }
}

class TextField extends JTextField {

    public TextField() {
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }
}

class Button extends JButton {

    public Button(String text) {
        this.setText(text);
    }
}

class Label extends JLabel {

    public Label(String text) {
        this.setText(text);
    }
}

class ComboBox extends JComboBox {

    public ComboBox(String types[]) {
        for (String type : types) {
            this.addItem(type);
        }
    }
}
