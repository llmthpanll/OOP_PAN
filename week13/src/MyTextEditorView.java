
import javax.swing.*;
import java.awt.*;

public class MyTextEditorView {

    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1, mi2, mi3, mi4;
    private JTextArea textarea;

    public MyTextEditorView() {
        fr = new JFrame("My Text Editor");
        mb = new JMenuBar();
        m1 = new JMenu("File");
//        m1.setMnemonic(0);
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Close");
        textarea = new JTextArea(20, 40);
        fr.setLayout(new BorderLayout());
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        mb.add(m1);
        fr.add(mb, BorderLayout.NORTH);
        fr.add(textarea, BorderLayout.CENTER);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - fr.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - fr.getHeight()) / 2);
        fr.setLocation(x, y);
        fr.setVisible(true);
    }

    public JTextArea getTextarea() {
        return textarea;
    }

    public void setTextarea(JTextArea textarea) {
        this.textarea = textarea;
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JMenuBar getMb() {
        return mb;
    }

    public void setMb(JMenuBar mb) {
        this.mb = mb;
    }

    public JMenu getM1() {
        return m1;
    }

    public void setM1(JMenu m1) {
        this.m1 = m1;
    }

    public JMenuItem getMi1() {
        return mi1;
    }

    public void setMi1(JMenuItem mi1) {
        this.mi1 = mi1;
    }

    public JMenuItem getMi2() {
        return mi2;
    }

    public void setMi2(JMenuItem mi2) {
        this.mi2 = mi2;
    }

    public JMenuItem getMi3() {
        return mi3;
    }

    public void setMi3(JMenuItem mi3) {
        this.mi3 = mi3;
    }

    public JMenuItem getMi4() {
        return mi4;
    }

    public void setMi4(JMenuItem mi4) {
        this.mi4 = mi4;
    }
}
