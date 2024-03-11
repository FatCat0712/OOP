public class Test {
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(1,2);
        Coordinate c2 = new Coordinate(2,3);
        Coordinate c3 = new Coordinate(3,4);

        //Geometry g1 = new Geometry(c1); => lỗi do lớp abstract không thể khởi tạo Object
        System.out.println("-- Test point --");
        Point p1 = new Point(c1);
        System.out.println(p1.getCoordinate());
        System.out.println(p1.perimeter());
        System.out.println(p1.area());

        System.out.println("-- Test Rectangle --");
        Rectangle r1 = new Rectangle(c2,3,4);
        System.out.println(r1.getCoordinate());
        System.out.println(r1.perimeter());
        System.out.println(r1.area());

        System.out.println("-- Test Circle");
        Circle ci1 = new Circle(c3,2);
        System.out.println(ci1.getCoordinate());
        System.out.printf("%.2f",ci1.perimeter());
        System.out.println();
        System.out.printf("%.2f",ci1.area());

        System.out.println();
        System.out.println();

        Geometry h1 = new Rectangle(c3,1,2);
        System.out.println(h1.perimeter());
        System.out.println(h1.area());

    }
}
