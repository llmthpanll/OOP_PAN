package lab01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PoringConstructor implements ActionListener {
    int numberOfPoring = 0;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private Poring poring;
    public PoringConstructor() {
        frame = new JFrame("Poring");
        frame.setLayout(new BorderLayout());
        panel = new JPanel();
        button = new JButton("Add");
        button.addActionListener(this);
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        frame.setVisible(true);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)){
            numberOfPoring++;
            Poring poring = new Poring(numberOfPoring);
            Thread thread = new Thread(poring);
            thread.start();
        }
    }

    public static void main(String[] args) {
        new PoringConstructor();
    }
}
