import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Country c1 = new Country("Vietnam","VN");
        Country c2 = new Country("America","USA");
        Country c3 = new Country("China","CN");

        Manufacturer m1 = new Manufacturer("Lenovo",c1);
        Manufacturer m2 = new Manufacturer("Dell",c2);
        Manufacturer m3 = new Manufacturer("IBM",c3);

        MyDate date1 = new MyDate(7,12,2002);
        MyDate date2 = new MyDate(8,4,1999);
        MyDate date3 = new MyDate(19,7,1995);

        Computer com1 = new Computer(m1,date1,1000,36);
        Computer com2 = new Computer(m2,date2,1500,12);
        Computer com3 = new Computer(m3,date3,2000,36);

        System.out.println(com1.checkIfCheaper(com2));
        System.out.println(com2.checkIfCheaper(com3));
        System.out.println(com3.checkIfCheaper(com2));

        System.out.println(m1.getBrandCountry());
        System.out.println(m2.getBrandCountry());
        System.out.println(m3.getBrandCountry());




    }
}
