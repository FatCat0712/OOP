public class Test {
    public static void main(String[] args) {
        Coffee bill1 = new Coffee("Trung Nguyen Legend",100000,10);
        Coffee bill2 = new Coffee("Vina",120000,13);

        System.out.println("Total Price Bill 1: "+bill1.calculateTotalPrice());
        System.out.println("Total Price Bill 2: "+bill2.calculateTotalPrice());

        System.out.println("totalWeight of bill 1 is greater than 3 kg: "+bill1.checkWeightIsGreater(3));
        System.out.println("totalWeight of bill 2 is greater than 3 kg: "+bill2.checkWeightIsGreater(3));

        System.out.println("TotalPrice of bill 1 is higher than 500000vnd: "+ bill1.checkTotalPriceIsGreater());
        System.out.println("TotalPrice of bill 2 is higher than 500000vnd: "+ bill2.checkTotalPriceIsGreater());

        System.out.println("Discount Price for bill 1: "+ bill1.calculateDiscountPrice(20));
        System.out.println("Discount Price for bill 2: "+ bill2.calculateDiscountPrice(20));

        System.out.println("Price after discount of bill 1: "+ bill1.calculatePriceAfterDiscount(20));
        System.out.println("Price after discount of bill 2: "+ bill2.calculatePriceAfterDiscount(20));



    }
}
