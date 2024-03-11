public class Test {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Boeing","USA");
        Manufacturer m2 = new Manufacturer("Mercedes","Germany");
        Manufacturer m3 = new Manufacturer("Martin","Vietnam");

        System.out.println("-- Testing Airplane --");
        Airplane a1 = new Airplane(m1,"oil");
        System.out.println(a1.getManuName());
        a1.start();
        a1.speedup();
        a1.takeOff();
        a1.land();
        a1.stop();

        System.out.println();
        System.out.println();

        System.out.println("-- Testing Car --");
        Car c1 = new Car(m2,"oil");
        System.out.println(c1.getManuName());
        c1.start();
        c1.speedup();
        c1.stop();
        System.out.println(c1.getSpeed());

        System.out.println();
        System.out.println();
        System.out.println("-- Testing Bicycle --");
        Bicycle b1 = new Bicycle(m3);
        System.out.println(b1.getManuName());
        b1.start();
        b1.speedup();
        b1.stop();
        System.out.println(b1.getSpeed());



    }
}
