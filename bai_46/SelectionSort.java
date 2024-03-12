import java.util.Arrays;

public class SelectionSort implements Sorting{
    public void increasingSorting(double[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int i_min = i;
            double v_min = arr[i];
            for(int j = i; j < arr.length; j++){
                if(arr[j] < v_min){
                    i_min = j;
                    v_min = arr[j];
                }

            }
            double temp = arr[i];
            arr[i] = arr[i_min];
            arr[i_min] = temp;

        }
    }
    @Override
    public void decreasingSorting(double[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int i_max = i;
            double v_max = arr[i];
            for(int j = i; j < arr.length; j++){
                if(arr[j] > v_max){
                    i_max = j;
                }
            }
            double temp = arr[i];
                    arr[i] = arr[i_max];
                    arr[i_max]  = temp;
        }
    }

}
