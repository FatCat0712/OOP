package bookmanager;

public class Test {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(31,7,1965);
        Author author1 = new Author("J.K.Rowling",date1);
        Book book1 = new Book("Harry Potter",50.5,2002,author1);

        MyDate date2 = new MyDate(7,12,2002);
        Author author2 = new Author("",date2);
        Book book2 = new Book("The Fraud",50.5,2002,author2);


        date1.setDay(2);
        System.out.println(date1);

        System.out.println(book1.getBookName());
        System.out.println(book1.checkIfPublishedInSameYear(book1));
        System.out.println(book1.checkIfPublishedInSameYear(book2));
        System.out.println(book1.priceAfterDiscount(10));
        System.out.println(book2.priceAfterDiscount(10));
    }
}
