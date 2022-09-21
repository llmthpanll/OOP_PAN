
import java.awt.*;
import javax.swing.*;

public class MnGUI extends JFrame {

    private JDesktopPane desktopPane;
    private JInternalFrame frame1;
    private JInternalFrame frame2;
    private JInternalFrame frame3;
    private JMenuBar mb;
    private JMenu m1;
    private JMenu m2;
    private JMenu m3;
    private JMenu ms1;
    private JMenuItem mi2;
    private JMenuItem mi3;
    private JMenuItem mi4;
    private JMenuItem msi1;
    private JMenuItem msi2;

    public MnGUI() {
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
//        frame1.pack();
        frame1.setSize(200, 200);
        frame1.setVisible(true);
//        frame2.pack();
        frame2.setSize(200, 200);
        frame2.setVisible(true);
//        frame3.pack();
        frame3.setSize(200, 200);
        frame3.setVisible(true);
        
        frame1.setLocation(250, 100);
        frame2.setLocation(500, 320);
        frame3.setLocation(1002, 100);
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);

        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        this.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);

        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.pack();
        this.setSize(200, 200);
        this.setVisible(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        MnGUI frame = new MnGUI();
    }
}
