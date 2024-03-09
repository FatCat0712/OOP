public class Test {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(7,12,2002);
        MyDate date2 = new MyDate(5,11,2002);
        MyDate date3 = new MyDate(7,12,2002);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println(date1.equals(date2));
        System.out.println(date1.equals(date3));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
        System.out.println(date3.hashCode());





    }
}
