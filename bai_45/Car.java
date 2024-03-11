public class Car extends Transportation{
    private String fuel;

    public Car(Manufacturer manufacturer,String fuel){
        super("Car",manufacturer);
        if(!fuel.isEmpty()){
            this.fuel = fuel;
        }
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if(!fuel.isEmpty()){
            this.fuel = fuel;
        }
    }

    public double getSpeed(){
        return 100;
    }
}
