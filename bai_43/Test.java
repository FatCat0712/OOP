public class Test {
    public static void main(String[] args) {
        MyMath m1 = new MyMath();
        System.out.println(m1.findMin(1,2));
        System.out.println(m1.findMin(5.5,6));
        System.out.println(m1.sum(1,2));

        double[] arr = {1,2,3,4,5};
        System.out.println(m1.sum(arr));

    }
}
