public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y){
        if(d >= 1 && d <= 31){
            this.day = d;
        }
        else{
            this.day = 1;
        }
        if(m >= 1 && m <= 12){
            this.month = m;
        }
        else{
            this.month = 1;
        }
        if(y >= 1){
            this.year = y;
        }
        else{
            this.year = 1;
        }
    }

    public int getDay(){
        return this.day;
    }

    public  void setDay(int d){
        if(d >= 1 && d <= 31){
            this.day = d;
        }
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int m){
        if(m >= 1 && m <= 12){
            this.month = m;
        }
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int y){
        if(y >= 1){
            this.year = y;
        }
    }

    public String toString(){
        return this.year + "-" + this.month + "-" + this.day;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        MyDate other = (MyDate) obj;
        if(this.day != other.day)
            return false;
        if(this.month != other.month)
            return false;
        if(this.year != other.year)
            return false;
        return  true;
    }

    public int hashCode(){
        int result = 31;
        result = result + this.day;
        result = result + this.month;
        result = result + this.year;
        return  result;
    }
}
