public abstract class Geometry {
    protected Coordinate coordinate;

    public Geometry(Coordinate coordinate){
        this.coordinate = coordinate;
    }
    public Coordinate getCoordinate(){
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate){
        this.coordinate = coordinate;
    }
    public abstract double perimeter();
    public abstract double area();
}
