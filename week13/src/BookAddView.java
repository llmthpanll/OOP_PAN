import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BookAddView implements Runnable{

    String types[] = {"General", "Computer", "Math&Sci", "Photo"};

    private SubFrame frame;
    private Panel panelCenter, panelBottom;
    private Label labelName, labelPrice, labelType;
    private TextField textFieldName, textFieldPrice;
    private ComboBox comboBoxType;
    private Button buttonInsert;

    public SubFrame getFrame() {
        return frame;
    }

    public ComboBox getComboBoxType() {
        return comboBoxType;
    }

    public Button getButtonInsert() {
        return buttonInsert;
    }

    public TextField getTextFieldName() {
        return textFieldName;
    }

    public TextField getTextFieldPrice() {
        return textFieldPrice;
    }
    
    

    public BookAddView() {
        frame = new SubFrame();
        panelCenter = new Panel(new GridLayout(3, 2));
        panelBottom = new Panel(new FlowLayout());
        labelName = new Label("Name");
        labelPrice = new Label("Price");
        labelType = new Label("Type");
        textFieldName = new TextField();
        textFieldPrice = new TextField();
        comboBoxType = new ComboBox(types);

        buttonInsert = new Button("Insert");

        panelCenter.add(labelName);
        panelCenter.add(textFieldName);
        panelCenter.add(labelPrice);
        panelCenter.add(textFieldPrice);
        panelCenter.add(labelType);
        panelCenter.add(comboBoxType);
        frame.add(panelCenter);

        panelBottom.add(buttonInsert);
        frame.add(panelBottom, BorderLayout.SOUTH);

        frame.config();
    }
    
    @Override
    public void run(){
        System.out.println("Book add.");
    }
}

class SubFrame extends JFrame {

    public SubFrame() {
        this.setTitle("Book add");
    }

    public void config() {
        this.setSize(280,200);
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

class Label extends JLabel {

    public Label(String text) {
        this.setText(text);
    }
}

class TextField extends JTextField {

    public TextField() {
        this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
}

class ComboBox extends JComboBox {

    public ComboBox(String types[]) {
        for (String type : types) {
            this.addItem(type);
        }
    }
}

class Button extends JButton {

    public Button(String text) {
        this.setText(text);
    }
}