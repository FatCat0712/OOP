public class CasioFX500 implements Caculator{
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
}
