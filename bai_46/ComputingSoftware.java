public class ComputingSoftware implements Caculator,Sorting {
    public double sum(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Cannot divide by 0");
        }
        return a/b;
    }

    @Override
    public void increasingSorting(double[] arr) {
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while (j > 0 && arr[j] <= arr[j-1]){
                double temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
        }
    }

    public void decreasingSorting(double[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int i_max = i;
            double vt_max = arr[i];
            for(int j = i; j < arr.length; j++){
                if(arr[j] > vt_max){
                    i_max = j;
                    vt_max = arr[j];
                }
            }
            double temp = arr[i];
            arr[i] = arr[i_max];
            arr[i_max] = temp;
        }
    }
}
