public class Test {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(7,12,2002);

        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());

        date1.setDay(-1);
        date1.setMonth(1);
        date1.setYear(1999);

        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());

        System.out.println(date1);
    }
}
