package exercisebookmanager;

import javax.swing.plaf.basic.BasicBorders;
import java.lang.management.BufferPoolMXBean;
import java.util.ArrayList;
import java.util.Arrays;

public class BookManager {
    private ArrayList<Book> bookList;

    public BookManager(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void getBookList() {
        for (Book b: bookList){
            System.out.println(b.toString());
        }
    }


    public void addBook(Book b){
        bookList.add(b);
    }

    public void deleteBook(Book b){
        bookList.remove(b);
    }

    public int findBook(Book b){
        return bookList.indexOf(b);
    }

    public double totalPriceOfTextBook(){
        double totalPrice = 0;
        for (Book book : bookList) {
            if (book.getType().equals("TextBook")) {
                totalPrice += book.totalPrice();
            }
        }
        return totalPrice;
    }

    public double totalPriceOfReferenceBook(){
        double totalPrice = 0;
        for(Book book: bookList){
            if(book.getType().equals("ReferenceBook")){
                totalPrice += book.totalPrice();
            }
        }
        return totalPrice;
    }

    public double averagePriceOfReferenceBook(){
        int count = 0;
        for(Book book: bookList){
            if(book.getType().equals("ReferenceBook")){
                count++;
            }
        }
        return totalPriceOfReferenceBook() / count;
    }

    public void printTextBookOfPublisher(String publisher){
        ArrayList<Book> result = new ArrayList<>();
        for(Book book: bookList){
            if(book.getType().equals("TextBook") && book.getPublisher().equals(publisher)){
                result.add(book);
            }
        }
        for(Book b: result){
            System.out.println(b.toString());
        }
    }




}
