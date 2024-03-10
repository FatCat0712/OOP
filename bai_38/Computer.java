public class Computer {
    private Manufacturer manuBrand;
    private MyDate manuDate;
    private double price;
    private int warrantyTime;

    public Computer(Manufacturer manuBrand, MyDate manuDate, double price, int warrantyTime) {
        this.manuBrand = manuBrand;
        this.manuDate = manuDate;
        if(price >= 0){
            this.price = price;
        }
        if(warrantyTime >= 1){
            this.warrantyTime = warrantyTime;
        }
    }

    public Manufacturer getManuBrand() {
        return manuBrand;
    }

    public void setManuBrand(Manufacturer manuBrand) {
        this.manuBrand = manuBrand;
    }

    public MyDate getManuDate() {
        return manuDate;
    }

    public void setManuDate(MyDate manuDate) {
        this.manuDate = manuDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0){
            this.price = price;
        }

    }

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(int warrantyTime) {
        if(warrantyTime >= 1){
            this.warrantyTime = warrantyTime;
        }
    }

    public boolean checkIfCheaper(Computer other){
        return this.getPrice() < other.getPrice();
    }

    public String getManuCountry(){
        return manuBrand.getBrandCountry();
    }
}
