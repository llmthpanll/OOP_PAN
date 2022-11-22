package lab02;

import java.io.*;
import java.util.*;
public class BookModel {
    private Book book;
//    private ArrayList books = new <Book> ArrayList();
    private ArrayList books = new <Book> ArrayList();
    public BookModel(){
        
    }

    public boolean loadData(){
        ArrayList<Book> bookshow = new <Book> ArrayList();
        File f = new File("dataBook.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("dataBook.dat");
                 ObjectInputStream in = new ObjectInputStream(fin);){
                bookshow = (ArrayList<Book>) in.readObject();
                System.out.println("Books list has loaded.");
                return true;
            } catch (Exception i) {
                return false;
            }
        }
        return false;
    }

    public boolean saveData(){
        try(FileOutputStream fOut = new FileOutputStream("dataBook.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(books);
            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public void setBooktoarray(String name, double price, String type){
        Book newbook = new Book(name, price, type);
        this.books.add(newbook);
    }
}
