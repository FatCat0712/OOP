public class Test {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(-1,10,-1999);
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());

        date1.setDay(7);
        date1.setMonth(12);
        date1.setYear(2002);

        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());


        date1.setDay(50);
        date1.setMonth(5);
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
    }
}
