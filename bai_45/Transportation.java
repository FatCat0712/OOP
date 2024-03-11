public abstract class Transportation {
    protected String transportType;
    protected Manufacturer manufacturer;

    public Transportation(String transportType,Manufacturer manufacturer){
        if(!transportType.isEmpty()){
            this.transportType = transportType;
        }
        this.manufacturer = manufacturer;
    }

    public String getManuName() {
        return manufacturer.getBrandName();
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void start(){
        System.out.println("Starting ... ");;
    }

    public void speedup(){
        System.out.println("Speeding up ...");
    }

    public void stop(){
        System.out.println("Stop !");
    }

    public abstract double getSpeed();
}
