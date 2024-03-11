public class Bicycle extends Transportation{
    public Bicycle(Manufacturer manufacturer){
        super("Bicycle",manufacturer);
    }

    public double getSpeed(){
        return 10;
    }
}
