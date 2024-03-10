package exercisebookmanager;

public abstract class Book {
    private String bookCode;
    private String type;
    private MyDate importDate;
    private double unitPrice;
    private int numberOfBooks;
    private String publisher;




    public Book(String bookCode, String type, MyDate importDate, double unitPrice, int numberOfBooks, String publisher) {
        if(!bookCode.isEmpty()){
            this.bookCode = bookCode;
        }
        if(!type.isEmpty()){
            this.type = type;
        }
        this.importDate = importDate;
        if(unitPrice >= 0){
            this.unitPrice = unitPrice;
        }
        if(numberOfBooks >= 0){
            this.numberOfBooks = numberOfBooks;
        }
        if(!publisher.isEmpty()){
            this.publisher = publisher;
        }

    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        if(!bookCode.isEmpty()){
            this.bookCode = bookCode;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!type.isEmpty()){
            this.type = type;
        }
    }
    public MyDate getImportDate() {
        return importDate;
    }

    public void setImportDate(MyDate importDate) {
        this.importDate = importDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice >= 0){
            this.unitPrice = unitPrice;
        }
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        if(numberOfBooks >= 0){
            this.numberOfBooks = numberOfBooks;
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if(!publisher.isEmpty()){
            this.publisher = publisher;
        }
    }

    public abstract double totalPrice();
    @Override
    public String toString() {
        return "bookCode= " + bookCode +
                ",importDate= " + importDate
                + ",unitPrice= " + unitPrice
                + ",numberOfBooks= " + numberOfBooks
                + ", publisher= " + publisher;
    }
}
