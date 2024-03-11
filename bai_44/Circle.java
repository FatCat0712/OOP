public class Circle extends Geometry {
    private double radius;

    public Circle(Coordinate coordinate,double radius){
        super(coordinate);
        if(radius > 0){
            this.radius = radius;
        }
    }

    public double perimeter(){
        return radius * 2 * Math.PI;
    }

    public double area(){
        return radius * radius * Math.PI;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }
    }
}
