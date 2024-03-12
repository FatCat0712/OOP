package code;

public class Infor {
    private int a;
    int b;
    protected int c;
    public int d;

    public void method(){
        this.a = 1; // => access due to same class
        this.b = 2; // => access due to same class
        this.c = 3; // => access due to same class
        this.d = 4; // => access due to same class
    }
}
