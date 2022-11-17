import javax.swing.*;
import java.awt.*;
public class MyTextEditor {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1, mi2, mi3, mi4;
    public MyTextEditor(){
        fr = new JFrame("My Text Editor");
        mb = new JMenuBar();
        m1 = new JMenu("File");
//        m1.setMnemonic(0);
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Close");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        mb.add(m1);
        fr.add(mb);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - fr.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - fr.getHeight()) / 2);
        fr.setLocation(x, y);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyTextEditor();
    }
}
