package exercisebookmanager;

public class ReferenceBook extends Book{

    private double tax;

    public ReferenceBook(String bookCode,String type, MyDate importDate, double unitPrice, int numberOfBooks, String publisher, double tax) {
        super(bookCode, type,importDate, unitPrice, numberOfBooks, publisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public double totalPrice(){
        return this.getUnitPrice() * this.getNumberOfBooks() * this.getTax();
    }
}
