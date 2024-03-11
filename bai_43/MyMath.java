public class MyMath {
    public int findMin(int a, int b){
        if(a < b){
            return a;
        }
        else{
            return b;
        }
    }
    public double findMin(double a, double b){
        if(a < b){
            return a;
        }
        else{
            return b;
        }
    }

    public int sum(int a, int b){
        return a + b;
    }

    public double sum(double[] arr){
        double result = 0;
        for(double i: arr){
            result += i;
        }
        return result;
    }


}
