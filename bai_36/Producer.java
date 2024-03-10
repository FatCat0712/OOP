public class Producer {
    private String producerName;
    private String country;

    public Producer(String producerName,String country){
        if(!producerName.isEmpty()){
            this.producerName = producerName;
        }
        if(!country.isEmpty()){
            this.country = country;
        }
    }

    public String getProducerName(){
        return this.producerName;
    }
    public String toString(){
        return this.producerName +"-" + this.country;
    }

}
