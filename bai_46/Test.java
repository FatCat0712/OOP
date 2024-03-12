import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("--- Testing CasioFX500 ---");
        CasioFX500 cal1 = new CasioFX500();
        System.out.println(cal1.sum(1,2));
        System.out.println(cal1.subtract(1,2));
        System.out.println(cal1.multiply(1,2));
        try {
            System.out.println(cal1.divide(1,0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println();


        System.out.println("--- Testing VinaCalMS500 --");
        VinaCal500MS cal2 = new VinaCal500MS();
        System.out.println(cal2.sum(2,4));
        System.out.println(cal2.subtract(2,4));
        System.out.println(cal2.multiply(2,4));
        try {
            System.out.println(cal2.divide(2,0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println();

        System.out.println("--Testing Insertion Sort ---");
        double[] arr = {9,8,7,6,5};
        InsertionSort is = new InsertionSort();
        is.increasingSorting(arr);
        System.out.println(Arrays.toString(arr));

        is.decreasingSorting(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println();


        System.out.println("-- Testing Selection Sort ---");
        double[] arr1 = {7,12,2,20,3};
        SelectionSort ss = new SelectionSort();
        ss.increasingSorting(arr1);
        System.out.println(Arrays.toString(arr1));

        ss.decreasingSorting(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        System.out.println();
        System.out.println("-- Testing Computing Software ---");
        ComputingSoftware cs = new ComputingSoftware();
        System.out.println(cs.sum(7,2));
        System.out.println(cs.subtract(7,2));
        System.out.println(cs.multiply(7,2));
        try {
            System.out.println(cs.divide(7,0));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        double[] arr2 = {0,9,6,9,8,0,9};
        cs.increasingSorting(arr2);
        System.out.println(Arrays.toString(arr2));

        cs.decreasingSorting(arr2);
        System.out.println(Arrays.toString(arr2));





    }
}
