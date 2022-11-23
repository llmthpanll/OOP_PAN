import java.util.*;
import java.io.*;
public class BookModel {
    private Book book = new Book("", 0, "");
    private ArrayList books = new ArrayList();
    
    public BookModel(){
        books.add(this.book);
    }
    
    public void addBook(Book book){
        if(!books.contains(book)){
            books.add(book);
        }
    }

    public ArrayList getBooks() {
        return books;
    }

    public void setBooks(ArrayList books) {
        this.books = books;
    }
    
    public void loadFile(){
        try(FileInputStream fin = new FileInputStream("Book.dat");
            ObjectInputStream in = new ObjectInputStream(fin);){
            try{
               setBooks((ArrayList) in.readObject()); 
            }catch(Exception e){
                System.out.print(e);
            }
        }catch(IOException e){
            System.out.print(e);
        }
    }
    
    public void saveFile(){
        try(FileOutputStream fOut = new FileOutputStream("Book.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);){
            oout.writeObject((ArrayList)(getBooks()));
        }catch(IOException e){
            System.out.print(e);
        }
    }
}
