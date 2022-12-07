/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author windows
 */
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class BookController implements ActionListener, WindowListener{
    private Book book;
    private BookView bookgui;
    private BookAdd addgui;
    private BookModel model;
    public BookController(){
        book = new Book();
        bookgui = new BookView();
        bookgui.getFr().addWindowListener(this);
        bookgui.getFr().setVisible(true);
        addgui = new BookAdd();
        model = new BookModel();
        bookgui.getBtn1().addActionListener(this);
        bookgui.getBtn2().addActionListener(this);
        bookgui.getBtn3().addActionListener(this);
        bookgui.getBtn4().addActionListener(this);
        bookgui.getBtn5().addActionListener(this);
        addgui.getBtn1().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(bookgui.getBtn1())){
            model.setNow(model.getNow()-1);
            update(model.getPage(model.getNow()));
        }
        else if(e.getSource().equals(bookgui.getBtn2())){
            model.setNow(model.getNow()+1);
            update(model.getPage(model.getNow()));
        }
        else if(e.getSource().equals(bookgui.getBtn3())){
            addgui.getFr().setVisible(true);
        }
        else if(e.getSource().equals(bookgui.getBtn4())){
            model.updatePage(bookgui.getTf1().getText(), Double.parseDouble(bookgui.getTf2().getText()), (String)bookgui.getCb().getSelectedItem());
            JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.PLAIN_MESSAGE);
            update(model.getPage(model.getNow()));
        }
        else if(e.getSource().equals(bookgui.getBtn5())){
            model.removePage(model.getNow());
            JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.PLAIN_MESSAGE);
            if(model.getNumberOfPage() != 0){
                update(model.getPage(model.getNow()));
            }
            else{
                update(new Book("",0,""));
            }
        }
        
        else if(e.getSource().equals(addgui.getBtn1())){
            model.addPage(new Book(addgui.getTf1().getText(), Double.parseDouble(addgui.getTf2().getText()), (String)addgui.getCb().getSelectedItem()));
            JOptionPane.showMessageDialog(null, "Done it.", null, JOptionPane.PLAIN_MESSAGE);
            update(model.getPage(model.getNow()));
            addgui.getFr().dispose();
        }
    }
    public void update(Book p){
        if(model.getNow() != 0){
            bookgui.getTf1().setText(p.getName());
            bookgui.getTf2().setText(p.getPrice()+"");
            bookgui.getCb().setSelectedItem((Object)p.getType());
            bookgui.getTf3().setText(model.getNow()+"");
        }
        else if(model.getNumberOfPage() == 0){
            bookgui.getTf1().setText("");
            bookgui.getTf2().setText("");
            bookgui.getCb().setSelectedItem("General");
            bookgui.getTf3().setText("0");
            model.setNow(0);
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        try(FileInputStream fin = new FileInputStream("Book.data");
            ObjectInputStream oin = new ObjectInputStream(fin);){
            this.model = (BookModel)oin.readObject();
            System.out.println(model.getNumberOfPage());
            System.out.println(model.getNow());
            update(model.getPage(model.getNow()));
            System.out.println("Loaded");
        }
        catch(IOException i){
            System.out.println(i);
        }
        catch(ClassNotFoundException c){
            System.out.println("No Class Found");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(FileOutputStream fout = new FileOutputStream("Book.data");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            ObjectOutputStream oout = new ObjectOutputStream(bout);){
            System.out.println(model.getNumberOfPage());
            System.out.println(model.getNow());
            oout.writeObject(model);
            System.out.println("Saved");
        }
        catch(IOException i){
            System.out.println(e);
        }
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
    
}
