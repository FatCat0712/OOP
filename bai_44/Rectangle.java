public class Rectangle extends Geometry {
    private double width;
    private double length;

    public Rectangle(Coordinate coordinate,double width,double length){
        super(coordinate);
        if(width > 0){
            this.width = width;
        }
        if(length > 0){
            this.length = length;
        }
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        if(width > 0){
            this.width = width;
        }
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        if(length > 0){
            this.length = length;
        }
    }
    public double perimeter(){
        return (width + length) * 2;
    }

    public double area(){
        return width * length;
    }
}
