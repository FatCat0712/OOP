public class InsertionSort implements Sorting{
    public void increasingSorting(double[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] <= arr[j-1]){
                double temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    @Override
    public void decreasingSorting(double[] arr) {
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] > arr[j-1]){
                double temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
