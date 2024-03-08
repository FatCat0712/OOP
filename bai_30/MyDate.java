public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void printTheNextDay(){
        System.out.println("The next day: "+ this.day + 1);
    }

    public void printDay(){
        System.out.println("Day: " + this.day);
    }
    public void printMonth(){
        System.out.println("Month: "+this.month);
    }

    public void printYear(){
        System.out.println("Year: "+ this.year);
    }

    public void printDate(){
        System.out.println("Date: "+ this.year + "-" + this.month + "-"+this.day);
    }
}
