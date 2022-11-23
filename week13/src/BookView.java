import javax.swing.*;
import java.awt.*;
public class BookView {
    private JLabel nameLabel, priceLabel, typeLabel;
    private JTextField nameTextField, priceTextField, collectionTextField;
    private JComboBox typeComboBox;
    private JButton leftButton, rightButton, addButton, updateButton, deleteButton;
    private JFrame bookViewWindow;
    private JPanel collectionPanel, orderingPanel, bottomPanel, topPanel;
    private String[] allCombo = {"General", "Computer", "Math&Sci", "Photo"};
    
    public BookView(){
        bookViewWindow = new JFrame();
        nameLabel = new JLabel(" Name");
        priceLabel = new JLabel(" Price");
        typeLabel = new JLabel(" Type");
        nameTextField = new JTextField(null);
        priceTextField = new JTextField(null);
        collectionTextField = new JTextField("0");
        typeComboBox = new JComboBox(allCombo);
        leftButton = new JButton("<<<");
        rightButton = new JButton(">>>");
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        collectionPanel = new JPanel();
        orderingPanel = new JPanel();
        bottomPanel = new JPanel();
        topPanel = new JPanel();
        
        collectionTextField.setColumns(5);
        collectionTextField.setEditable(false);
        
        collectionPanel.setLayout(new FlowLayout());
        collectionPanel.add(leftButton);    collectionPanel.add(collectionTextField);
        collectionPanel.add(rightButton);
        
        orderingPanel.setLayout(new FlowLayout());
        orderingPanel.add(addButton);   orderingPanel.add(updateButton);
        orderingPanel.add(deleteButton);
        
        bottomPanel.setLayout(new GridLayout(2,1));
        bottomPanel.add(collectionPanel);   bottomPanel.add(orderingPanel);
        
        topPanel.setLayout(new GridLayout(3,2));
        topPanel.add(nameLabel);    topPanel.add(nameTextField);
        topPanel.add(priceLabel);   topPanel.add(priceTextField);
        topPanel.add(typeLabel);    topPanel.add(typeComboBox);
        
        bookViewWindow.setLayout(new BorderLayout());
        bookViewWindow.add(topPanel, BorderLayout.NORTH);
        bookViewWindow.add(bottomPanel, BorderLayout.SOUTH);
        
        bookViewWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bookViewWindow.pack();
        bookViewWindow.setLocationRelativeTo(null);
        bookViewWindow.setVisible(true);
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

    public JButton getLeftButton() {
        return leftButton;
    }

    public JButton getRightButton() {
        return rightButton;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JFrame getBookViewWindow() {
        return bookViewWindow;
    }

    public JPanel getOrderingPanel() {
        return orderingPanel;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public JPanel getTopPanel() {
        return topPanel;
    }

    public String[] getAllCombo() {
        return allCombo;
    }

    public JTextField getCollectionTextField() {
        return collectionTextField;
    }

    public JPanel getCollectionPanel() {
        return collectionPanel;
    }
    
}
