package exercisebookmanager;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        BookManager bm = new BookManager(new ArrayList<Book>());

        MyDate date1 = new MyDate(7,12,2002);
        MyDate date2 = new MyDate(4,8,2002);
        MyDate date3 = new MyDate(5,11,2002);
        MyDate date4 = new MyDate(15,4,2002);



        Book b1 = new ReferenceBook("R1","ReferenceBook",date1,5,10,"hai1",5.5);
        Book b2 = new TextBook("T2","TextBook",date2,15,10,"hai2",true);
        Book b3 = new ReferenceBook("R3","ReferenceBook",date3,20,10,"hai3",5.5);
        Book b4 = new TextBook("T4","TextBook",date4,25,10,"hai2",false);

        bm.addBook(b1);
        bm.addBook(b2);
        bm.addBook(b3);
        bm.addBook(b4);

        bm.getBookList();

        System.out.println(bm.totalPriceOfTextBook());
        System.out.println(bm.totalPriceOfReferenceBook());
        System.out.println(bm.averagePriceOfReferenceBook());
        bm.printTextBookOfPublisher("hai2");



    }
}
