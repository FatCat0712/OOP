public class Airplane extends Transportation{
    private String fuel;

    public Airplane(Manufacturer manufacturer,String  fuel){
        super("Airplane",manufacturer);
        if(!fuel.isEmpty()){
            this.fuel = fuel;
        }
    }

    public double getSpeed(){
        return 1200;
    }

    public void takeOff(){
        System.out.println("Taking off ...");
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if(!fuel.isEmpty()){
            this.fuel = fuel;
        }
    }

    public void land(){
        System.out.println("Landing .... ");
    }


}
