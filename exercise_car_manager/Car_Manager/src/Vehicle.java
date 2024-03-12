
public class Vehicle {
    private double price;
    private double cylinderCapacity;
    private String carID,owner;


    public Vehicle(String carID,double price, double cylinderCapacity,String owner){
        if(price > 0 && cylinderCapacity > 0){
            this.price = price;
            this.cylinderCapacity = cylinderCapacity;
        }
        this.carID = carID;
        this.owner = owner;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 1){
            this.price = price;
        }

    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        if(cylinderCapacity > 1){
            this.cylinderCapacity = cylinderCapacity;
        }

    }

    public double tax(){
        double result = 0;
        if(this.cylinderCapacity < 100){
            result = price * (double)1/100;
        }
        else if(this.cylinderCapacity >= 100 && this.cylinderCapacity <= 200){
            result = price * (double)3/100;
        }
        else if(this.cylinderCapacity > 200){
            result = price * (double)5/100;
        }
        return  result;
    }

    public String toString(){
        return carID + "-" + cylinderCapacity + "-" + owner +"-"+tax();
    }

    public void inThue(){
        System.out.printf("%5s%10.2f%10.2f%5s",carID,price,price,owner);
    }
}
