public class Coffee {
    private String categoryName;
    private double unitPrice;
    private double totalWeight;

    public Coffee(String name, double price, double weight){
        this.categoryName = name;
        this.unitPrice = price;
        this.totalWeight = weight;
    }

    public double calculateTotalPrice(){
        return unitPrice * totalWeight;
    }

    public boolean checkWeightIsGreater(double weight){
        return totalWeight > weight;
    }

    public boolean checkTotalPriceIsGreater(){
        return calculateTotalPrice() >= 500000;
    }

    public double calculateDiscountPrice(int x){
        if(calculateTotalPrice() >= 500000){
            return calculateTotalPrice() * (double) x / 100;
        }
        else{
            return 0;
        }
    }

    public double calculatePriceAfterDiscount(int x){
        return calculateTotalPrice() - calculateDiscountPrice(x);
    }
}
