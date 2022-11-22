import java.io.*;
import java.util.*;
public class BookModel {
    private Book data;
    private ArrayList<Book> book;
    public BookModel(){
        data = new Book("", 0.0, "");
    }

    public boolean loadData(){
        File f = new File("dataBook.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("dataBook.dat");
                 ObjectInputStream in = new ObjectInputStream(fin);){
                data = (Book) in.readObject();
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
            oout.writeObject(data);
            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public Book getData() {
        return data;
    }

    public void setData(Book data) {
        this.data = data;
    }
}
