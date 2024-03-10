package bookmanager;

public class Book {
    private String bookName;
    private double bookPrice;
    private int yeaOfPublication;

    private Author bookAuthor;

    public Book(String name, double price, int year,Author author){
        if(!name.isEmpty()){
            this.bookName = name;
        }
        if(price >= 0){
            this.bookPrice = price;
        }
        else{
            this.bookPrice = 0;
        }
        if(year >= 1){
            this.yeaOfPublication = year;
        }
        else{
            this.yeaOfPublication = 1;
        }
        this.bookAuthor = author;
    }

    public String getBookName(){
        return this.bookName;
    }

    public void setBookName(String name){
        if(!name.isEmpty()){
            this.bookName = name;
        }
    }

    public double getBookPrice(){
        return this.bookPrice;
    }

    public void setBookPrice(double price){
        if(price >= 0){
            this.bookPrice = price;
        }
    }

    public int getYeaOfPublication(){
        return yeaOfPublication;
    }

    public void setYeaOfPublication(int y){
        if(y >= 1){
            this.yeaOfPublication = y;
        }
    }

    public String getBookAuthor(){
        return this.bookAuthor.toString();
    }

    public void setBookAuthor(Author a){
        this.bookAuthor = a;
    }

    public String printBookName(){
        return this.bookName;
    }

    public boolean checkIfPublishedInSameYear(Book other){
        return this.yeaOfPublication == other.yeaOfPublication;
    }

    public double priceAfterDiscount(double x){

        if(x > 0){
            return this.bookPrice - (this.bookPrice * x/ 100);
        }
        else{
            return this.bookPrice;
        }

    }


}
