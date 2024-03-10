public class Movie {
    private String movieName;
    private int yearOfProduction;
    private Producer producer;
    private double ticketPrice;
    private MyDate dateOfRelease;

    public Movie(String name, int year,Producer producer, double price,MyDate date){
        if(!name.isEmpty()){
            this.movieName = name;
        }
        if(year >= 1){
            this.yearOfProduction = year;
        }
        this.producer = producer;
        if(price > 1){
            this.ticketPrice = price;
        }
        this.dateOfRelease = date;
    }

    public String getMovieName(){
        return this.movieName;
    }

    public void setMovieName(String name){
        if(!name.isEmpty()){
            this.movieName = name;
        }
    }

    public int getYearOfProduction(){
        return yearOfProduction;
    }

    public void setYearOfProduction(int year){
        if(year >= 1){
            this.yearOfProduction = year;
        }
    }

    public String getProducer(){
        return this.producer.toString();
    }

    public void setProducer(Producer producer){
        this.producer = producer;
    }

    public double getTicketPrice(){
        return ticketPrice;
    }

    public void setTicketPrice(double price){
        if(price >= 1){
            this.ticketPrice = price;
        }
    }

    public String getDateOfRelease(){
        return this.dateOfRelease.toString();
    }

    public void setDateOfRelease(MyDate date){
        this.dateOfRelease = date;
    }

    public boolean isCheaper(Movie other){
        return other.ticketPrice > this.ticketPrice;
    }

    public String printProducerName(){
        return this.producer.getProducerName();
    }

    public double ticketPriceDiscount(int x){
        return ticketPrice * (1 - (double)x/100);
    }
}
