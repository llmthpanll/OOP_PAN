import javax.swing.*;
import java.awt.*;
public class BookAdd {
    JFrame bookAddWindow;
    JLabel nameLabel, priceLabel, typeLabel;
    JTextField nameTextField, priceTextField;
    JComboBox typeComboBox;
    JButton insertButton;
    JPanel topPanel, bottomPanel;
    private String[] allCombo = {"General", "Computer", "Math&Sci", "Photo"};
    
    public BookAdd(){
        bookAddWindow = new JFrame();
        nameLabel = new JLabel(" Name");
        priceLabel = new JLabel(" Price");
        typeLabel = new JLabel(" Type");
        nameTextField = new JTextField();
        priceTextField = new JTextField();
        typeComboBox = new JComboBox(allCombo);
        insertButton = new JButton("Insert");
        topPanel = new JPanel();
        bottomPanel = new JPanel();
        
        topPanel.setLayout(new GridLayout(3,2));
        topPanel.add(nameLabel);    topPanel.add(nameTextField);
        topPanel.add(priceLabel);   topPanel.add(priceTextField);
        topPanel.add(typeLabel);    topPanel.add(typeComboBox);
        
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(insertButton);
        
        bookAddWindow.setLayout(new BorderLayout());
        bookAddWindow.add(topPanel, BorderLayout.NORTH);
        bookAddWindow.add(bottomPanel, BorderLayout.SOUTH);
        
        bookAddWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bookAddWindow.pack();
        bookAddWindow.setLocationRelativeTo(null);
        bookAddWindow.setVisible(true);
    }

    public JFrame getBookAddWindow() {
        return bookAddWindow;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public JLabel getPriceLabel() {
        return priceLabel;
    }

    public JLabel getTypeLabel() {
        return typeLabel;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getPriceTextField() {
        return priceTextField;
    }

    public JComboBox getTypeComboBox() {
        return typeComboBox;
    }

    public JButton getInsertButton() {
        return insertButton;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public String[] getAllCombo() {
        return allCombo;
    }
    
}
