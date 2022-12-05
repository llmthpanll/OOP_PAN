
import java.io.*;
import java.util.*;

public class BookModel {

    private Book book = new Book("", 0.0, "");
    private ArrayList<Book> ArrayBook = new ArrayList<Book>();

    public BookModel() {
        ArrayBook.add(this.book);
    }

    public void addBook(Book book) {
        if (!ArrayBook.contains(book)) {
            ArrayBook.add(book);
        }
    }

    public ArrayList getBooks() {
        return ArrayBook;
    }

    public void setBooks(ArrayList ArrayBook) {
        this.ArrayBook = ArrayBook;
    }

    public void loadFile() {
        try ( FileInputStream fin = new FileInputStream("Book.dat");  ObjectInputStream in = new ObjectInputStream(fin);) {
            try {
                setBooks((ArrayList) in.readObject()); // get arraylist in .dat to arraylist
                System.out.println("load");
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    public void saveFile() {
        try ( FileOutputStream fOut = new FileOutputStream("Book.dat");  ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject((ArrayList) (getBooks())); //get arraylist
            System.out.println("save");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
