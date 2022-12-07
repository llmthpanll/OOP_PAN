/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author windows
 */
import java.util.*;
import java.io.*;
public class BookModel implements Serializable{
    private ArrayList <Book> page;
    private int numberOfPage = 0;
    private int now = 0;
    public BookModel(){
        page = new ArrayList();
    }
    public void addPage(Book page){
        this.page.add(page);
        numberOfPage++;
    }
    public Book getPage(int i){
        try{
            if(i < 1){
                return this.page.get(0);
            }
            else if(i > numberOfPage){
                return this.page.get(numberOfPage-1);  
            }
            return this.page.get(i-1);
            }
        catch(IndexOutOfBoundsException e){
            System.out.println("No Page Found");
            return null;
        }
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
    
    public int getNumberOfPage(){
        return numberOfPage;
    }

    public int getNow() {
        if (numberOfPage == 0){
            return 0;
        }
        if (now < 1){
            return 1;
        }
        else if(now > numberOfPage){
            return numberOfPage;
        }
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }
    
    public void removePage(int i){
        this.page.remove(i-1);
        numberOfPage -= 1;
    }
    public void updatePage(String name, double price, String type){
        this.page.get(getNow()-1).setName(name);
        this.page.get(getNow()-1).setPrice(price);
        this.page.get(getNow()-1).setType(type);
    }
    public ArrayList getData(){
        return page;
    }
    public void setData(ArrayList page){
        this.page = page;
    }
}
