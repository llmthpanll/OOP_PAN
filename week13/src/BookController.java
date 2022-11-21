import lab01.MyTextEditorModel;
import lab01.MyTextEditorView;

import java.awt.event.*;
import java.awt.event.*;

public class BookController implements ActionListener, WindowListener {
    private BookView view;
    private BookModel model;
    private BookAdd displayView;

    public BookController() {
        view = new BookView();
        model = new BookModel();
        displayView = new BookAdd();

        init();
    }
    public void init(){
        view.getBtnless().addActionListener(this);
        view.getBtnmore().addActionListener(this);
        view.getBtnadd().addActionListener(this);
        view.getBtnup().addActionListener(this);
        view.getBtnde().addActionListener(this);
        displayView.getFrame().addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnless())){
            System.out.println("Btnless");
        } else if (e.getSource().equals(view.getBtnmore())) {
            System.out.println("Btnmore");
        } else if (e.getSource().equals(view.getBtnadd())) {
            System.out.println("Btnadd");
            displayView.getFrame().setVisible(true);
        } else if (e.getSource().equals(view.getBtnup())) {
            System.out.println("Btnup");
        } else if (e.getSource().equals(view.getBtnde())) {
            System.out.println("Btnde");
        }
    }




    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


    public static void main(String[] args) {
        new BookController();
    }
}
