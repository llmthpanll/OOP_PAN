
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MyTextEditorController implements ActionListener {

    private MyTextEditorView view;
    private MyTextEditorModel model;

    public MyTextEditorController() {
        view = new MyTextEditorView();
        model = new MyTextEditorModel();
        init();
    }

    public void init() {
        view.getMi1().addActionListener(this);
        view.getMi2().addActionListener(this);
        view.getMi3().addActionListener(this);
        view.getMi4().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getMi1()) {
            view.getTextarea().setText("");
        } else if (e.getSource() == view.getMi2()) {
//            view.getFr().dispose();
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(view.getFr()); // 
            File f = fc.getSelectedFile();
        } else if (e.getSource() == view.getMi3()) {
//            view.getFr().dispose();
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(view.getFr()); // fr คือ ตัวแปรออปเจ็ค JFrame
            File f = fc.getSelectedFile();
        } else if (e.getSource() == view.getMi4()) {
            view.getFr().dispose();
        }
    }

}
