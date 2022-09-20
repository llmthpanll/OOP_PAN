
import java.awt.*;
import javax.swing.*;

public class MnGUI extends JFrame {

    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2;

    public MnGUI() {
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Frame 1", true, true, true, true);
        frame2 = new JInternalFrame("Frame 2", true, true, true, true);
        frame1.getContentPane().add(new JLabel("Frame 1 contents..."));
        frame1.pack();
        frame1.setVisible(true);
        frame2.getContentPane().add(new JLabel("Frame 2 contents..."));
        frame2.pack();
        frame2.setVisible(true);
        int x2 = frame1.getX() + frame1.getWidth() + 10;
        int y2 = frame1.getY();
        frame2.setLocation(x2, y2);
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(300, 300));
        this.pack();
        this.setVisible(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        MnGUI frame = new MnGUI();
    }
}
