
import java.io.*;
import java.util.*;

public class BookModel {

    private Book book;
    private ArrayList books = new <Book> ArrayList();
    private int currentPage; // Default of page num is always start at 0

    public BookModel() {
        books = this.loadBooks(); // Set arraylist for books
        // this.printBooks();
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void decreasePage() {
        if (this.getCurrentPage() - 1 < 0) {
            return;
        }
        this.currentPage = currentPage - 1;
    }

    public void increasePage() {
        if (this.getCurrentPage() + 1 > this.getBooksAmount()) {
            return;
        }
        this.currentPage = currentPage + 1;
    }

    public void insertBook(String name, double price, String type) {
        Book newBook = new Book(name, price, type);
        insertBook(newBook);
    }

    public void insertBook(Book book) {
        this.books.add(book);
    }

    public Book getBook(int index) {
        return (Book) this.books.get(index);
    }

    public int getBooksAmount() {
        return books.size();
    }

    public boolean removeBook(int index) {

        System.out.println("Index to remove : " + index);

        try {
            books.remove(index);
            return true;
        } catch (Exception err) {
            System.out.println("ERR : " + err.getMessage());
            return false;
        }
    }

    public boolean removeBook(Book book) {
        try {
            books.remove(book);
            return true;
        } catch (Exception err) {
            System.out.println("ERR : " + err.getMessage());
            return false;
        }
    }

    public void printBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book eachBook = (Book) books.get(i);
            System.out.println("Book : " + i);
            System.out.println("Book name : " + eachBook.getName());
            System.out.println("Book price : " + eachBook.getPrice());
            System.out.println("Book type: " + eachBook.getType());
            System.out.println("----------");
        }
    }

    public boolean saveBooks() {
        try ( FileOutputStream fOut = new FileOutputStream("books-list.dat")) {
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);
            objOut.writeObject(books);
            System.out.println("Books list has saved.");
            return true;
        } catch (IOException err) {
            System.out.println("ERR : " + err.getMessage());
            return false;
        }
    }

    public ArrayList<Book> loadBooks() {
        ArrayList<Book> books = new <Book> ArrayList();

        try ( FileInputStream fIn = new FileInputStream("books-list.dat")) {
            ObjectInputStream objIn = new ObjectInputStream(fIn);
            books = (ArrayList<Book>) objIn.readObject();
            System.out.println("Books list has loaded.");

            return books;
        } catch (Exception err) {
            System.out.println("ERR : " + err.getMessage());
            return books;
        }
    }

    public void updateBook(String name, double price, String type, int currentPage) {
        int indexToUpdate = currentPage - 1;
        this.books.set(indexToUpdate, new Book(name, price, type));
    }
}
