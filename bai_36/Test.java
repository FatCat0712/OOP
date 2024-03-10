public class Test {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30,4,1975);
        MyDate date2 = new MyDate(1,5,1975);

        Producer pr1 = new Producer("Tran Thanh","Viet Nam");
        Producer pr2 = new Producer("Truong Giang","Viet Nam");

        Movie mv1 = new Movie("Piano",2013,pr1,25,date1);
        Movie mv2 = new Movie("Vietnam War",2020,pr2,50,date2);

        System.out.println(mv1.isCheaper(mv1));
        System.out.println(mv1.isCheaper(mv2));

        System.out.println(mv1.printProducerName());
        System.out.println(mv2.getProducer());

        System.out.println(mv1.ticketPriceDiscount(10));
        System.out.println(mv2.ticketPriceDiscount(20));
    }
}
